package GeneralStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        list.add(new Cat("Tom"));
        list.add(new Animal());

        CustomStack customStack = new CustomStack(3);

        //Integer a = new Integer(1);
        //Integer i = Integer.valueOf(1);

        // int -> Integer
        customStack.push(new Cat("Tom"));
        customStack.push(3);
        customStack.push(4);
        customStack.push(4);

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("value = " + customStack.pop());
        System.out.println("value = " + customStack.pop());
        System.out.println("value = " + customStack.pop());
        System.out.println("value = " + customStack.pop());

        Stack<Integer> stack = new Stack<Integer>();

    }
}
