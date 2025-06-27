package ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Car;

import java.util.List;

public interface ICarRepository {
    void addCar(Car car);

    List<Car> findAllCar();

    void removeCar(Car car);
}
