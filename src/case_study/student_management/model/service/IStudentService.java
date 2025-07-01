package case_study.student_management.model.service;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    List<Student> getAllStudents();
    List<OfficialStudent> getAllOfficialStudents();
    List<TrialStudent> getAllTrialStudents();
    boolean deleteStudent(Student student);
    Student findStudentById(String studentID);
    boolean updateStudent(String studentId, Student updatedStudent);
}
