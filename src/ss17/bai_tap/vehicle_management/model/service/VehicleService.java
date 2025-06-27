package ss17.bai_tap.vehicle_management.model.service;

import ss17.bai_tap.vehicle_management.model.entity.Car;
import ss17.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17.bai_tap.vehicle_management.model.entity.Truck;
import ss17.bai_tap.vehicle_management.model.entity.Vehicle;
import ss17.bai_tap.vehicle_management.model.repository.IVehicleRepository;
import ss17.bai_tap.vehicle_management.model.repository.VehicleRepository;

import java.util.List;

public class VehicleService implements IVehicleService {
    private IVehicleRepository vehicleRepository = new VehicleRepository();
    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicle(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAllVehicles();
    }

    @Override
    public List<Car> getAllCars() {
        return vehicleRepository.findAllCars();
    }

    @Override
    public List<Truck> getAllTrucks() {
        return vehicleRepository.findAllTrucks();
    }

    @Override
    public List<Motorbike> getAllMotorbikes() {
        return vehicleRepository.findAllMotorbikes();
    }

    @Override
    public boolean removeVehicle(String vehicleId) {
        return vehicleRepository.removeVehicle(vehicleId);
    }
}
