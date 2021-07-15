import java.util.Arrays;
import java.util.Collections;

public class HackerRankStringManipulation {

    public static int makeAnagram(String a, String b) {
        //Make has array for both string and calculate freq of each char
        int count1[] = new int[26];
        int count2[] = new int[26];

        //count freq of each char in first and second string
        for (int i = 0; i < a.length(); i++)
            count1[a.charAt(i)-'a']++;
        for (int i =0; i < b.length(); i++){
            count2[b.charAt(i)-'a']++;
        }

        //traverse count arrays to find number of chars to be removed
        int result = 0;
        for (int i = 0; i < 26; i++){
            result += Math.abs(count1[i] - count2[i]);
        }
        return result;
    }

    public static int alternatingCharacters(String s) {
        //counting chars to be deleted
        int result = 0;

        for (int i = 0; i < s.length()-1; i++)
        //if two alternating char is same then count++ and delete
            if (s.charAt(i) == s.charAt(i+1))
            result++;
        return result;
    }

}
