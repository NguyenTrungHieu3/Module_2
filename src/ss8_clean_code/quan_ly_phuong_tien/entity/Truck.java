package ss8_clean_code.quan_ly_phuong_tien.entity;

public class Truck extends Vehicle {
    private float weight;

    public Truck() {

    }

    public Truck(float weight) {
        this.weight = weight;
    }

    public Truck(String licensePlate, String brandName, int yearOfManufacture, String owner, float weight) {
        super(licensePlate, brandName, yearOfManufacture, owner);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "\n Biển kiểm soát: "+ super.getLicensePlate() +
                "\n Tên hãng sản xuất: "+super.getBrandName() +
                "\n Năm sản xuất: " + super.getYearOfManufacture() +
                "\n Chủ sở hữu: " + super.getOwner() +
                "\n Trọng tải: " + weight;
    }
}
