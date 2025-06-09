package ss8_clean_code.quan_ly_phuong_tien.entity;

public class Motorbike extends Vehicle {
    private int power;

    public Motorbike() {

    }

    public Motorbike(int power) {
        this.power = power;
    }

    public Motorbike(String licensePlate, String brandName, int yearOfManufacture, String owner, int power) {
        super(licensePlate, brandName, yearOfManufacture, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return
                "\n Biển kiểm soát: "+ super.getLicensePlate() +
                "\n Tên hãng sản xuất: "+super.getBrandName() +
                "\n Năm sản xuất: " + super.getYearOfManufacture() +
                "\n Chủ sở hữu: " + super.getOwner() +
                "\n Công suất: " + power + "cc";
    }
}
