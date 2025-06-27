package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.controller;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.IVehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.VehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view.AddNewVehicleView;

public class AddNewVehicleController {
    private static final int ADD_NEW_TRUCK = 1;
    private static final int ADD_NEW_CAR = 2;
    private static final int ADD_NEW_MOTORBIKE = 3;
    private static final int EXIT_ADD_NEW_MENU = 4;
    private static IVehicleService vehicleService = new VehicleService();

    public static void addNewVehicle() {
        boolean exit = false;
        while (!exit) {
            int choice = AddNewVehicleView.displayAddNewVehicleMenu();
            switch (choice) {
                case ADD_NEW_TRUCK:
                    XeTai xeTai = AddNewVehicleView.inputXeTai();
                    vehicleService.addXeTai(xeTai);
                    System.out.println("Thêm mới xe tải thành công!");
                    exit = true;
                    break;
                case ADD_NEW_CAR:
                    OTo oto = AddNewVehicleView.inputOTo();
                    vehicleService.addOTo(oto);
                    System.out.println("Thêm mới ô tô thành công!");
                    exit = true;
                    break;
                case ADD_NEW_MOTORBIKE:
                    XeMay xeMay = AddNewVehicleView.inputXeMay();
                    vehicleService.addXeMay(xeMay);
                    System.out.println("Thêm mới xe máy thành công!");
                    exit = true;
                    break;
                case EXIT_ADD_NEW_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu thêm mới!");
                    break;
            }
        }
    }
}
