package ss8_clean_code.bai_tap.quan_ly_sinh_vien.entity;

public abstract class Person {
    private Long code;
    private String name;
    private String address;

    public Person() {

    }

    public Person(Long code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person code=" + code + ", name=" + name + ", address=" + address;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
