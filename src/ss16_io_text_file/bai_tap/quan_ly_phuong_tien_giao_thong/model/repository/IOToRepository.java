package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;

import java.util.List;

public interface IOToRepository {
    void addOTo(OTo o);
    List<OTo> findAllOTo();
    boolean deleteOToById(String bienSo);
}
