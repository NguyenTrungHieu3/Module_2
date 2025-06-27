package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.service;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.PhuongTien;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;

import java.util.List;

public interface IVehicleService {
    void addOTo(OTo oTo);
    void addXeMay(XeMay xeMay);
    void addXeTai(XeTai xeTai);
    List<OTo> findAllOTo();
    List<XeTai> findAllXeTai();
    List<XeMay> findAllXeMay();
    List<PhuongTien> findAllPhuongTien();
    boolean deleteVehicleById(String bienSo);

}
