package ss17_binary_file_serialization.bai_tap.vehicle_management.model.repository;

import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Car;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Motorbike;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Truck;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Vehicle;
import ss17_binary_file_serialization.bai_tap.vehicle_management.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleRepository implements IVehicleRepository {
    private final String CARS_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss17\\bai_tap\\vehicle_management\\data\\cars.csv";
    private final String MOTORBIKES_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss17\\bai_tap\\vehicle_management\\data\\motorbikes.csv";
    private final String TRUCKS_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\ss17\\bai_tap\\vehicle_management\\data\\trucks.csv";
    private final boolean APPEND = true;
    private final int YES = 1;
    private final int NO = 2;

    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void addVehicle(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInfoToCSV());
        if (vehicle instanceof Car) {
            readAndWriteFile.writeListToCSV(CARS_PATH_FILE, stringList, APPEND);
        } else if (vehicle instanceof Truck) {
            readAndWriteFile.writeListToCSV(TRUCKS_PATH_FILE, stringList, APPEND);
        } else if (vehicle instanceof Motorbike) {
            readAndWriteFile.writeListToCSV(MOTORBIKES_PATH_FILE, stringList, APPEND);
        }
    }

    @Override
    public List<Vehicle> findAllVehicles() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.addAll(findAllCars());
        vehicleList.addAll(findAllMotorbikes());
        vehicleList.addAll(findAllTrucks());
        return vehicleList;
    }

    @Override
    public List<Car> findAllCars() {
        List<String> stringList = readAndWriteFile.readListFromCSV(CARS_PATH_FILE);
        List<Car> cars = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            cars.add(car);
        }
        return cars;
    }

    @Override
    public List<Truck> findAllTrucks() {
        List<String> stringList = readAndWriteFile.readListFromCSV(CARS_PATH_FILE);
        List<Truck> trucks = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Float.parseFloat(array[4]));
            trucks.add(truck);
        }
        return trucks;
    }

    @Override
    public List<Motorbike> findAllMotorbikes() {
        List<String> stringList = readAndWriteFile.readListFromCSV(CARS_PATH_FILE);
        List<Motorbike> motorbikes = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            Motorbike motorbike = new Motorbike(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            motorbikes.add(motorbike);
        }
        return motorbikes;
    }

    @Override
    public boolean removeVehicle(String vehicleId) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = checkExistVehicle(vehicleId);
        if (vehicle == null) {
            System.out.println("Không tìm thấy xe có biển số " + vehicleId);
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa phương tiện có biẻn số: " + vehicleId + " không?");
            System.out.println("1. YES");
            System.out.println("2. NO");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice == YES) {
                if (vehicle instanceof Car) {
                    return removeCar(vehicleId);
                } else if (vehicle instanceof Truck) {
                    return removeTruck(vehicleId);
                } else if (vehicle instanceof Motorbike) {
                    return removeMotorbike(vehicleId);
                }
            } else {
                System.out.println("Nhấn phím bất kỳ để quay lại menu chính!");
                sc.nextLine();
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeCar(String carId) {
        boolean isDeleted = false;
        List<Car> cars = findAllCars();
        for (Car car : cars) {
            if (car.getVehicleId().equals(carId)) {
                cars.remove(car);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Car car : cars) {
            stringList.add(car.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(CARS_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean removeTruck(String truckId) {
        boolean isDeleted = false;
        List<Truck> trucks = findAllTrucks();
        for (Truck truck : trucks) {
            if (truck.getVehicleId().equals(truckId)) {
                trucks.remove(truck);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Truck truck : trucks) {
            stringList.add(truck.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(TRUCKS_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean removeMotorbike(String motorbikeId) {
        boolean isDeleted = false;
        List<Motorbike> motorbikeList = findAllMotorbikes();
        for (Motorbike motorbike: motorbikeList) {
            if (motorbike.getVehicleId().equals(motorbikeId)) {
                motorbikeList.remove(motorbike);
                isDeleted = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Motorbike motorbike: motorbikeList) {
            stringList.add(motorbike.getInfoToCSV());
        }
        readAndWriteFile.writeListToCSV(MOTORBIKES_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    public Vehicle checkExistVehicle(String vehicleId) {
        List<Vehicle> vehicleList = findAllVehicles();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }
}
