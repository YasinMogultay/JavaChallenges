import java.util.HashSet;

public class StringManipulation {

    public static void main(String[] args) {

    }

    //Write a method to check if input String is Palindrome?
    public static boolean isPalindrome(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    //Write a method that will remove given character from the String?
    public static String removeChar(String str, char c) {
        return str.replaceAll(Character.toString(c), "");
    }

    // Write a program to reverse a String in java ?
    public static String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }

    //Find out if String has all Unique Characters
    public static boolean uniqueString(String str) {
        boolean result = false;
        HashSet<Character> unq = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            result = unq.add(str.charAt(i));
            if (result == false) {
                break;
            }
        }
        return result;
    }

    //How to Count number of words in the String
    public static int countWords(String str) {
        int i, c = 0;
        char ch[] = new char[str.length()];
        for (i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                c++;
            }
        }
        return c;
    }

    //How to remove all the white-spaces in the String
    public static String removeSpace(String str) {
        return str.replaceAll("\\s","");
    }

    //How to calculate total number of vowels in String
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch=='a')|| (ch=='e') || (ch=='i')||(ch=='o') || (ch=='u')){
                count++;
            }
        }
        return count;
    }

}
