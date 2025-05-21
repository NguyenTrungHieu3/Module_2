package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập b: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập c: ");
        c = Double.parseDouble(sc.nextLine());
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc hai.");
        } else {
            QuadraticEquation q = new QuadraticEquation(a,b,c);
            double delta = q.getDiscriminant();
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.println("x1 = "+q.getRoot1());
                System.out.println("x2 = "+q.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: "+q.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
