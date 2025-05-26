package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        System.out.println("Nhập bán kính hình trụ: ");
        cylinder.setRadius(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập màu: ");
        cylinder.setColor(sc.nextLine());
        System.out.println("Nhập chiều cao hình trụ: ");
        cylinder.setHeight(Double.parseDouble(sc.nextLine()));
        System.out.println(cylinder);
    }
}
