package case_study.student_management.model.entity;

public abstract class Student {
    private int id;
    private String studentId;
    private String name;
    private String email;
    private String phone;
    private String birthday;

    private int countId = 0;
    public Student() {
        this.id = ++countId;
        this.studentId = "";
        this.name = "";
        this.email = "";
        this.phone = "";
        this.birthday = "";
    }

    public Student(String studentId,String name, String email, String phone, String birthday) {
        this.id = ++countId;
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "student Id: " + this.studentId + "\n" +
                "name: " + this.name + "\n" +
                "email: " + this.email + "\n" +
                "phone: " + this.phone + "\n" +
                "birthday: " + this.birthday + "\n";
    }

    public abstract String getInfoToCSV();
}
