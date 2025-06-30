package case_study.employee_management.model.service;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;
import case_study.employee_management.model.repository.EmployeeRepository;
import case_study.employee_management.model.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void addEmployee(Employee employee) {
        if (isExistEmployee(employee.getEmployeeId()) != null) {
            System.out.println("Đã tồn tại nhân viên có mã " + employee.getEmployeeId());
            return;
        }
        employeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployees();
    }

    @Override
    public List<Engineer> getAllEngineers() {
        return employeeRepository.findAllEngineers();
    }

    @Override
    public List<Worker> getAllWorkers() {
        return employeeRepository.findAllWorkers();
    }


    public Employee isExistEmployee(String employeeId) {
        for (Employee employee : getAllEmployees()) {
            if (employee.getEmployeeId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public boolean removeEmployee(String employeeId) {
        return employeeRepository.removeEmployeeById(employeeId);
    }
}
