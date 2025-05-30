package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiGia = 25000;
        System.out.println("Nhập số tiền USD muốn đổi: ");
        int usd = Integer.parseInt(sc.nextLine());
        System.out.println("Số tiền đổi được là: " + usd*tiGia + "VND");
    }
}
