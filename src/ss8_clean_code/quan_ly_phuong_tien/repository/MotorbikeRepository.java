package ss8_clean_code.quan_ly_phuong_tien.repository;

import ss8_clean_code.quan_ly_phuong_tien.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository{
    List<Motorbike> motorbikes = new ArrayList<Motorbike>();
    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public List<Motorbike> findAllMotorbikes() {
        return motorbikes;
    }

    @Override
    public void removeMotorbike(Motorbike motorbike) {
        motorbikes.remove(motorbike);
    }
}
