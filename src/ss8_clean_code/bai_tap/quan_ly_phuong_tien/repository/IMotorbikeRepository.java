package ss8_clean_code.bai_tap.quan_ly_phuong_tien.repository;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Motorbike;

import java.util.List;

public interface IMotorbikeRepository {
    void addMotorbike(Motorbike motorbike);

    List<Motorbike> findAllMotorbikes();

    void removeMotorbike(Motorbike motorbike);
}
