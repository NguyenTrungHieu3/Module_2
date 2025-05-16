package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index_del = i;
                break;
            }
        }
        
        if (index_del == -1) {
            System.out.println("Không có phần tử "+ x + "trong mảng");
        } else {

            for (int i = 0; i < arr.length; i++) {

            }
        }

    }

}
