import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class JPMorganPrep {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            //put any opening parant to stack
            //then check for a closing type and remove stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static boolean isSelfDescribing(long a) {
        String s = String.valueOf(a);
        for (int i = 0; i < s.length(); i++) {
            int b = s.charAt(i) - '0'; // number of times i-th digit must occur for it to be a self describing number
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                int temp = s.charAt(j) - '0';
                if (temp == i) {
                    count++;
                }
                if (count > b) return false;
            }
            if (count != b) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isSelfDescribing(2020));
    }
}
