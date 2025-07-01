package case_study.student_management.controller;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;
import case_study.student_management.model.service.IStudentService;
import case_study.student_management.model.service.StudentService;
import case_study.student_management.view.StudentView;

import java.util.List;

public class StudentController {
    private static final int ADD_OFFICIAL_STUDENT = 1;
    private static final int ADD_TRIAL_STUDENT = 2;
    private static final int EXIT_ADD_MENU = 3;

    private static final int DISPLAY_OFFICIAL_STUDENT = 1;
    private static final int DISPLAY_TRIAL_STUDENT = 2;
    private static final int DISPLAY_ALL_STUDENT = 3;
    private static final int EXIT_DISPLAY_MENU = 4;

    private StudentView studentView = new StudentView();
    private IStudentService studentService = new StudentService();
    public void displayMenuAddStudent() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = studentView.displayAddStudentMenu();
            switch (choice) {
                case ADD_OFFICIAL_STUDENT:
                    OfficialStudent officialStudent = studentView.inputOfficialStudent();
                    studentService.addStudent(officialStudent);
                    System.out.println("Thêm học viên chính thức thành công!");
                    break;
                case ADD_TRIAL_STUDENT:
                    TrialStudent trialStudent = studentView.inputTrialStudent();
                    studentService.addStudent(trialStudent);
                    System.out.println("Thêm ô tô thành công!");
                    break;
                case EXIT_ADD_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }

    public void displayMenuDisplayStudent() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = studentView.displayMenuDisplayStudent();
            switch (choice) {
                case DISPLAY_OFFICIAL_STUDENT:
                    List<OfficialStudent> officialStudents = studentService.getAllOfficialStudents();
                    studentView.displayAllOfficialStudent(officialStudents);
                    break;
                case DISPLAY_TRIAL_STUDENT:
                    List<TrialStudent> trialStudents = studentService.getAllTrialStudents();
                    studentView.displayAllTrialStudent(trialStudents);
                    break;
                case DISPLAY_ALL_STUDENT:
                    List<Student> students = studentService.getAllStudents();
                    studentView.displayAllStudent(students);
                    break;
                case EXIT_DISPLAY_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }
}
