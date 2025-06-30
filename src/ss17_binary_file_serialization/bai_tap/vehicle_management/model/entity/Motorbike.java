package ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity;

public class Motorbike extends Vehicle {
    private int power;

    public Motorbike() {
        super();
        this.power = 0;
    }

    public Motorbike(int power) {
        super();
        this.power = power;
    }

    public Motorbike(String vehicleid, String branchName, int yearOfManufacture, String owner, int power) {
        super(vehicleid, branchName, yearOfManufacture, owner);
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
        return "Motorbike:" + "\n"
                + "Motorbike Id: " + this.getVehicleId() + "\n"
                + "Branch name: " + this.getBranchName() + "\n"
                + "Year of manufacture: " + this.getYearOfManufacture() + "\n"
                + "Owner: " + this.getOwner() + "\n"
                + "Power: " + this.power + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getVehicleId() + ","
                + this.getBranchName() + ","
                + this.getYearOfManufacture() + ","
                + this.getOwner() + ","
                + this.power;
    }
}
