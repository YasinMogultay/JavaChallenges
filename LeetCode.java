import java.lang.reflect.Array;
import java.util.*;
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

    //    TODO:
    //Write a function that takes an array/list of strings and returns the a different array/list with the strings sorted in reverse order.
    //Example: f(["barry", "jetpack", "zombies", "brick"]) = ["zombies", "jetpack", "brick", "barry"]

    public static void reverseList(ArrayList<String> input) {
        Collections.reverse(input);
        System.out.println(input);
    }


    public int[] twooSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                int comp = nums[i] - target;

                if (nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not Match");
    }

    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            if (y > Integer.MAX_VALUE / 10 || y < Integer.MIN_VALUE / 10) return 0;
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        return y;
    }

    public static boolean isPalindrome(int x) {
        int y = 0;
        while (x != 0) {
            if (y > Integer.MAX_VALUE / 10 || y < Integer.MIN_VALUE / 10) return false;
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        if (y == x)
            return true;
        return false;
    }

    public boolean isPalindromee(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rNumber = 0;
        while (x > rNumber) {
            rNumber = rNumber * 10 + x % 10;
            x /= 10;
        }
        return x == rNumber || x == rNumber / 10;
    }

//    public static void main(String[] args) {
//        System.out.println(reverse(123));
//        System.out.println(replaceNumbersToString("I won 7 of the 10 games and received 30 dollars."));
//        System.out.println(replaceRemove("Hey dude, I was just going to grab some fish n chips."));
//        System.out.println(firstCapitalize("this is a java. programming line is! starts here?"));
//        int a[] = {1, 20, 50, 6, 3, 2};
//        System.out.println(getSecondLargest(a));
//        evenNumbers(0, 10);
//        System.out.println(factorial(6));
//        System.out.println(reverseWords("I love Java Programming"));
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("element_1");
//        arrayList.add("element_2");
//        arrayList.add("element_3");
//        arrayList.add("element_4");
//        arrayList.add("element_5");
//        reverseList(arrayList);
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    //roman to integer problem leetcode

    public int romanToInt(String str) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        char prev = 'A';
        int sum = 0;
        for(char s : str.toCharArray()) {
            if(a[s - 'A'] > a[prev - 'A']) {
                sum = sum - 2 * a[prev - 'A'];
            }
            sum = sum + a[s - 'A'];
            prev = s;
        }
        return sum;
    }


}

