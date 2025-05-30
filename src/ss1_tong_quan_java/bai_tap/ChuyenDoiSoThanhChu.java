package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số (0 - 999) muốn chuyển sang chữ: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number > 999 || number < 0) {
            System.out.println("Out of ability");
        } else {
            String result = "";
            if (number <= 10) {
                result = chuyenDoiSoOHangDonVi(number);
            } else if (number <= 15) {
                switch (number) {
                    case 11:
                        result = "eleven";
                        break;
                    case 12:
                        result = "twelve";
                        break;
                    case 13:
                        result = "thirteen";
                        break;
                    case 14:
                        result = "fourteen";
                        break;
                    case 15:
                        result = "fifteen";
                    default:
                        break;
                }
            } else if (number < 20) {
                int soOHangDonVi = number % 10;
                result = chuyenDoiSoOHangDonVi(soOHangDonVi) + "-teen";
            } else if (number < 100) {
                int soOHangDonVi = number % 10;
                int soOHangChuc = (number/10) % 10;
                result = chuyenDoiSoOHangChuc(soOHangChuc);
                if (soOHangDonVi != 0)
                    result += chuyenDoiSoOHangDonVi(soOHangDonVi);
            } else {
                int soOHangTram = (number/100) % 10;
                result = chuyenDoiSoOHangDonVi(soOHangTram) + " hundered ";
                int phanDu = number % 100;
                if (phanDu != 0) {
                    result += "and ";
                    if (phanDu <= 10) {
                        result += chuyenDoiSoOHangDonVi(phanDu);
                    } else if (phanDu <= 15) {
                        switch (phanDu) {
                            case 11:
                                result += "eleven";
                                break;
                            case 12:
                                result += "twelve";
                                break;
                            case 13:
                                result += "thirteen";
                                break;
                            case 14:
                                result += "fourteen";
                                break;
                            case 15:
                                result += "fifteen";
                            default:
                                break;
                        }
                    } else if (phanDu < 20) {
                        int soOHangDonVi = phanDu % 10;
                        result += chuyenDoiSoOHangDonVi(soOHangDonVi) + "-teen";
                    } else {
                        int soOHangDonVi = phanDu % 10;
                        int soOHangChuc = (phanDu/10) % 10;
                        result += chuyenDoiSoOHangChuc(soOHangChuc);
                        if (soOHangDonVi != 0)
                            result += chuyenDoiSoOHangDonVi(soOHangDonVi);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static String chuyenDoiSoOHangDonVi(int num) {
        String result = "";
        switch (num) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
            default:
                break;
        }
        return result;
    }

    public static String chuyenDoiSoOHangChuc(int num) {
        String result = "";
        switch (num) {
            case 2:
                result = "twenty-";
                break;
            case 3:
                result = "thirty-";
                break;
            case 4:
                result = "fourty-";
                break;
            case 5:
                result = "fifty-";
                break;
            case 6:
                result = "sixty-";
                break;
            case 7:
                result = "seventy-";
                break;
            case 8:
                result = "eighty-";
                break;
            case 9:
                result = "ninety-";
                break;
            default:
                break;
        }
        return result;
    }
}
