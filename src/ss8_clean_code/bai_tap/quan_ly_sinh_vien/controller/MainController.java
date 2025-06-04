package ss8_clean_code.bai_tap.quan_ly_sinh_vien.controller;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.view.MainView;
import ss8_clean_code.bai_tap.quan_ly_sinh_vien.view.StudentView;

public class MainController {
    public static final int MANAGE_STUDENT = 1;
    public static final int MANAGE_INSTRUCTOR = 2;
    public static final int MANAGE_EMPLOYEE = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        while (true) {
            int choice = MainView.displayMainView();
            switch (choice) {
                case MANAGE_STUDENT:
                    StudentView.displayMenuStudent();
                    break;
                case MANAGE_INSTRUCTOR:
                    System.out.println("Quản lý giáo viên");
                    break;
                case MANAGE_EMPLOYEE:
                    System.out.println("Quản lý nhân viên");
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Không có lựa chọn đó");
                    break;
            }
        }
    }
}
