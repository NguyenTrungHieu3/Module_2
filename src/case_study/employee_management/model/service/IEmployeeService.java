package case_study.employee_management.model.service;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;

import java.util.List;

public interface IEmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    List<Engineer> getAllEngineers();
    List<Worker> getAllWorkers();
    Employee isExistEmployee(String employeeId);
    boolean removeEmployee(String employeeId);
}
