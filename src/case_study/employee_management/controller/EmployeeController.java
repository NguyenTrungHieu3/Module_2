package case_study.employee_management.controller;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;
import case_study.employee_management.model.service.EmployeeService;
import case_study.employee_management.model.service.IEmployeeService;
import case_study.employee_management.view.EmployeeView;

import java.util.List;

public class EmployeeController {
    private static final int ADD_ENGINEER = 1;
    private static final int ADD_WORKER = 2;
    private static final int EXIT_ADD_MENU = 3;

    private static final int DISPLAY_ENGINEER = 1;
    private static final int DISPLAY_WORKER = 2;
    private static final int DISPLAY_ALL_EMPLOYEE = 3;
    private static final int EXIT_DISPLAY_MENU = 4;

    private IEmployeeService employeeService = new EmployeeService();

    private static EmployeeView employeeView = new EmployeeView();

    public void addEmployee() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = employeeView.displayAddEmployeeMenu();
            switch (choice) {
                case ADD_ENGINEER:
                    Engineer engineer = employeeView.inputEngineer();
                    employeeService.addEmployee(engineer);
                    break;
                case ADD_WORKER:
                    Worker worker = employeeView.inputWorker();
                    employeeService.addEmployee(worker);
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

    private boolean isEmployeeIdDuplicated(String vehicleID) {
        return false;
    }

    public void displayEmployee() {
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = employeeView.displayEmployeeMenu();
            switch (choice) {
                case DISPLAY_ENGINEER:
                    List<Engineer> engineerList = employeeService.getAllEngineers();
                    employeeView.displayListEngineer(engineerList);
                    break;
                case DISPLAY_WORKER:
                    List<Worker> workerList = employeeService.getAllWorkers();
                    employeeView.displayListWorker(workerList);
                    break;
                case DISPLAY_ALL_EMPLOYEE:
                    List<Employee> employeeList = employeeService.getAllEmployees();
                    employeeView.displayAllEmployee(employeeList);
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
