package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.controller;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity.PhuongTien;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service.IPhuongTienService;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service.PhuongTienService;

import java.util.List;

public class PhuongTienController {
    private final IPhuongTienService phuongTienService = new PhuongTienService();
    public void themMoiPhuongTien(PhuongTien pt) {
        phuongTienService.themMoiPhuongTien(pt);
    }

    public List<PhuongTien> layDanhSachPhuongTien() {
        return phuongTienService.layDanhSachPhuongTien();
    }
}
