package ss8_clean_code.quan_ly_phuong_tien.service;

import ss8_clean_code.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.quan_ly_phuong_tien.entity.Truck;
import ss8_clean_code.quan_ly_phuong_tien.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    void addCar(Car car);
    void addTruck(Truck truck);
    void addMotorbike(Motorbike motorbike);
    List<Truck> getAllTrucks();
    List<Car> getAllCars();
    List<Motorbike> getAllMotorbikes();
    Vehicle checkVehicle(String licensePlate);
    void delelteVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
}
