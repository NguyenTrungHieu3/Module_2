package ss15_xu_ly_ngoai_le_debug.bai_tap.su_dung_lop_illegal_triangle_exception;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh c: ");
            int c = Integer.parseInt(sc.nextLine());
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi" + e.getMessage());
        }
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương");
        }

        if (a+b<c || b+c<a || c+a<b) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại");
        }
    }
}
