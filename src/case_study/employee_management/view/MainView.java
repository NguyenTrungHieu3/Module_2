package case_study.employee_management.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- QUẢN LÝ NHÂN VIÊN --------------------");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm mới nhân viên");
        System.out.println("2. Hiển thị nhân viên");
        System.out.println("3. Cập nhật nhân viên");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }
}
