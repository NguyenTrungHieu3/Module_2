package case_study.student_management.controller;

import case_study.student_management.model.entity.OfficialStudent;
import case_study.student_management.model.entity.Student;
import case_study.student_management.model.entity.TrialStudent;
import case_study.student_management.model.service.IStudentService;
import case_study.student_management.model.service.StudentService;
import case_study.student_management.view.MainView;
import case_study.student_management.view.StudentView;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainController {
    private static final int ADD_STUDENT = 1;
    private static final int DISPLAY_STUDENT_STUDENT = 2;
    private static final int REMOVE_STUDENT_BY_ID = 3;
    private static final int UPDATE_STUDENT_BY_ID = 4;
    private static final int SEARCH_STUDENT_BY_ID = 5;
    private static final int EXIT = 6;
    private static final int YES = 1;
    private static final int NO = 2;

    private static StudentController studentController = new StudentController();
    private static IStudentService studentService = new StudentService();
    private static StudentView studentView = new StudentView();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = MainView.displayMainMenu();
            switch (choice) {
                case ADD_STUDENT:
                    studentController.displayMenuAddStudent();
                    break;
                case DISPLAY_STUDENT_STUDENT:
                    studentController.displayMenuDisplayStudent();
                    break;
                case REMOVE_STUDENT_BY_ID:
                    System.out.println("========================================");
                    System.out.println("Nhập mã học viên muốn xóa: ");
                    String studentId = sc.nextLine();
                    Student student = studentService.findStudentById(studentId);
                    if (student == null) {
                        System.out.println("Không tồn tại học viên có mã "+studentId+"!");
                    } else {
                        System.out.println("Bạn có chắc muốn xóa học viên có mã " + studentId + " không?");
                        System.out.println("1. Có");
                        System.out.println("2. Không");
                        int subChoice = Integer.parseInt(sc.nextLine());
                        switch (subChoice) {
                            case YES:
                                if (studentService.deleteStudent(student)) {
                                    System.out.println("Xóa học viên thành công!");
                                } else {
                                    System.out.println("Xóa thất bại!");
                                }
                                break;
                            case NO:
                                System.out.println("Nhấn phím bất kỳ để quay lại menu chính: ");
                                sc.nextLine();
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                                break;
                        }
                    }
                    break;
                case UPDATE_STUDENT_BY_ID:
                    boolean isUpdate = false;
                    System.out.println("========================================");
                    System.out.println("Nhập mã học viên muốn cập nhật: ");
                    String updateStudentId = sc.nextLine();
                    Student findUpdateStudent = studentService.findStudentById(updateStudentId);
                    if (findUpdateStudent == null) {
                        System.out.println("Không tồn tại học viên có mã " + updateStudentId + "!");
                    } else {
                        if (findUpdateStudent instanceof OfficialStudent) {
                            OfficialStudent officialStudent = studentView.inputOfficialStudent();
                            studentService.updateStudent(updateStudentId, officialStudent);
                            isUpdate = true;
                        } else if (findUpdateStudent instanceof TrialStudent) {
                            TrialStudent trialStudent = studentView.inputTrialStudent();
                            studentService.updateStudent(updateStudentId, trialStudent);
                            isUpdate = true;
                        }
                    }
                    if (isUpdate) {
                        System.out.println("Cập nhật học viên thành công");
                    } else {
                        System.out.println("Lỗi cập nhật học viên");
                    }
                    break;
                case SEARCH_STUDENT_BY_ID:
                    System.out.println("========================================");
                    System.out.println("Nhập mã học viên muốn tìm: ");
                    String searchStudentID = sc.nextLine();
                    Student searchStudent = studentService.findStudentById(searchStudentID);
                    if (searchStudent == null) {
                        System.out.println("Không tìm thấy học viên có mã " + searchStudentID + "!");
                    } else {
                        System.out.println("Học viên tìm thấy là: ");
                        System.out.println(searchStudent);
                    }
                    break;
                case EXIT:
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
