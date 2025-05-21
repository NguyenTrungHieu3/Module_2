package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sort(array);
        stopWatch.stop();
        System.out.println("Khoảng thời gian cho bài toán sắp xếp trên là: "+stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Hoán đổi
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
