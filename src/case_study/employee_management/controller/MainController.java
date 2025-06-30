package case_study.employee_management.controller;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;
import case_study.employee_management.model.service.EmployeeService;
import case_study.employee_management.model.service.IEmployeeService;
import case_study.employee_management.view.EmployeeView;
import case_study.employee_management.view.MainView;

import java.util.Scanner;

public class MainController {
    private static final int ADD_EMPLOYEE = 1;
    private static final int DISPLAY_EMPLOYEE = 2;
    private static final int UPDATE_EMPLOYEE = 3;
    private static final int REMOVE_EMPLOYEE = 4;
    private static final int EXIT = 5;
    private static IEmployeeService employeeService = new EmployeeService();
    private static EmployeeView employeeView = new EmployeeView();
    private static EmployeeController employeeController = new EmployeeController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice;
        while (!exit) {
            choice = MainView.displayMainMenu();
            switch (choice) {
                case ADD_EMPLOYEE:
                    employeeController.addEmployee();
                    break;
                case DISPLAY_EMPLOYEE:
                    employeeController.displayEmployee();
                    break;
                case UPDATE_EMPLOYEE:
                    System.out.println("Nhập mã nhân viên muốn cập nhật: ");
                    String updateEmployeeId = sc.nextLine();
                    Employee updateEmployee = employeeService.isExistEmployee(updateEmployeeId);
                    if (updateEmployee == null) {
                        System.out.println("Nhân viên có mã "+ updateEmployeeId + "không tồn tại");
                    } else {
                        System.out.println("Nhập thông tin nhân viên muốn sửa: ");
                        if (updateEmployee instanceof Engineer) {
                            Engineer engineer = employeeView.inputEngineer();
                            employeeService.removeEmployee(updateEmployeeId);
                            employeeService.addEmployee(engineer);
                        } else if (updateEmployee instanceof Worker) {
                            Worker worker = employeeView.inputWorker();
                            employeeService.addEmployee(worker);
                        }
                    }
                    break;
                case REMOVE_EMPLOYEE:
                    System.out.println("Nhập mã nhân viên muốn xóa: ");
                    String removeEmployeeId = sc.nextLine();
                    Employee deleteEmployee = employeeService.isExistEmployee(removeEmployeeId);
                    if (deleteEmployee == null) {
                        System.out.println("Nhân viên có mã "+ deleteEmployee + "không tồn tại");
                    } else {
                        if (employeeService.removeEmployee(removeEmployeeId)) {
                            System.out.println("Xóa thành công!");
                        } else {
                            System.out.println("Lỗi xóa");
                        }
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
