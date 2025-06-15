package ss11_dsa_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (checkPalindrome(input)) {
            System.out.println(input + " là chuỗi đối xứng");
        } else {
            System.out.println(input + " không phải chuổi đối xứng");
        }
    }

    public static boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        if (input.isEmpty()) {
            return true;
        }

        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()  && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
}
