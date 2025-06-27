package ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    List<Truck> trucks = new ArrayList<Truck>();
    @Override
    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public List<Truck> findAllTruck() {
        return trucks;
    }

    @Override
    public void removeTruck(Truck truck) {
        trucks.remove(truck);
    }
}
