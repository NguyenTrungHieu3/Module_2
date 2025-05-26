package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        String color = sc.nextLine();
        Circle circle = new Circle(radius, color);
        System.out.println(circle);
    }
}
