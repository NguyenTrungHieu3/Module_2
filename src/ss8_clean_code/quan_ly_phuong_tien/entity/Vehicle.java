package ss8_clean_code.quan_ly_phuong_tien.entity;

public abstract class Vehicle {
    private String licensePlate;
    private String brandName;
    private int yearOfManufacture;
    private String owner;

    public Vehicle() {

    }

    public Vehicle(String licensePlate, String brandName, int yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "licensePlate='" + licensePlate + '\'' +
                ", brandName='" + brandName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
