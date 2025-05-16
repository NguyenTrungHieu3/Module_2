package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố muốn in: ");
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        int num = 2;
        System.out.println(n + " số nguyên tố đầu tiên là: ");
        while (count < n) {
            if(kiemTraSoNguyenTo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean kiemTraSoNguyenTo(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
