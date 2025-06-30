package ss17_binary_file_serialization.bai_tap.vehicle_management.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG --------------------");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }

    public static String removeVehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe muốn xóa: ");
        return sc.nextLine();
    }
}
