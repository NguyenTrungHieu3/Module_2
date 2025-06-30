package case_study.employee_management.model.entity;

public class Worker extends Employee{
    private int level;

    public Worker() {
        super();
    }

    public Worker(int level) {
        super();
        this.level = level;
    }

    public Worker(String employeeId, String employeeName, int age, int level) {
        super(employeeId, employeeName, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getInfoToCSV() {
        return this.getEmployeeId()
                + "," + this.getEmployeeName()
                + "," + this.getAge()
                + "," + this.level;
    }

    @Override
    public String getEmployeeType() {
        return "Worker";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMajor: " + this.level;
    }
}
