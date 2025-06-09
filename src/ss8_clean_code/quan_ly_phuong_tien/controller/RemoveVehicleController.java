package ss8_clean_code.quan_ly_phuong_tien.controller;


import ss8_clean_code.quan_ly_phuong_tien.entity.Vehicle;
import ss8_clean_code.quan_ly_phuong_tien.view.RemoveVehicleView;

import java.util.Scanner;

import static ss8_clean_code.quan_ly_phuong_tien.controller.AddNewVehicleController.vehicleService;

public class RemoveVehicleController {
    public static void deleteVehicle() {
        Scanner sc = new Scanner(System.in);
        String licensePlate = RemoveVehicleView.displayRemoveVehicleView();
        Vehicle vehicle = vehicleService.checkVehicle(licensePlate);
        if (vehicle != null) {
            System.out.println("Bạn có chắc muốn xóa phương tiện có biển số " + licensePlate + " không");
            System.out.println("1. YES");
            System.out.println("2. NO");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                vehicleService.delelteVehicle(vehicle);
                System.out.println("Xóa thành công");
            } else if (choice == 2) {
                return;
            } else {
                System.out.println("Không có lựa chọn trên");
                return;
            }
        } else {
            System.out.println("Không tìm thấy xe có biển số "+ licensePlate);
        }
    }
}
