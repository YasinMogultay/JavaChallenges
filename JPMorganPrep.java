import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class JPMorganPrep {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            //put any opening parant to stack
            //then check for a closing type and remove stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
