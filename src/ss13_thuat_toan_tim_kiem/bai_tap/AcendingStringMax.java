package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AcendingStringMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String input = sc.nextLine();
        String result = getAcendingStringMax(input);
        displayAcendingStringMax(result);
    }

    public static String getAcendingStringMax(String input) {
        LinkedList<Character> listMax = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) > list.getLast()) {
                    list.add(input.charAt(j));
                }
            }

            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }

            list.clear();
        }
        return listMax.toString();
    }

    public static void displayAcendingStringMax(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '[' || input.charAt(i) != ']') {
                System.out.print(input.charAt(i));
            }
        }
    }
}
