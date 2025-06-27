package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;

import java.util.List;

public interface IXeMayRepository {
    void addXeMay(XeMay xeMay);
    List<XeMay> findAllXeMay();
    boolean deleteXeMayById(String bienSo);
}
