package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tim_phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        tim_phan_tu_lon_nhat_trong_mang_hai_chieu obj = new tim_phan_tu_lon_nhat_trong_mang_hai_chieu();
        Scanner sc = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr = new int[3][3];
        obj.nhapMang(arr);
        int[] result = obj.timPhanTuLonNhatTrongMangHaiChieu(arr);
        System.out.println("Phần tử lớn nhất trong mảng hai chiều là: ");
        System.out.println(result[0]);
        System.out.println("Vị trí của phần tử lớn nhất trong mảng hai chiều là: arr["+result[1]+"]["+result[2]+"]");
    }

    public int[][] nhapMang(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập a["+i+"]["+j+"]: ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return arr;
    }

    public int[] timPhanTuLonNhatTrongMangHaiChieu(int[][] arr) {
        int max = arr[0][0];
        int i1 = 0;
        int j1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] > max) {
                   max = arr[i][j];
                   i1 = i;
                   j1 = j;
               }
            }
        }
        return new int[] {max, i1, j1};
    }
}
