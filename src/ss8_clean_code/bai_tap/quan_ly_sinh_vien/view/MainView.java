package ss8_clean_code.bai_tap.quan_ly_sinh_vien.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------- Quản lý công ty --------------------");
        System.out.println("1. Quản lý sinh viên");
        System.out.println("2. Quản lý giáo viên");
        System.out.println("3. Quản lý nhân viên");
        System.out.println("4. Thoát chương trình!");

        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
