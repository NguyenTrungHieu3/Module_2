package ss17_binary_file_serialization.bai_tap.vehicle_management.controller;

import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Car;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Truck;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Vehicle;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.service.IVehicleService;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.service.VehicleService;
import ss17_binary_file_serialization.bai_tap.vehicle_management.view.VehicleView;

import java.util.List;

public class VehicleController {
    private static final int ADD_TRUCK = 1;
    private static final int ADD_CAR = 2;
    private static final int ADD_MOTORBIKE = 3;
    private static final int EXIT_ADD_MENU = 4;

    private static final int DISPLAY_TRUCKS = 1;
    private static final int DISPLAY_CARS = 2;
    private static final int DISPLAY_MOTORBIKES = 3;
    private static final int DISPLAY_ALL_VEHICLES = 4;
    private static final int EXIT_DISPLAY_MENU = 5;

    private VehicleView vehicleView = new VehicleView();
    private IVehicleService vehicleService = new VehicleService();

    public void addVehicle() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = vehicleView.displayAddVehicleMenu();
            switch (choice) {
                case ADD_TRUCK:
                    Truck truck = vehicleView.inputTruck();
                    if (isPlateDuplicated(truck.getVehicleId()))
                        break;
                    vehicleService.addVehicle(truck);
                    System.out.println("Thêm xe tải thành công!");
                    break;
                case ADD_CAR:
                    Car car = vehicleView.inputCar();
                    if (isPlateDuplicated(car.getVehicleId()))
                        break;
                    vehicleService.addVehicle(car);
                    System.out.println("Thêm ô tô thành công!");
                    break;
                case ADD_MOTORBIKE:
                    Motorbike motorbike = vehicleView.inputMotorbike();
                    if (isPlateDuplicated(motorbike.getVehicleId()))
                        break;
                    vehicleService.addVehicle(motorbike);
                    System.out.println("Thêm xe máy thành công!");
                    break;
                case EXIT_ADD_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }

    private boolean isPlateDuplicated(String vehicleID) {
        if (vehicleService.checkVehicle(vehicleID)) {
            System.out.println("Biển số " + vehicleID +  " đã tồn tại!");
            return true;
        }
        return false;
    }

    public void displayVehicle() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = vehicleView.displayVehicleMenu();
            switch (choice) {
                case DISPLAY_TRUCKS:
                    List<Truck> trucks = vehicleService.getAllTrucks();
                    vehicleView.displayAllTrucks(trucks);
                    break;
                case DISPLAY_CARS:
                    List<Car> cars = vehicleService.getAllCars();
                    vehicleView.displayAllCars(cars);
                    break;
                case DISPLAY_MOTORBIKES:
                    List<Motorbike> motorbikes = vehicleService.getAllMotorbikes();
                    vehicleView.displayAllMotorbikes(motorbikes);
                    break;
                case DISPLAY_ALL_VEHICLES:
                    List<Vehicle> vehicles = vehicleService.getAllVehicles();
                    vehicleView.displayAllVehicles(vehicles);
                    break;
                case EXIT_DISPLAY_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này trong menu! " +
                            "\nVui lòng nhập lại: ");
                    break;
            }
        }
    }
}
