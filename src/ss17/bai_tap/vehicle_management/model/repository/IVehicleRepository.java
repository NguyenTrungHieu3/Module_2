package ss17.bai_tap.vehicle_management.model.repository;

import ss17.bai_tap.vehicle_management.model.entity.Car;
import ss17.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17.bai_tap.vehicle_management.model.entity.Truck;
import ss17.bai_tap.vehicle_management.model.entity.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    void addVehicle(Vehicle vehicle);
    List<Vehicle> findAllVehicles();
    List<Car> findAllCars();
    List<Truck> findAllTrucks();
    List<Motorbike> findAllMotorbikes();
    boolean removeVehicle(String vehicleId);
    boolean removeCar(String carId);
    boolean removeTruck(String truckId);
    boolean removeMotorbike(String motorbikeId);
}
