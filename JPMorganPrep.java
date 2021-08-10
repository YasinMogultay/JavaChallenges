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

    static String findD(String s)
    {

        // Strings of digits 0-9
        String[] num
                = { "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine" };

        // Initialize vector
        int[] arr = new int[10];

        // Initialize answer
        String ans = "";

        // Size of the string
        int n = s.length();

        // Traverse the string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'z')
                arr[0]++;
            if (s.charAt(i) == 'w')
                arr[2]++;
            if (s.charAt(i) == 'g')
                arr[8]++;
            if (s.charAt(i) == 'x')
                arr[6]++;
            if (s.charAt(i) == 'v')
                arr[5]++;
            if (s.charAt(i) == 'o')
                arr[1]++;
            if (s.charAt(i) == 's')
                arr[7]++;
            if (s.charAt(i) == 'f')
                arr[4]++;
            if (s.charAt(i) == 'h')
                arr[3]++;
            if (s.charAt(i) == 'i')
                arr[9]++;
        }

        // Update the elements of the vector
        arr[7] -= arr[6];
        arr[5] -= arr[7];
        arr[4] -= arr[5];
        arr[1] -= (arr[2] + arr[4] + arr[0]);
        arr[3] -= arr[8];
        arr[9] -= (arr[5] + arr[6] + arr[8]);

        // Print the digits into their
        // original format
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ans += (char)(i + '0');
            }
        }

        // Return answer
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(isSelfDN2(2020));
        System.out.println(findD("oeisowufxrzohgiettr"));
    }
}
