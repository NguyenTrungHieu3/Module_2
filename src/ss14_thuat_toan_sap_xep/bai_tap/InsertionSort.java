package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = inputArray();
        insertionSort(arr);
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int number = Integer.parseInt(sc.nextLine());
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        return array;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int pos = i;
            int x = array[i];
            while (pos > 0 && x < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            System.out.println("\nMảng sau bước thứ "+ (i));
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
