package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số thập phân: ");
        int decimal = scanner.nextInt();
        String binary = convertToBinary(decimal);
        System.out.println("Số nhị phân tương ứng là: " + binary);
        scanner.close();
    }

    public static String convertToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
