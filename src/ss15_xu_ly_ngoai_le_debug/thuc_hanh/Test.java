package ss15_xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                int n = sc.nextInt();
                System.out.println("OK");
            } catch (ArithmeticException e) {
                System.out.println("ERROR");
            } finally {
                sc.close();
                System.out.println("Done!");
            }
    }
}
