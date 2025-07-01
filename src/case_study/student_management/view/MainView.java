package case_study.student_management.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== MENU QUẢN LÝ HỌC VIÊN ====================");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm học viên");
        System.out.println("2. Hiển thị danh sách học viên");
        System.out.println("3. Xóa bọc viên theo ID");
        System.out.println("4. Cập nhật thông tin học viên theo ID");
        System.out.println("5. Tìm kiếm học viên theo tên hoặc ID");
        System.out.println("6. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }
}
