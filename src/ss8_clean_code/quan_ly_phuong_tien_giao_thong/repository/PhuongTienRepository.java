package ss8_clean_code.quan_ly_phuong_tien_giao_thong.repository;

import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.OTo;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.PhuongTien;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.XeTai;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository {
    private final List<PhuongTien> danhSachPhuongTien = new ArrayList<>();

    public PhuongTienRepository() {
        danhSachPhuongTien.add(new XeTai("43C-012.34","Huyndai",2019,"Nguyễn Văn A",3f));
    }

    public void themPhuongTien(PhuongTien phuongTien) {
        this.danhSachPhuongTien.add(phuongTien);
    }

    public void xoaPhuongTien(PhuongTien phuongTien) {
        this.danhSachPhuongTien.remove(phuongTien);
    }

    public List<PhuongTien> layDanhSachPhuongTien() {
        return danhSachPhuongTien;
    }
}
