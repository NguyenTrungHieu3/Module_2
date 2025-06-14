package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("Đây là chuỗi Palindrome.");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }

        return true;
    }
}
