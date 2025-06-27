package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service;

import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.entity.PhuongTien;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.repository.PhuongTienRepository;

import java.util.List;
import java.util.Scanner;

public class PhuongTienService implements IPhuongTienService {
    Scanner sc = new Scanner(System.in);
    private final PhuongTienRepository phuongTienRepository = new PhuongTienRepository();
    @Override
    public void themMoiPhuongTien(PhuongTien phuongTien) {
        phuongTienRepository.themPhuongTien(phuongTien);
    }

    @Override
    public void xoaPhuongTien() {
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienSo = sc.nextLine();

        List<PhuongTien> danhSach = phuongTienRepository.layDanhSachPhuongTien();
        for (PhuongTien pt : danhSach) {
            if (pt.getBienKiemSoat().equals(bienSo)) {
                System.out.println("Tìm thấy: " + pt);
                System.out.println("Bạn có chắc muốn xóa?");
                System.out.println("1. Có");
                System.out.println("2. Không");

                String input = sc.nextLine();
                if ("1".equals(input)) {
                    phuongTienRepository.xoaPhuongTien(pt);
                    System.out.println("Đã xóa thành công.");
                } else {
                    System.out.println("Hủy thao tác xóa.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy phương tiện có biển số " + bienSo);
    }

    @Override
    public List<PhuongTien> layDanhSachPhuongTien() {
        return phuongTienRepository.layDanhSachPhuongTien();
    }
}
