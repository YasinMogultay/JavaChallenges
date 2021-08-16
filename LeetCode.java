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

    // Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {

        int i = 1; //iterator thru array
        int j = 0; //current index
        for (; i<nums.length; i++) {
            if (nums[i] != nums[j]) { //new number
                j++; //move current index
                nums[j] = nums[i]; //fill current index with new number
            }
        }
        return j+1;
    }

    //Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
    public int removeElement(int[] nums, int val) {
        int count=0;
        int end= nums.length-1;
        if(nums.length==1 && nums[0]==val) return 0;
        for(int i=0;i<(nums.length-count);i++){
            if(nums[i]==val && i!=end){  //step 1
                count++;
                while(nums[end]==val && end>0 && i!=end) {  // step 2
                    end--;
                    count++;
                }
                int temp=nums[i];   // swapping
                nums[i]= nums[end];
                nums[end]= temp;
                end--;
            }
        }
        if(end>0 &&nums[end]==val) count++;
        return nums.length-count;
    }


//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    public int maxSubArray(int[] nums) {
        return Subarray(nums, 0 ,nums.length -1 );
    }
    public int Subarray(int[] A,int left, int right){
        if(left == right){return A[left];}
        int mid = left + (right - left) / 2;
        int leftSum = Subarray(A,left,mid);// left part
        int rightSum = Subarray(A,mid+1,right);//right part
        int crossSum = crossSubarray(A,left,right);// cross part
        if(leftSum >= rightSum && leftSum >= crossSum){// left part is max
            return leftSum;
        }
        if(rightSum >= leftSum && rightSum >= crossSum){// right part is max
            return rightSum;
        }
        return crossSum; // cross part is max
    }
    public int crossSubarray(int[] A,int left,int right){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int mid = left + (right - left) / 2;
        for(int i = mid; i >= left ; i--){
            sum = sum + A[i];
            if(leftSum < sum){
                leftSum = sum;
            }
        }
        sum = 0;
        for(int j = mid + 1; j <= right; j++){
            sum = sum + A[j];
            if(rightSum < sum){
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }

    //    Given two binary strings a and b, return their sum as a binary string.
    public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
    }

//    You are climbing a staircase. It takes n steps to reach the top.
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    int result;
    HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if(n < 2) {
            return 1;
        }
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        result = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n,result);
        return result;
    }

    //Given a string s, find the length of the longest substring without repeating characters.
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int longest = 0;
        int currLong = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (hash.containsKey(c)) {
                i = hash.remove(c);
                currLong = 0;
                hash.clear();
            } else {
                hash.put(c, i);
                currLong++;
                if (currLong > longest) {
                    longest = currLong;
                }
            }
        }

        return longest;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int med1 = 0;
        int med2 = 0;
        for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
            med1 = med2;
            if (index1 == nums1.length) {
                med2 = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                med2 = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2] ) {
                med2 = nums1[index1];
                index1++;
            }  else {
                med2 = nums2[index2];
                index2++;
            }
        }

        // the median is the average of two numbers
        if ((nums1.length+nums2.length)%2 == 0) {
            return (float)(med1+med2)/2;
        }

        return med2;
    }

    //longest palindromic question
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    //11. Container With Most Water
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int ans=0;
        while(i!=j){

            int area=(j-i)*Math.min(height[i],height[j]);

            if(area>ans){
                ans=area;
            }

            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}

