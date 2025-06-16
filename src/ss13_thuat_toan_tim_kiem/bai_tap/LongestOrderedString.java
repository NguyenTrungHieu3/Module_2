package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class LongestOrderedString {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = getLongestOrderedString(input);
        displayLongestOrderedString(result);
    }

    public static String getLongestOrderedString(String input) {
        int dau = 0;
        int cuoi = 0;
        int max = 1;
        int dem = 1;
        int d = 0;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > input.charAt(i - 1)) {
                dem++;
            } else {
                d = i;
                dem=1;
            }

            if (dem > max) {
                cuoi = i;
                max = dem;
                dau = d;
            }
        }
        return input.substring(dau, cuoi+1);
    }

    public static void displayLongestOrderedString(String input) {
        System.out.println("Chuỗi có độ dài tăng dần dài nhất trong chuỗi là: ");
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }
    }
}
