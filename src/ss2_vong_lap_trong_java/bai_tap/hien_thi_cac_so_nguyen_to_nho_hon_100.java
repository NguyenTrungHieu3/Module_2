package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            if (hien_thi_20_so_nguyen_to_dau_tien.kiemTraSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
