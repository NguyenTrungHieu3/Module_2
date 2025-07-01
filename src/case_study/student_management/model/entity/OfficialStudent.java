package case_study.student_management.model.entity;

public class OfficialStudent extends Student {
    private String courseName;
    private double feePaid;

    public OfficialStudent() {
        super();
        this.courseName = "";
        this.feePaid = 0;
    }

    public OfficialStudent(String courseName, double feePaid) {
        super();
        this.courseName = courseName;
        this.feePaid = feePaid;
    }

    public OfficialStudent(String studentId, String name, String email, String phone, String birthday, String courseName, double feePaid) {
        super(studentId,name, email, phone, birthday);
        this.courseName = courseName;
        this.feePaid = feePaid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(double feePaid) {
        this.feePaid = feePaid;
    }

    @Override
    public String toString() {
        return "Official student: \n"
                +super.toString()
                + "Course name: " + this.courseName + "\n" +
                "Fee paid: " + this.feePaid + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getId()
                + "," + this.getStudentId()
                + "," + this.getName()
                + "," + this.getEmail()
                + "," + this.getPhone()
                + "," + this.getBirthday()
                + "," + this.courseName
                + "," + this.feePaid;
    }
}
