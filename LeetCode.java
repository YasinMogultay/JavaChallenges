import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LeetCode {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int comp = target - nums[i];

                if (nums[j] == comp) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not match");
    }

    public static int getSecondLargest(int[] a) {
        int temp;
        int total = a.length;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void evenNumbers(int x, int y) {
        int largestGivenNumber = Math.max(x, y);
        int lowestGivenNumber = Math.min(x, y);
        int[] arr;
        for (int i = lowestGivenNumber; i < largestGivenNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static String reverseWords(String str) {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    //Write a function that takes a string and then returns a string with the first letter of each sentence capitalized (assume sentences end with a period(.), question mark(?), or exclamation mark(!).
    public static String firstCapitalize(String text) {
        int pos = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(text);
        while (pos < sb.length()) {
            if (sb.charAt(pos) == '.' || sb.charAt(pos) == '!' || sb.charAt(pos) == '?') {
                capitalize = true;
            } else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            }
            pos++;
        }
        return sb.toString();
    }

    //remove dude text and replace n to and
    public static String replaceRemove(String text) {
        text = text.replaceAll("dude", "");
        text = text.replace("  n  ", "and");
        return text;
    }

    //replace num to string
    public static String replaceNumbersToString(String text) {
        text = text.replace(" 1 ", " one ");
        text = text.replace(" 2 ", " two ");
        text = text.replace(" 3 ", " three ");
        text = text.replace(" 4 ", " four ");
        text = text.replace(" 5 ", " five ");
        text = text.replace(" 6 ", " six ");
        text = text.replace(" 7 ", " seven ");
        text = text.replace(" 8 ", " eight ");
        text = text.replace(" 9 ", " nine ");
        text = text.replace(" 10 ", " ten ");
        return text;
    }

    //Write a function that takes an array/list of words and returns a different array/list with any duplicates removed.
    public static List<String> removeDuplicates(List<String> input) {
        List<String> removed = input.stream().distinct().collect(Collectors.toList());
        return removed;
    }

    public static void main(String[] args) {
        System.out.println(replaceNumbersToString("I won 7 of the 10 games and received 30 dollars."));
        System.out.println(replaceRemove("Hey dude, I was just going to grab some fish n chips."));
        System.out.println(firstCapitalize("this is a java. programming line is! starts here?"));
        int a[] = {1, 20, 50, 6, 3, 2};
        System.out.println(getSecondLargest(a));
        evenNumbers(0, 10);
        System.out.println(factorial(6));
        System.out.println(reverseWords("I love Java Programming"));
    }

//    TODO:
    //Write a function that takes an array/list of strings and returns the a different array/list with the strings sorted in reverse order.
    //Example: f(["barry", "jetpack", "zombies", "brick"]) = ["zombies", "jetpack", "brick", "barry"]


    //TODO:
//    Write a class definition for a Person with a name, age, and phone number. Include a constructor and mutators methods for the fields.


}

