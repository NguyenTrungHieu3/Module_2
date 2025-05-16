package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In hình tam giác đều");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    inHinhChuNhat();
                    break;
                case 2:
                    System.out.println("-------------------- SUB MENU --------------------");
                    System.out.println("1. In hình tam giác botton-left");
                    System.out.println("2. In hình tam giác top-left");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choose2 = sc.nextInt();
                    switch (choose2) {
                        case 1:
                            inHinhTamGiacVuongBottonLeft();
                            break;
                        case 2:
                            inHinhTamGiacVuongTopLeft();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    inHinhTamGiacDeu();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public static void inHinhChuNhat() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }

    public static void inHinhTamGiacVuongBottonLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }

    public static void inHinhTamGiacVuongTopLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }

    public static void inHinhTamGiacDeu() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= 5 - i || j >= 5 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" $ ");
                }
            }
            System.out.println();
        }
    }
}
