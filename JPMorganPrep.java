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


    public static boolean isSelfDN(long a) {
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

    //another solution
    public static boolean isSelfDN2(long num) {
        //converting integer num to String to get indexes and compare them easily
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            //Extracting each digit one by one from the string
            String temp_char = s.charAt(i) + "";
            //converting the string (digit) into integer b stores digit present at index 'i'
            int b = Integer.parseInt(temp_char);
            int count = 0; // counting how many times the number occur in whole number
            for (int j = 0; j < s.length(); j++) {
                //converting string char to integer
                int temp = Integer.parseInt(s.charAt(j) + "");
                //checking whether it's equal to index i if so then increment count
                if (temp == i) {
                    count++;
                }
            }
            //if it's not equal return false.
            if (count != b)
                return false;
        }
        return true;
    }

    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n+1];
        memo[n]  = 1;
        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

        return memo[0];
    }


    public static void main(String[] args) {
        System.out.println(isSelfDN2(2020));
    }
}
