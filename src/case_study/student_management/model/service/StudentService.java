package case_study.student_management.model.service;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;
import case_study.student_management.model.repository.IStudentRepository;
import case_study.student_management.model.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{


    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public List<OfficialStudent> getAllOfficialStudents() {
        return studentRepository.findAllOfficialStudents();
    }

    @Override
    public List<TrialStudent> getAllTrialStudents() {
        return studentRepository.findAllTrialStudents();
    }

    @Override
    public boolean deleteStudent(Student student) {
        boolean isDeleted = false;
       if (student instanceof OfficialStudent) {
           isDeleted = studentRepository.deleteOfficialStudent(student.getStudentId());
       } else if (student instanceof TrialStudent) {
           isDeleted = studentRepository.deleteTrialStudent(student.getStudentId());
       }
       return isDeleted;
    }

    @Override
    public Student findStudentById(String studentId) {
        List<Student> students = getAllStudents();
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean updateStudent(String studentId, Student updatedStudent) {
        boolean isUpdated = false;
        Student student = findStudentById(studentId);
        if (student instanceof OfficialStudent) {
            isUpdated = studentRepository.updateOfficialStudent(studentId, (OfficialStudent) updatedStudent);
        } else if (student instanceof TrialStudent) {
            isUpdated = studentRepository.updateTrialStudent(studentId, (TrialStudent) updatedStudent);
        }
        return isUpdated;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.addAll(getAllOfficialStudents());
        students.addAll(getAllTrialStudents());
        return students;
    }
}
