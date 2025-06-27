package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service;


import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity.PhuongTien;

import java.util.List;

public interface IPhuongTienService {
    void themMoiPhuongTien(PhuongTien phuongTien);
    void xoaPhuongTien();
    List<PhuongTien> layDanhSachPhuongTien();
}
