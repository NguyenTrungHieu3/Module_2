package ss15_xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = sc.nextInt();
        System.out.println("Nhập y: ");
        int y = sc.nextInt();
        calculate(x, y);
    }

    public static void calculate(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.println("Tổng x + y = " + sum);
            System.out.println("Hiệu x - y = " + sub);
            System.out.println("Tích x * y = " + mul);
            System.out.println("Thương x / y = " + div);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
