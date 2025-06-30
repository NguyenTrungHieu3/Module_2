package case_study.employee_management.model.entity;

public abstract class Employee {
    private String employeeId;
    private String employeeName;
    private int age;

    public Employee() {
        this.employeeId = "";
        this.employeeName = "";
        this.age = 0;
    }

    public Employee(String employeeId, String employeeName, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age + "\n";
    }

    public abstract String getInfoToCSV();

    public abstract String getEmployeeType();
}
