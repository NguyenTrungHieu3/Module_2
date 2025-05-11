package ss1_tong_quan_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello CS02");
        int i = 10;
        float f = 20.0f;
        double d = 10.0f;
        boolean b = true;
        char c = 'c';
        Float f2 = 10.0f;
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        System.out.println("Nhập tên của bạn: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Tên của bạn là: " + ten);
        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Địa chỉ của bạn là: " + address);
    }
}
