package ss17_binary_file_serialization.bai_tap.vehicle_management.model.entity;

public class Car extends Vehicle {
    private int numOfSeat;
    private String typeOfCar;

    public Car() {
        super();
        this.numOfSeat = 0;
        this.typeOfCar = "";
    }

    public Car(int numOfSeat, String typeOfCar) {
        super();
        this.numOfSeat = numOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public Car(String vehicleId, String branchName, int yearOfManufacture, String owner, int numOfSeat, String typeOfCar) {
        super(vehicleId, branchName, yearOfManufacture, owner);
        this.numOfSeat = numOfSeat;
        this.typeOfCar = typeOfCar;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car:" + "\n"
                + "Car Id: " + this.getVehicleId() + "\n"
                + "Branch name: " + this.getBranchName() + "\n"
                + "Year of manufacture: " + this.getYearOfManufacture() + "\n"
                + "Owner: " + this.getOwner() + "\n"
                + "Number of seat: " + this.numOfSeat + "\n"
                + "Type of car: '" + this.typeOfCar + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return this.getVehicleId() + ","
                + this.getBranchName() + ","
                + this.getYearOfManufacture() + ","
                + this.getOwner() + ","
                + this.getNumOfSeat() + ","
                + this.getTypeOfCar();
    }
}
