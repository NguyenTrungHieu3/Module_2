package ss8_clean_code.quan_ly_phuong_tien.view;

import ss8_clean_code.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.quan_ly_phuong_tien.entity.Truck;
import ss8_clean_code.quan_ly_phuong_tien.entity.Vehicle;

import java.util.List;

public class DisplayVehicleView {
    public static void displayTrucks(List<Truck> trucks) {
        if (trucks.isEmpty()) {
            System.out.println("Không có xe tải nào!!");
            return;
        }
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println("Xe tải số "+ (i + 1) + ":");
            System.out.println(trucks.get(i).toString());
        }
    }

    public static void displayCars(List<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("Không có ô tô nào!!");
            return;
        }
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Ô tô số "+ (i + 1) + ":");
            System.out.println(cars.get(i).toString());
        }
    }

    public static void displayMotobikes(List<Motorbike> motobikes) {
        if (motobikes.isEmpty()) {
            System.out.println("Không có xe máy nào!!");
            return;
        }
        System.out.println(motobikes.size());
        for (int i = 0; i < motobikes.size(); i++) {
            System.out.println("Xe máy số "+ (i + 1) + ":");
            System.out.println(motobikes.get(i).toString());
        }
    }

    public static void displayAllVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("Không có xe nào!!");
            return;
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println("Xe số "+ (i + 1) + ":");
                System.out.println(vehicles.get(i).toString());
            }
        }
    }
}
