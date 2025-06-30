package case_study.employee_management.model.repository;

import case_study.employee_management.model.entity.Employee;
import case_study.employee_management.model.entity.Engineer;
import case_study.employee_management.model.entity.Worker;
import case_study.employee_management.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String ENGINEER_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\case_study\\employee_management\\data\\engineer.csv";
    private final String WORKER_PATH_FILE = "D:\\Code_Gym_Workspace\\C0225L1\\src\\case_study\\employee_management\\data\\worker.csv";
    private final boolean APPEND = true;

    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCSV());
        if (employee instanceof Engineer) {
            readAndWriteFile.writeListToCSV(ENGINEER_PATH_FILE, stringList, APPEND);
        } else if (employee instanceof Worker) {
            readAndWriteFile.writeListToCSV(WORKER_PATH_FILE, stringList, APPEND);
        }
    }

    @Override
    public List<Engineer> findAllEngineers() {
        List<String> stringList = readAndWriteFile.readListFromCSV(ENGINEER_PATH_FILE);
        List<Engineer> engineers = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            Engineer engineer = new Engineer(array[0], array[1], Integer.parseInt(array[2]), array[3]);
            engineers.add(engineer);
        }
        return engineers;
    }

    @Override
    public List<Worker> findAllWorkers() {
        List<String> stringList = readAndWriteFile.readListFromCSV(WORKER_PATH_FILE);
        List<Worker> workers = new ArrayList<>();
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            Worker worker = new Worker(array[0], array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
            workers.add(worker);
        }
        return workers;
    }

    @Override
    public List<Employee> findAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.addAll(findAllEngineers());
        employees.addAll(findAllWorkers());
        return employees;
    }

    @Override
    public boolean removeEngineerById(String engineerId) {
        boolean isDeleted = false;
        List<Engineer> engineerList = findAllEngineers();
        for (Engineer engineer : engineerList) {
            if (engineer.getEmployeeId().equals(engineerId)) {
                engineerList.remove(engineer);
                isDeleted = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Engineer engineer : engineerList) {
            stringList.add(engineer.getInfoToCSV());
        }

        readAndWriteFile.writeListToCSV(ENGINEER_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean removeWorkerById(String workerId) {
        boolean isDeleted = false;
        List<Worker> workerList = findAllWorkers();
        for (Worker worker : workerList) {
            if (worker.getEmployeeId().equals(workerId)) {
                workerList.remove(worker);
                isDeleted = true;
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Worker worker : workerList) {
            stringList.add(worker.getInfoToCSV());
        }

        readAndWriteFile.writeListToCSV(WORKER_PATH_FILE, stringList, !APPEND);
        return isDeleted;
    }

    @Override
    public boolean removeEmployeeById(String employeeId) {
        boolean isDeleted = false;
        for (Employee employee : findAllEmployees()) {
            if (employee.getEmployeeId().equals(employeeId)) {
                if (employee instanceof Engineer) {
                    removeEngineerById(employeeId);
                    isDeleted = true;
                    break;
                } else if (employee instanceof Worker) {
                    removeWorkerById(employeeId);
                    isDeleted = true;
                    break;
                }
            }
        }
        return isDeleted;
    }
}
