package case_study.employee_management.model.entity;

public class Engineer extends Employee{
    private String major;

    public Engineer() {
        super();
        this.major = "";
    }

    public Engineer(String major) {
        super();
        this.major = major;
    }

    public Engineer(String employeeId, String employeeName, int age, String major) {
        super(employeeId, employeeName, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getInfoToCSV() {
        return this.getEmployeeId()
                + "," + this.getEmployeeName()
                + "," + this.getAge()
                + "," + this.major;
    }

    @Override
    public String getEmployeeType() {
        return "Engineer";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMajor: " + this.major;
    }
}
