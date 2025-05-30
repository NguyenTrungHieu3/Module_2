package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            if (HienThi20SoNguyenToDauTien.kiemTraSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
