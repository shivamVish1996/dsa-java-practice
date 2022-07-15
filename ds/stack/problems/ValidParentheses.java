package ds.stack.problems;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char op, char cl) {
        return op == '(' && cl == ')'
                || op == '{' && cl == '}'
                || op == '[' && cl == ']';
    }

    public static void main(String[] args) {
        String s = "()[]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (isOpening(ch)) {
                stack.push(ch);
            } else { //is ch is closing
                if (stack.isEmpty()) return false;

                //(opening, closing)
                if (!isMatching(stack.peek(), ch)) return false;

                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
