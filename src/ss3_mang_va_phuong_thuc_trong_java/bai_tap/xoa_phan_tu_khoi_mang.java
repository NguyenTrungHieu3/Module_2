package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        xoa_phan_tu_khoi_mang obj = new xoa_phan_tu_khoi_mang();
        int[] arr = {10, 4, 6, 7, 8, 6};
        System.out.println("Mảng ban đầu: ");
        obj.inMang(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        int[] newArr = obj.xoaPhanTuKhoiMang(arr,x);
        System.out.println("Mảng sau khi xóa");
        obj.inMang(newArr);
    }

    public int[] xoaPhanTuKhoiMang(int[] arr, int x) {
        int index_del = kiemTraViTri(arr, x);
        if (index_del == -1) {
            System.out.println("Không có phần tử "+ x + " trong mảng");
            return arr;
        }
        else {
            int[] newArr = new int[arr.length-1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index_del) {
                    newArr[i] = arr[i];
                }
                else {
                    newArr[i] = arr[i+1];
                }
            }
            return newArr;
        }
    }

    public int kiemTraViTri(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
