package ss8_clean_code.bai_tap.quan_ly_phuong_tien.view;


import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Truck;

import java.util.Scanner;

public class AddNewVehicleView {
    public Truck inputTruck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe: ");
        String licencePlate = sc.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String brandName = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();

        System.out.println("Nhập trọng tải xe");
        float weight = Float.parseFloat(sc.nextLine());
        return new Truck(licencePlate, brandName, yearOfManufacture, owner, weight);
    }

    public Car inputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe: ");
        String licencePlate = sc.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String brandName = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();

        System.out.println("Nhập số chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập kiểu xe: ");
        String carType = sc.nextLine();
        return new Car(licencePlate, brandName, yearOfManufacture, owner, numberOfSeats, carType);
    }

    public Motorbike inputMotorbike() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập biển số xe: ");
        String licencePlate = sc.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String brandName = sc.nextLine();

        System.out.println("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập chủ sở hữu: ");
        String owner = sc.nextLine();

        System.out.println("Nhập công suất: ");
        int power = Integer.parseInt(sc.nextLine());
        return new Motorbike(licencePlate, brandName, yearOfManufacture, owner, power);
    }
}
