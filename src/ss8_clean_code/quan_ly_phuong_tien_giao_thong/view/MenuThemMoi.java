package ss8_clean_code.quan_ly_phuong_tien_giao_thong.view;

import ss8_clean_code.quan_ly_phuong_tien_giao_thong.controller.PhuongTienController;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.OTo;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.ThongTinChung;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.XeMay;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.XeTai;

import java.util.Scanner;

public class MenuThemMoi {
    private static final PhuongTienController phuongTienController = new PhuongTienController();
    public static void displayMenuThemMoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại phương tiện thêm mới: ");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                XeTai xeTai = nhapXeTai();
                phuongTienController.themMoiPhuongTien(xeTai);
                System.out.println("Thêm mới phương tiện thành công");
                break;
            case 2:
                OTo oTo = nhapOTo();
                phuongTienController.themMoiPhuongTien(oTo);
                System.out.println("Thêm mới phương tiện thành công");
                break;
            case 3:
                XeMay xeMay = nhapXeMay();
                phuongTienController.themMoiPhuongTien(xeMay);
                System.out.println("Thêm mới phương tiện thành công");
                break;
            case 4:
                return;
            default:
                System.out.println("Không có lựa chọn trên mời nhập lại");
                break;
        }
    }

//    public static PhuongTien nhapPhuongTien() {
//
//    }

    public static OTo nhapOTo() {
        Scanner sc = new Scanner(System.in);
        ThongTinChung thongTinChung = ThongTinChung.nhapThongTinChung();
        System.out.println("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập kiểu xe: ");
        String kieuXe = sc.nextLine();
        return new OTo(thongTinChung.getBienKiemSoat(),
                thongTinChung.getHangSanXuat(),
                thongTinChung.getNamSanXuat(),
                thongTinChung.getChuSoHuu(),
                soChoNgoi,
                kieuXe);
    }

    public static XeTai nhapXeTai() {
        Scanner sc = new Scanner(System.in);
        ThongTinChung thongTinChung = ThongTinChung.nhapThongTinChung();
        System.out.println("Nhập trọng tải: ");
        float trongTai = Float.parseFloat(sc.nextLine());
        return new XeTai(thongTinChung.getBienKiemSoat(),
                thongTinChung.getHangSanXuat(),
                thongTinChung.getNamSanXuat(),
                thongTinChung.getChuSoHuu(),
                trongTai);
    }

    public static XeMay nhapXeMay() {
        Scanner sc = new Scanner(System.in);
        ThongTinChung thongTinChung = ThongTinChung.nhapThongTinChung();
        System.out.println("Nhập số công suất");
        int congSuat = Integer.parseInt(sc.nextLine());
        return new XeMay(thongTinChung.getBienKiemSoat(),
                thongTinChung.getHangSanXuat(),
                thongTinChung.getNamSanXuat(),
                thongTinChung.getChuSoHuu(),
                congSuat);
    }
}
