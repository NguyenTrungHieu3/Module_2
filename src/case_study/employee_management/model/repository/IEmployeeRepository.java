package case_study.employee_management.model.repository;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;

import java.util.List;

public interface IEmployeeRepository {
    void addEmployee(Employee employee);
    List<Engineer> findAllEngineers();
    List<Worker> findAllWorkers();
    List<Employee> findAllEmployees();
    boolean removeEngineerById(String engineerId);
    boolean removeWorkerById(String workerId);
    boolean removeEmployeeById(String employeeId);
}
