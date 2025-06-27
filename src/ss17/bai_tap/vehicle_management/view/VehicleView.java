package ss17.bai_tap.vehicle_management.view;

import ss17.bai_tap.vehicle_management.model.entity.Car;
import ss17.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17.bai_tap.vehicle_management.model.entity.Truck;
import ss17.bai_tap.vehicle_management.model.entity.Vehicle;

import java.util.List;
import java.util.Scanner;

public class VehicleView {
    public int displayAddVehicleMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại phương tiện thêm mới: ");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int displayVehicleMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại phương tiện hiển thị: ");
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị ô tô");
        System.out.println("3. Hiển thị xe máy");
        System.out.println("4. Hiển thị tất cả các xe");
        System.out.println("5. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }

    public Truck inputTruck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin xe tải -----");
        System.out.println("Nhập biển kiểm soát: ");
        String vehicleId = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String branchName = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();
        System.out.println("Nhạp trọng tải: ");
        float weight = Float.parseFloat(sc.nextLine());
        return new Truck(vehicleId, branchName, year, owner, weight);
    }

    public Car inputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin ô tô -----");
        System.out.println("Nhập biển kiểm soát: ");
        String vehicleId = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String branchName = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int numberOfSeat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String typeOfCar = sc.nextLine();
        return new Car(vehicleId, branchName, year, owner, numberOfSeat, typeOfCar);
    }

    public Motorbike inputMotorbike() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin xe máy -----");
        System.out.println("Nhập biển kiểm soát: ");
        String vehicleId = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String branchName = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();
        System.out.println("Nhập công suất: ");
        int power = Integer.parseInt(sc.nextLine());
        return new Motorbike(vehicleId, branchName, year, owner, power);
    }

    public void displayAllCars(List<Car> cars) {
        System.out.println("Danh sách xe hơi: ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void displayAllTrucks(List<Truck> trucks) {
        System.out.println("Danh sách xe tải: ");
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public void displayAllMotorbikes(List<Motorbike> motorbikeList) {
        System.out.println("Danh sách xe máy: ");
        for (Motorbike motorbike: motorbikeList) {
            System.out.println(motorbike);
        }
    }

    public void displayAllVehicles(List<Vehicle> vehicleList) {
        System.out.println("Danh sách tất cả xe: ");
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }
}
