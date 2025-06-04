package ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity;

public class Student extends Person{
    private Float point;
    private String className;

    public Student() {

    }

    public Student(long code, String name, String address, float point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "  Code   : " + getCode() + "\n" +
                "  Name   : " + getName() + "\n" +
                "  Address: " + getAddress() + "\n" +
                "  Point  : " + point + "\n" +
                "  Class  : " + className;
    }
}
