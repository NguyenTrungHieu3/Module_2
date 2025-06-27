package ss8_clean_code.bai_tap.quan_ly_phuong_tien.service;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Car;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Motorbike;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Truck;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Vehicle;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleService implements IVehicleService {
    private final ICarRepository carRepository = new CarRepository();
    private final IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    private final ITruckRepository truckRepository = new TruckRepository();

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck(truck);
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikeRepository.addMotorbike(motorbike);
    }

    @Override
    public List<Truck> getAllTrucks() {
        return truckRepository.findAllTruck();
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAllCar();
    }

    @Override
    public List<Motorbike> getAllMotorbikes() {
        return motorbikeRepository.findAllMotorbikes();
    }

    @Override
    public Vehicle checkVehicle(String licensePlate) {
        for (Car car : carRepository.findAllCar()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }

        for (Truck truck : truckRepository.findAllTruck()) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }

        for (Motorbike motorbike : motorbikeRepository.findAllMotorbikes()) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void delelteVehicle(Vehicle vehicle) {
        if (vehicle instanceof Truck) {
            truckRepository.removeTruck((Truck) vehicle);
        } else if (vehicle instanceof Motorbike) {
            motorbikeRepository.removeMotorbike((Motorbike) vehicle);
        } else if (vehicle instanceof Car) {
            carRepository.removeCar((Car) vehicle);
        }
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.addAll(carRepository.findAllCar());
        vehicles.addAll(truckRepository.findAllTruck());
        vehicles.addAll(motorbikeRepository.findAllMotorbikes());
        return vehicles;
    }
}
