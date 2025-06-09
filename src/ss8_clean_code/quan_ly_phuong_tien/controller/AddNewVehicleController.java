package ss8_clean_code.quan_ly_phuong_tien.controller;

import ss8_clean_code.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.quan_ly_phuong_tien.entity.Truck;
import ss8_clean_code.quan_ly_phuong_tien.service.IVehicleService;
import ss8_clean_code.quan_ly_phuong_tien.service.VehicleService;
import ss8_clean_code.quan_ly_phuong_tien.view.AddNewVehicleView;

import java.util.Scanner;

public class AddNewVehicleController {
    public static final IVehicleService vehicleService = new VehicleService();
    private static final AddNewVehicleView addNewVehicleView = new AddNewVehicleView();
    public static void displayAddNewVehicleView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- VUI LÒNG CHỌN LOẠI XE MUỐN THÊM --------------------");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Quay lại menu chính");
        System.out.println("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Truck truck = addNewVehicleView.inputTruck();
                vehicleService.addTruck(truck);
                break;
            case 2:
                Car car = addNewVehicleView.inputCar();
                vehicleService.addCar(car);
                break;
            case 3:
                Motorbike motorbike = addNewVehicleView.inputMotorbike();
                vehicleService.addMotorbike(motorbike);
                break;
            case 4:
                System.out.println("Thoát thành công");
                return;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }
    }
}
