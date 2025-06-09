package ss8_clean_code.quan_ly_phuong_tien.entity;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String carType;

    public Car() {

    }

    public Car(int numberOfSeats, String carType) {
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car(String licensePlate, String brandName, int yearOfManufacture, String owner, int numberOfSeats, String carType) {
        super(licensePlate, brandName, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return
                "\n Biển kiểm soát: "+ super.getLicensePlate() +
                "\n Tên hãng sản xuất: "+super.getBrandName() +
                "\n Năm sản xuất: " + super.getYearOfManufacture() +
                "\n Chủ sở hữu: " + super.getOwner() +
                "\n Số chỗ ngồi: " + numberOfSeats +
                "\n Loại xe: " + carType;
    }
}
