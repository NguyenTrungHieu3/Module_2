package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        GopMang gm = new GopMang();
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        System.out.println("Nhập mảng thứ nhất: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ "+ i +":");
            arr1[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Nhập mảng thứ hai: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ "+ i +":");
            arr2[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Hai mảng trước khi gộp: ");
        System.out.println("arr1: ");
        gm.inMang(arr1);
        System.out.println("arr2: ");
        gm.inMang(arr2);
        System.out.println("Mảng sau khi gộp là: ");
        int[] newArr = gm.gopMang(arr1, arr2);
        gm.inMang(newArr);
    }

    public int[] gopMang(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    public void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
