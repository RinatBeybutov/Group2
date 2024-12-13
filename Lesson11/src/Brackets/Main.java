package Brackets;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //System.out.println(isValid("()"));
        System.out.println(countWords("Hello World , world 5"));
    }

    public static int countWords(String text){
        String replaced = text.replaceAll("[^a-zA-Z]", " ");
        return (int)Arrays.stream(replaced.split(" {1,}"))
                .map(String::toLowerCase)
                .distinct()
                .count();
    }

    //    99/66
    public static boolean isValid(String s) {
        //Stack<Character> stack = new Stack<>();
        char[] openBrackets = new char[s.length()];
        int pointer = -1;

        Map<Character, Character> map = Map.of(
                '}','{',
                ')','(',
                ']','['
        );

        for (char symbol : s.toCharArray()) {
            if(symbol == '(' || symbol == '{' || symbol == '[') {
                openBrackets[++pointer] = symbol;
            } else {
                if(pointer == -1) {
                    return false;
                }
                char lastOpenBracket = openBrackets[pointer--];
                if(lastOpenBracket != map.get(symbol)) {
                    return false;
                }
            }
        }
        return pointer == -1;
    }

    // 0.3 - 0.2 = 200 ms, 2s -> 200 ms
    // 1.8 s -> 400 ms
    private char getPairBracket(char bracket) {
        return switch (bracket) {
            case '{' -> '}';
            case '(' -> ')';
            case '[' -> ']';
            default -> ' ';
        };
    }
}
