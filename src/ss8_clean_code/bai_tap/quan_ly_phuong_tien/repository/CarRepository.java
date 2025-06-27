package ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository{
    List<Car> cars = new ArrayList<Car>();
    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> findAllCar() {
        return cars;
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }
}
