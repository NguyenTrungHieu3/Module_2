package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOCotNhatDinh {
    public static void main(String[] args) {
        TinhTongCacSoOCotNhatDinh obj = new TinhTongCacSoOCotNhatDinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của mảng: ");
        int m = Integer.parseInt(sc.nextLine());
        double[][] arr = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử a["+i+"]["+j+"]: ");
                arr[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        obj.inMang(arr);
        System.out.println("Nhập cột muốn tính tổng: ");
        int cot = Integer.parseInt(sc.nextLine());
        double sum = obj.tinhTong(arr, cot);
        System.out.println("Tổng các phần tử cột "+cot+" là: "+sum);
    }

    public void inMang(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double tinhTong(double[][] arr, int cot) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i][cot];
        }
        return sum;
    }
}

