package ss17.bai_tap.vehicle_management.controller;

import ss17.bai_tap.vehicle_management.model.service.IVehicleService;
import ss17.bai_tap.vehicle_management.model.service.VehicleService;
import ss17.bai_tap.vehicle_management.view.MainView;

public class MainController {
    private static final int ADD_VEHICLE = 1;
    private static final int DISPLAY_VEHICLE = 2;
    private static final int REMOVE_VEHICLE = 3;
    private static final int EXIT = 4;

    private static VehicleController vehicleController = new VehicleController();
    private static IVehicleService vehicleService = new VehicleService();

    public static void main(String[] args) {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = MainView.displayMainMenu();
            switch (choice) {
                case ADD_VEHICLE:
                    vehicleController.addVehicle();
                    break;
                case DISPLAY_VEHICLE:
                    vehicleController.displayVehicle();
                    break;
                case REMOVE_VEHICLE:
                    String vehicleId = MainView.removeVehicle();
                    if (vehicleService.removeVehicle(vehicleId)) {
                        System.out.println("Xóa phương tiện thành công!");
                    } else {
                        System.out.println("Xóa phương tiện thất bại!");
                    }
                    break;
                case EXIT:
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
