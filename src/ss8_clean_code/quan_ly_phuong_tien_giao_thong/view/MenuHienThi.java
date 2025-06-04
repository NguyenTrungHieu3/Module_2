package ss8_clean_code.quan_ly_phuong_tien_giao_thong.view;

import ss8_clean_code.quan_ly_phuong_tien_giao_thong.controller.PhuongTienController;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.OTo;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.PhuongTien;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.XeMay;
import ss8_clean_code.quan_ly_phuong_tien_giao_thong.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class MenuHienThi {
    private static final PhuongTienController phuongTienController = new PhuongTienController();
    public static void displayMenuHienThi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Chọn loại phương tiện thêm mới: ");
        System.out.println("1. Hiển thị tất cả các xe");
        System.out.println("2. Hiển thị xe tải");
        System.out.println("3. Hiển thị ô tô");
        System.out.println("4. Hiển thị xe máy");
        System.out.println("5. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                hienThiDanhSachPhuongTien(phuongTienController.layDanhSachPhuongTien());
                break;
            case 2:
                hienThiXeTai(phuongTienController.layDanhSachPhuongTien());
                break;
            case 3:
                hienThiOTo(phuongTienController.layDanhSachPhuongTien());
                break;
            case 4:
                hienThiXeMay(phuongTienController.layDanhSachPhuongTien());
                break;
            case 5:
                return;
            default:
                System.out.println("Không có lựa chọn trên mời nhập lại");
                break;
        }
    }

    public static void hienThiXeTai(List<PhuongTien> phuongTien) {
        boolean found = false;
        for (PhuongTien pt : phuongTien) {
            if (pt instanceof XeTai) {
                System.out.println(pt);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Chưa có xe tải trong danh sách");
        }
    }

    public static void hienThiOTo(List<PhuongTien> phuongTien) {
        boolean found = false;
        for (PhuongTien pt : phuongTien) {
            if (pt instanceof OTo) {
                System.out.println(pt);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Chưa có ô tô trong danh sách");
        }
    }

    public static void hienThiXeMay(List<PhuongTien> phuongTien) {
        boolean found = false;
        for (PhuongTien pt : phuongTien) {
            if (pt instanceof XeMay) {
                System.out.println(pt);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Chưa có xe máy trong danh sách");
        }
    }

    public static void hienThiDanhSachPhuongTien(List<PhuongTien> phuongTien) {
        if (phuongTien.isEmpty()) {
            System.out.println("Danh sách phương tiện trống");
            return;
        }

        for (PhuongTien pt : phuongTien) {
            System.out.println(pt);
        }
    }
}
