package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Nhập một số thập phân: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String binary = convert(n);
        System.out.println(binary);
    }

    public static String convert(int num) {
        if (num == 0) {
            return "0";
        } else {
            Stack<Integer> stack = new Stack<Integer>();
            while (num > 0) {
                int temp = num % 2;
                num = num / 2;
                stack.push(temp);
            }

            String output = "";
            while (!stack.isEmpty()) {
                output += stack.pop();
            }
            return output;
        }
    }
}
