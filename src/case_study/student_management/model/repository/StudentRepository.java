package case_study.student_management.model.repository;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;
import case_study.student_management.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String OFFICIAL_STUDENT_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\case_study\\student_management\\data\\official_student.csv";
    private final String TRIAL_STUDENT_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\case_study\\student_management\\data\\trial_student.csv";
    private final boolean APPEND = true;

    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void addStudent(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        if (student instanceof OfficialStudent) {
            readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, APPEND);
        } else if (student instanceof TrialStudent) {
            readAndWriteFile.writeListToCSV(TRIAL_STUDENT_PATH_FILE, stringList, APPEND);
        }
    }

    @Override
    public List<OfficialStudent> findAllOfficialStudents() {
        List<String> stringList = readAndWriteFile.readListFromCSV(OFFICIAL_STUDENT_PATH_FILE);
        List<OfficialStudent> officialStudents = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            OfficialStudent officialStudent = new OfficialStudent(array[1], array[2], array[3], array[4], array[5], array[6], Double.parseDouble(array[7]));
            officialStudents.add(officialStudent);
        }
        return officialStudents;
    }



    @Override
    public List<TrialStudent> findAllTrialStudents() {
        List<String> stringList = readAndWriteFile.readListFromCSV(TRIAL_STUDENT_PATH_FILE);
        List<TrialStudent>  trialStudents= new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            TrialStudent trialStudent = new TrialStudent(array[1], array[2], array[3], array[4], array[5], Integer.parseInt(array[6]));
            trialStudents.add(trialStudent);
        }
        return trialStudents;
    }

    @Override
    public boolean deleteOfficialStudent(String officialStudentId) {
        boolean isDeleted = false;
        List<OfficialStudent> officialStudents = findAllOfficialStudents();
        for (OfficialStudent officialStudent : officialStudents) {
            if (officialStudent.getStudentId().equals(officialStudentId)) {
                officialStudents.remove(officialStudent);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (OfficialStudent officialStudent : officialStudents) {
            stringList.add(officialStudent.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean deleteTrialStudent(String trialStudentId) {
        boolean isDeleted = false;
        List<TrialStudent> trialStudents = findAllTrialStudents();
        for (TrialStudent trialStudent : trialStudents) {
            if (trialStudent.getStudentId().equals(trialStudentId)) {
                trialStudents.remove(trialStudent);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (TrialStudent trialStudent : trialStudents) {
            stringList.add(trialStudent.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(TRIAL_STUDENT_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }


    @Override
    public boolean updateOfficialStudent(String officialStudentId, OfficialStudent updateStudent) {
        boolean isUpdated = false;
        List<OfficialStudent> officialStudents = findAllOfficialStudents();
        for (int i = 0; i < officialStudents.size(); i++) {
            if (officialStudents.get(i).getStudentId().equals(officialStudentId)) {
                officialStudents.set(i, updateStudent);
                isUpdated = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (OfficialStudent officialStudent : officialStudents) {
            stringList.add(officialStudent.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(OFFICIAL_STUDENT_PATH_FILE, stringList, !APPEND);
        return isUpdated;
    }

    @Override
    public boolean updateTrialStudent(String trialStudentId, TrialStudent updateTrialStudent) {
        boolean isUpdated = false;
        List<TrialStudent> trialStudents = findAllTrialStudents();
        for (int i = 0; i < trialStudents.size(); i++) {
            if (trialStudents.get(i).getStudentId().equals(trialStudentId)) {
                trialStudents.set(i, updateTrialStudent);
                isUpdated = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (TrialStudent trialStudent : trialStudents) {
            stringList.add(trialStudent.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(TRIAL_STUDENT_PATH_FILE, stringList, !APPEND);
        return isUpdated;
    }
}
