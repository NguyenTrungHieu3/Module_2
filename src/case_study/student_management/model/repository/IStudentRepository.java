package case_study.student_management.model.repository;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);
    List<OfficialStudent> findAllOfficialStudents();
    List<TrialStudent> findAllTrialStudents();
    boolean deleteOfficialStudent(String officialStudentId);
    boolean deleteTrialStudent(String trialStudentId);
    boolean updateOfficialStudent(String officialStudentId, OfficialStudent updateStudent);
    boolean updateTrialStudent(String trialStudentId, TrialStudent updateTrialStudent);
}
