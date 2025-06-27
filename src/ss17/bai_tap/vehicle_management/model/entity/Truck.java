package ss17.bai_tap.vehicle_management.model.entity;

public class Truck extends Vehicle {
    private float weight;

    public Truck() {
        super();
        this.weight = 0;
    }

    public Truck(float weight) {
        super();
        this.weight = weight;
    }

    public Truck(String vehicleId, String branchName, int yearOfManufacture, String owner, float weight) {
        super(vehicleId, branchName, yearOfManufacture, owner);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck:" + "\n"
                + "Truck Id: " + this.getVehicleId() + "\n"
                + "Branch name: " + this.getBranchName() + "\n"
                + "Year of manufacture: " + this.getYearOfManufacture() + "\n"
                + "Owner: " + this.getOwner() + "\n"
                + "Weight: " + this.weight + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getVehicleId() + ","
                + this.getBranchName() + ","
                + this.getYearOfManufacture() + ","
                + this.getOwner() + ","
                + this.weight;
    }
}
