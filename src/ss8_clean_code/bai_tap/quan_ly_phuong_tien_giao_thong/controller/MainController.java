package ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.controller;


import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service.IPhuongTienService;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.service.PhuongTienService;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.view.MainView;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.view.MenuHienThi;
import ss8_clean_code.bai_tap.quan_ly_phuong_tien_giao_thong.view.MenuThemMoi;

public class MainController {
    private static final IPhuongTienService phuongTienService = new PhuongTienService();
    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = MainView.displayMainView();
            switch (choice) {
                case 1:
                    MenuThemMoi.displayMenuThemMoi();
                    break;
                case 2:
                    MenuHienThi.displayMenuHienThi();
                    break;
                case 3:
                    phuongTienService.xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("Không có lưạ chọn này. Vui lòng chọn lại");
                    break;
            }
        }
    }
}
