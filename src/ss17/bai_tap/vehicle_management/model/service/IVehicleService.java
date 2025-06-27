package ss17.bai_tap.vehicle_management.model.service;

import ss17.bai_tap.vehicle_management.model.entity.Car;
import ss17.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17.bai_tap.vehicle_management.model.entity.Truck;
import ss17.bai_tap.vehicle_management.model.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    void addVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    List<Car> getAllCars();
    List<Truck> getAllTrucks();
    List<Motorbike> getAllMotorbikes();
    boolean removeVehicle(String vehicleId);
}
