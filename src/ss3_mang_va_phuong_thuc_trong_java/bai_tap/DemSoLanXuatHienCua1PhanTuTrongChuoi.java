package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCua1PhanTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập ký tự muốn kiểm tra: ");
        char kyTu = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+kyTu+" là: "+count);
    }
}
