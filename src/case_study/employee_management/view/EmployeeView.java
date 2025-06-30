package case_study.employee_management.view;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;
import case_study.employee_management.regex.CheckEmployeeRegex;
import ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity.Truck;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    public int displayAddEmployeeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại nhân viên thêm mới: ");
        System.out.println("1. Thêm kĩ sư");
        System.out.println("2. Thêm công nhân");
        System.out.println("3. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int displayEmployeeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại nhân viên hiển thị: ");
        System.out.println("1. Hiển thị kĩ sư");
        System.out.println("2. Hiển thị công nhân");
        System.out.println("3. Hiển thị tất cả nhân viên");
        System.out.println("4. Quay lại menu chính");
        System.out.print("Mời bạn nhập lựa chọn: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
            return -1;
        }
    }

    public Engineer inputEngineer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin kĩ sư -----");
        String employeeId = null;
        do {
            System.out.println("Nhập mã nhân viên: ");
            employeeId = sc.nextLine();
        } while (!CheckEmployeeRegex.checkEngineerId(employeeId));
        System.out.println("Nhập tên nhân viên: ");
        String employeeName = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chuyên ngành học: ");
        String major = sc.nextLine();
        return new Engineer(employeeId, employeeName, age, major);
    }

    public Engineer inputUpdateEngineer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin kĩ sư -----");
        String employeeId = null;
        do {
            System.out.println("Nhập mã nhân viên: ");
            employeeId = sc.nextLine();
        } while (!CheckEmployeeRegex.checkEngineerId(employeeId));
        System.out.println("Nhập tên nhân viên: ");
        String employeeName = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chuyên ngành học: ");
        String major = sc.nextLine();
        return new Engineer(employeeId, employeeName, age, major);
    }

    public Worker inputWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Nhập thông tin công nhân -----");
        String employeeId = null;
        do {
            System.out.println("Nhập mã nhân viên: ");
            employeeId = sc.nextLine();
        } while (!CheckEmployeeRegex.checkWorkerId(employeeId));
        System.out.println("Nhập tên nhân viên: ");
        String employeeName = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cấp bậc của công nhân: ");
        int level = Integer.parseInt(sc.nextLine());
        return new Worker(employeeId, employeeName, age, level);
    }

    public void displayListEngineer(List<Engineer> engineerList) {
        System.out.println("Danh sách kĩ sư: ");
        for (Engineer engineer : engineerList) {
            System.out.println(engineer);
        }
    }

    public void displayListWorker(List<Worker> workerList) {
        System.out.println("Danh sách công nhân: ");
        for (Worker worker : workerList) {
            System.out.println(worker);
        }
    }

    public void displayAllEmployee(List<Employee> employeeList) {
        System.out.println("Danh sách tất cả công nhân: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
