package ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity;

public abstract class Vehicle {
    private String vehicleId;
    private String branchName;
    private int yearOfManufacture;
    private String owner;

    public Vehicle() {
        this.vehicleId = "";
        this.branchName = "";
        this.yearOfManufacture = 0;
        this.owner = "";
    }

    public Vehicle(String vehicleid, String branchName, int yearOfManufacture, String owner) {
        this.vehicleId = vehicleid;
        this.branchName = branchName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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

    public abstract String toString();

    public abstract String getInfoToCSV();
}
