package ss8_clean_code.bai_tap.quan_ly_sinh_vien.view;

import ss8_clean_code.bai_tap.quan_ly_sinh_vien.controller.StudentController;
import ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static StudentController studentController = new StudentController();
    public static void displayMenuStudent() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------------------------------");
            System.out.println("-------------------- Quản lý sinh viên --------------------");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Quay lại menu chính");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice;
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Student[] students = studentController.findAll();
                    displayStudentList(students);
                    break;
                case 2:
                    Student student = inputStudent();
                    studentController.add(student);
                    System.out.println("Thêm sinh viên thành công!");
                    break;
                case 3:
                    System.out.println("Sửa sinh viên");
                    break;
                case 4:
                    System.out.println("Xóa sinh viên");
                    break;
                case 5:
                    System.out.println("Quay lại menu chính");
                    return;
                default:
                    System.out.println("Lựa chọn trên không tồn tại");
                    break;
            }
        }
    }

    public static Student inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        long code = Long.parseLong(sc.nextLine());

        System.out.println("Nhập tên sinh viên: ");
        String name = sc.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Nhập điểm: ");
        float point = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập tên lớp: ");
        String className = sc.nextLine();

        return new Student(code, name, address, point, className);
    }

    public static void displayStudentList(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
