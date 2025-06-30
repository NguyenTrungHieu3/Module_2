package ss19_string.thuc_hanh;

import java.util.Scanner;

public class TestCompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thức hai: ");
        String str2 = sc.nextLine();
        if (str1.compareTo(str2) < 0) {
            System.out.println("The cities in alphabetical order are " + str1 + " " + str2);
        } else {
            System.out.println("The cities in alphabetical order are " + str2 + " " + str1);
        }
    }
}
