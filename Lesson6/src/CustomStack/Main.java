package CustomStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        CustomStack customStack = new CustomStack(3);

        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(4);

        int value = customStack.pop(); // 4
        System.out.println("value = " + value);
        System.out.println("value = " + customStack.pop());
        System.out.println("value = " + customStack.pop());
        System.out.println("value = " + customStack.pop());

        Stack<Integer> stack = new Stack<>();

    }
}
