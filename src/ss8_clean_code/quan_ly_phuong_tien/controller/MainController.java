package ss8_clean_code.quan_ly_phuong_tien.controller;

import ss8_clean_code.quan_ly_phuong_tien.view.AddNewVehicleView;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        while (true) {
            displayMainMenu();
        }
    }

    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG --------------------");
        System.out.println("Chọn chức năng");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                AddNewVehicleController.displayAddNewVehicleView();
                break;
            case 2:
                DisplayVehicleController.displayVehicles();
                break;
            case 3:
                RemoveVehicleController.deleteVehicle();
                break;
            case 4:
                System.out.println("Thoát thành công!");
                System.exit(0);
                return;
            default:
                System.out.println("Không có lựa chọn này trong menu mời bạn nhập lại!");
                break;
        }
    }
}
