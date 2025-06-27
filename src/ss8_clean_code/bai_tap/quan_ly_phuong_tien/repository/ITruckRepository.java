package ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTruck(Truck truck);

    List<Truck> findAllTruck();

    void removeTruck(Truck truck);
}
