package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        them_phan_tu_vao_mang obj = new them_phan_tu_vao_mang();
        int[] arr = {10, 4, 6, 7, 8, 6};
        System.out.println("Mảng ban đầu: ");
        obj.inMang(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần thêm: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("\nNhập vị trí muốn thêm: ");
        int index = Integer.parseInt(sc.nextLine());
        int[] newArr = obj.chenPhanTuVao(arr, x, index);
        System.out.println("Mảng sau khi chèn");
        obj.inMang(newArr);
    }

    public int[] chenPhanTuVao(int[] arr, int x, int index) {
        if (index <= -1 || index >= arr.length) {
            System.out.println("Vị trí chèn không hợp lệ!");
            return  arr;
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];
                } else if (i == index) {
                    newArr[i] = x;
                } else {
                    newArr[i] = arr[i-1];
                }
            }
            return newArr;
        }
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
