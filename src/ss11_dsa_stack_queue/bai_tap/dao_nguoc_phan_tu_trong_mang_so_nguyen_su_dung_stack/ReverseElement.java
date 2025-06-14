package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverseIntArray(arr);

        System.out.println();
        String hello = "HELLO";
        reverseStringArray(hello);
    }

    public static void reverseIntArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void reverseStringArray(String mWord) {
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.substring(i, i + 1));
        }

        String outPut = "";
        while (!wStack.isEmpty()) {
            outPut += wStack.pop();
        }
        System.out.println(outPut);
    }
}
