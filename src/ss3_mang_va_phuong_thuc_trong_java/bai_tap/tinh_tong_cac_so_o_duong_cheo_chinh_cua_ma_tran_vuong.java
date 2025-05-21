package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran_vuong {
    public static void main(String[] args) {
        tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran_vuong obj = new tinh_tong_cac_so_o_duong_cheo_chinh_cua_ma_tran_vuong();
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
        double sum = obj.tinhTong(arr);
        System.out.println("Tổng các phần tử trên đường chéo chính là: "+sum);
    }

    public void inMang(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double tinhTong(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i][i];
        }
        return sum;
    }
}
