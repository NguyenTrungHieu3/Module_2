package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view;

import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.OTo;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.PhuongTien;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeMay;
import ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.model.entity.XeTai;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien.entity.Vehicle;

import java.util.List;
import java.util.Scanner;

public class DisplayVehicleView {
    public static int displayVehicleMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- VUI LÒNG CHỌN LOẠI XE MUỐN HIỂN THỊ --------------------");
        System.out.println("1. Hiển thị danh sách xe tải");
        System.out.println("2. Hiển thị danh sách xe ô tô");
        System.out.println("3. Hiển thị danh sách xe máy");
        System.out.println("4. Hiển thị danh sách tất cả các phương tiện");
        System.out.println("5. Quay lại menu chính");
        System.out.println("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public static void displayOtoList(List<OTo> otoList) {
        if (otoList.isEmpty()) {
            System.out.println("Danh sách ô ô trống!");
        } else {
            System.out.println("Danh sách xe ô tô: ");
            for (OTo oto : otoList) {
                System.out.println(oto);
            }
        }
    }

    public static void displayXeMayList(List<XeMay> xeMayList) {
        if (xeMayList.isEmpty()) {
            System.out.println("Danh sách xe máy trống!");
        } else {
            System.out.println("Danh sách xe máy: ");
            for (XeMay xeMay : xeMayList) {
                System.out.println(xeMay);
            }
        }
    }

    public static void displayXeTaiList(List<XeTai> xeTaiList) {
        if (xeTaiList.isEmpty()) {
            System.out.println("Danh sách xe tải trống!");
        } else {
            System.out.println("Danh sách xe tải: ");
            for (XeTai xeTai : xeTaiList) {
                System.out.println(xeTai);
            }
        }
    }

    public static void displayPhuongTienList(List<PhuongTien> phuongTienList) {
        if (phuongTienList.isEmpty()) {
            System.out.println("Danh sách xe trống!");
        } else {
            System.out.println("Danh sách xe: ");
            for (PhuongTien xe : phuongTienList) {
                System.out.println(xe);
            }
        }
    }
}
