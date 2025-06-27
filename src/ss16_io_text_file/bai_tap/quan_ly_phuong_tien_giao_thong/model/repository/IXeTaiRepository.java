package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.repository;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    void addXeTai(XeTai xeTai);
    List<XeTai> findAllXeTai();
    boolean deleteXeTaiById(String bienSo);
}
