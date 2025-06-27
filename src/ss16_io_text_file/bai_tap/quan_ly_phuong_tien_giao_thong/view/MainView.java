package ss16_io_text_file.bai_tap.quan_ly_phuong_tien_giao_thong.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG --------------------");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(sc.nextLine());
    }
}
