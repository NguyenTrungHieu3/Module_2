package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.controller;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.IVehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.VehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view.MainView;

import java.util.Scanner;

public class MainController {
    private static final int ADD = 1;
    private static final int DISPLAY = 2;
    private static final int DELETE = 3;
    private static final int EXIT = 4;

    private static IVehicleService vehicleService = new VehicleService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            int choice = MainView.displayMainMenu();
            switch (choice) {
                case ADD:
                    AddNewVehicleController.addNewVehicle();
                    break;
                case DISPLAY:
                    DisplayVehicleController.displayVehicle();
                    break;
                case DELETE:
                    System.out.println("Nhập biển số xe muốn xóa: ");
                    String bienSo = sc.nextLine();
                    boolean isDeleted =  vehicleService.deleteVehicleById(bienSo);
                    if (isDeleted) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Lỗi xóa!");
                    }
                    break;
                case EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu!");
            }
        }
    }
}
