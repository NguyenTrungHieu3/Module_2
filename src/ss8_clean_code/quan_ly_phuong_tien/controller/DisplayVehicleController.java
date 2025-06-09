package ss8_clean_code.quan_ly_phuong_tien.controller;

import ss8_clean_code.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.quan_ly_phuong_tien.entity.Truck;
import ss8_clean_code.quan_ly_phuong_tien.entity.Vehicle;
import ss8_clean_code.quan_ly_phuong_tien.service.IVehicleService;
import ss8_clean_code.quan_ly_phuong_tien.service.VehicleService;
import ss8_clean_code.quan_ly_phuong_tien.view.DisplayVehicleView;

import java.util.List;
import java.util.Scanner;

import static ss8_clean_code.quan_ly_phuong_tien.controller.AddNewVehicleController.vehicleService;

public class DisplayVehicleController {
    public static void displayVehicles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- VUI LÒNG CHỌN LOẠI XE MUỐN HIỂN THỊ --------------------");
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị ô tô");
        System.out.println("3. Hiển thị xe máy");
        System.out.println("4. Hiển thị tất cả xe");
        System.out.println("5. Quay về menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                List<Truck> trucks = vehicleService.getAllTrucks();
                DisplayVehicleView.displayTrucks(trucks);
                break;
            case 2:
                List<Car> cars = vehicleService.getAllCars();
                DisplayVehicleView.displayCars(cars);
                break;
            case 3:
                List<Motorbike> motorbikes = vehicleService.getAllMotorbikes();
                DisplayVehicleView.displayMotobikes(motorbikes);
                break;
            case 4:
                List<Vehicle> vehicles = vehicleService.getAllVehicles();
                DisplayVehicleView.displayAllVehicles(vehicles);
                break;
            case 5:
                break;
            default:
                System.out.println("Không có lựa chọn nào trong menu");
                break;
        }
    }
}
