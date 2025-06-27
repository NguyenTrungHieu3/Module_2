package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.controller;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.PhuongTien;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.IVehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service.VehicleService;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view.DisplayVehicleView;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Motorbike;

import java.util.List;

public class DisplayVehicleController {
    private static final int DISPLAY_TRUCK_LIST = 1;
    private static final int DISPLAY_CAR_LIST = 2;
    private static final int DISPLAY_MORTOBIKE_LIST = 3;
    private static final int DISPLAY_VEHICLE_LIST = 4;
    private static final int EXIT_DISPLAY_VEHICLE = 5;

    private static IVehicleService vehicleService = new VehicleService();

    public static void displayVehicle() {
        int choice = DisplayVehicleView.displayVehicleMenu();
        boolean exit = false;
        while (!exit) {
            switch (choice) {
                case DISPLAY_TRUCK_LIST:
                    List<XeTai> xeTaiList = vehicleService.findAllXeTai();
                    DisplayVehicleView.displayXeTaiList(xeTaiList);
                    exit = true;
                    break;
                case DISPLAY_CAR_LIST:
                    List<OTo> otoList = vehicleService.findAllOTo();
                    DisplayVehicleView.displayOtoList(otoList);
                    exit = true;
                    break;
                case DISPLAY_MORTOBIKE_LIST:
                    List<XeMay> xeMayList = vehicleService.findAllXeMay();
                    DisplayVehicleView.displayXeMayList(xeMayList);
                    exit = true;
                    break;
                case DISPLAY_VEHICLE_LIST:
                    List<PhuongTien> phuongTienList = vehicleService.findAllPhuongTien();
                    DisplayVehicleView.displayPhuongTienList(phuongTienList);
                    exit = true;
                    break;
                case EXIT_DISPLAY_VEHICLE:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu hiển thị!");
            }
        }
    }
}
