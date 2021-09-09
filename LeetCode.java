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
        for (char s : str.toCharArray()) {
            if (a[s - 'A'] > a[prev - 'A']) {
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
        for (; i < nums.length; i++) {
            if (nums[i] != nums[j]) { //new number
                j++; //move current index
                nums[j] = nums[i]; //fill current index with new number
            }
        }
        return j + 1;
    }

    //Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int end = nums.length - 1;
        if (nums.length == 1 && nums[0] == val) return 0;
        for (int i = 0; i < (nums.length - count); i++) {
            if (nums[i] == val && i != end) {  //step 1
                count++;
                while (nums[end] == val && end > 0 && i != end) {  // step 2
                    end--;
                    count++;
                }
                int temp = nums[i];   // swapping
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        if (end > 0 && nums[end] == val) count++;
        return nums.length - count;
    }


    //    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    public int maxSubArray(int[] nums) {
        return Subarray(nums, 0, nums.length - 1);
    }

    public int Subarray(int[] A, int left, int right) {
        if (left == right) {
            return A[left];
        }
        int mid = left + (right - left) / 2;
        int leftSum = Subarray(A, left, mid);// left part
        int rightSum = Subarray(A, mid + 1, right);//right part
        int crossSum = crossSubarray(A, left, right);// cross part
        if (leftSum >= rightSum && leftSum >= crossSum) {// left part is max
            return leftSum;
        }
        if (rightSum >= leftSum && rightSum >= crossSum) {// right part is max
            return rightSum;
        }
        return crossSum; // cross part is max
    }

    public int crossSubarray(int[] A, int left, int right) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int mid = left + (right - left) / 2;
        for (int i = mid; i >= left; i--) {
            sum = sum + A[i];
            if (leftSum < sum) {
                leftSum = sum;
            }
        }
        sum = 0;
        for (int j = mid + 1; j <= right; j++) {
            sum = sum + A[j];
            if (rightSum < sum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }

    //    Given two binary strings a and b, return their sum as a binary string.
    public String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
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

        while (i > -1 || j > -1 || carry == 1) {
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
        if (n < 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
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
        for (int i = 0; i <= (nums1.length + nums2.length) / 2; i++) {
            med1 = med2;
            if (index1 == nums1.length) {
                med2 = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                med2 = nums1[index1];
                index1++;
            } else if (nums1[index1] < nums2[index2]) {
                med2 = nums1[index1];
                index1++;
            } else {
                med2 = nums2[index2];
                index2++;
            }
        }

        // the median is the average of two numbers
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (float) (med1 + med2) / 2;
        }

        return med2;
    }

    //longest palindromic question
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i + 1); //assume even length.
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
        int i = 0;
        int j = height.length - 1;

        int ans = 0;
        while (i != j) {

            int area = (j - i) * Math.min(height[i], height[j]);

            if (area > ans) {
                ans = area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }


    //Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }

    //17. Letter Combinations of a Phone Number
    public static List<String> letterCombinations(String digits) {
        String digitletter[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<String>();

        if (digits.length() == 0) return result;

        result.add("");
        for (int i = 0; i < digits.length(); i++)
            result = combine(digitletter[digits.charAt(i) - '0'], result);

        return result;
    }

    public static List<String> combine(String digit, List<String> l) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < digit.length(); i++)
            for (String x : l)
                result.add(x + digit.charAt(i));

        return result;
    }

    //Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i, i + l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
    public int divide(int A, int B) {
        if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
        int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++) ;
            res += 1 << x;
            a -= b << x;
        }
        return (A > 0) == (B > 0) ? res : -res;
    }

    //    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }

    //    Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
    public int[] searchRange(int[] A, int target) {
        int start = LeetCode.firstGreaterEqual(A, target);
        if (start == A.length || A[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, LeetCode.firstGreaterEqual(A, target + 1) - 1};
    }

    //find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    //actually this is the same as lower_bound in C++ STL.
    private static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                //should not be mid-1 when A[mid]==target.
                //could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }

    //    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) return mid;
            else if (A[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    //Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isParticallyValid(board, i, 0, i, 8)) return false;
            if (!isParticallyValid(board, 0, i, 8, i)) return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isParticallyValid(board, i * 3, j * 3, i * 3 + 2, j * 3 + 2)) return false;
            }
        }
        return true;
    }

    private boolean isParticallyValid(char[][] board, int x1, int y1, int x2, int y2) {
        Set singleSet = new HashSet();
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (board[i][j] != '.') if (!singleSet.add(board[i][j])) return false;
            }
        }
        return true;
    }


    //    Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations
//   of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    public List<List<Integer>> combinationSum(int[] cands, int t) {
        Arrays.sort(cands); // sort candidates to try them in asc order
        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 1; i <= t; i++) { // run through all targets from 1 to t
            List<List<Integer>> newList = new ArrayList(); // combs for curr i
            // run through all candidates <= i
            for (int j = 0; j < cands.length && cands[j] <= i; j++) {
                // special case when curr target is equal to curr candidate
                if (i == cands[j]) newList.add(Arrays.asList(cands[j]));
                    // if current candidate is less than the target use prev results
                else for (List<Integer> l : dp.get(i - cands[j] - 1)) {
                    if (cands[j] <= l.get(0)) {
                        List cl = new ArrayList<>();
                        cl.add(cands[j]);
                        cl.addAll(l);
                        newList.add(cl);
                    }
                }
            }
            dp.add(newList);
        }
        return dp.get(t - 1);
    }

    //    Given an unsorted integer array nums, return the smallest missing positive integer.
//    You must implement an algorithm that runs in O(n) time and uses constant extra space.
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 1. mark numbers (num < 0) and (num > n) with a special marker number (n+1)
        // (we can ignore those because if all number are > n then we'll simply return 1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        // note: all number in the array are now positive, and on the range 1..n+1

        // 2. mark each cell appearing in the array, by converting the index for that number to negative
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--; // -1 for zero index based array (so the number 1 will be at pos 0)
            if (nums[num] > 0) { // prevents double negative operations
                nums[num] = -1 * nums[num];
            }
        }

        // 3. find the first cell which isn't negative (doesn't appear in the array)
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        // 4. no positive numbers were found, which means the array contains all numbers 1..n
        return n + 1;
    }


    //    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pos) if (!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }


    //Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation,
                                     List<List<Integer>> permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }

    //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = sortStr(strs[i]);// sort the string |  every anagram will return same string
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<String>()); // psuh that sorted string as key
            }
            map.get(s).add(strs[i]);// add in the list
        }
        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }

    public String sortStr(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String s1 = new String(c);
        return s1;
    }

    //Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    public double myPow(double x, int n) {
        double res = 1.0;
        while (n != 0) {
            if (Math.abs(n) % 2 == 0) {
                x *= x;
                n /= 2;
            }
            if (n > 0) {
                res *= x;
                n--;
            } else {
                res *= (1 / x);
                n++;
            }
        }
        return res;
    }


    //    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//    Return true if you can reach the last index, or false otherwise.
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true;

        for (int curr = nums.length - 2; curr >= 0; curr--) {
            if (nums[curr] == 0) {
                int neededJumps = 1;
                while (neededJumps > nums[curr]) {
                    neededJumps++;
                    curr--;
                    if (curr < 0) return false;
                }
            }
        }
        return true;
    }

    //    Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
//    A word is a maximal substring consisting of non-space characters only.
    public int lengthOfLastWord(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }

    //    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
//   representing the number of elements in nums1 and nums2 respectively.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }


    //    The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
//     countAndSay(1) = "1"
//countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countIdx(s);
        }
        return s;
    }

    public String countIdx(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }

    //    Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!skip.contains(dir)) stack.push(dir);
        }
        String res = "";
        for (String dir : stack) res = "/" + dir + res;
        return res.isEmpty() ? "/" : res;
    }

    //    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new <Integer, Integer>HashMap();

        for (int x : nums) {
            if (hash.containsKey(x)) {       //if hashmap contains 'element', then increase correspoding val
                int count = hash.get(x);
                hash.put(x, ++count);
            } else
                hash.put(x, 1);           //if hashmap does not contain  'element', then put it in hashmap
        }

        for (int x : hash.keySet()) {       //Iterate through 'keys' of HashMap
            if (hash.get(x) == 1)            //if 'value' for 'key' is '1', then return that 'key' element
                return x;
        }

        return -1;
    }


    //    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows - 2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    //    Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
    public int jump(int[] N) {
        int len = N.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            }
            next = Math.max(next, N[i] + i);
        }
        return ans;
    }

    //Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
    public static int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        int left = 0, top = 0;
        int right = n - 1, down = n - 1;
        int count = 1;
        while (left <= right) {
            for (int j = left; j <= right; j++) {
                ret[top][j] = count++;
            }
            top++;
            for (int i = top; i <= down; i++) {
                ret[i][right] = count++;
            }
            right--;
            for (int j = right; j >= left; j--) {
                ret[down][j] = count++;
            }
            down--;
            for (int i = down; i >= top; i--) {
                ret[i][left] = count++;
            }
            left++;
        }
        return ret;
    }

    String[][] frameGenerator(int n) {
        int _i = n;
        int _j = n;

        String[][] array = new String[_i][_j];
        for (int i = 0; i < _i; i++) {
            for (int j = 0; j < _j; j++) {
                if (i == 0 || j == 0 || i == _i - 1 || j == _j - 1) {
                    array[i][j] = "*";
                }
            }
        }
        return array;
    }

//Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String str:wordDict) set.add(str);

        boolean dp[]= new boolean[s.length()+1];
        dp[0]=true;
        for (int i = 1; i <=s.length(); i++) {
            for (int j = i-1; j>=0; j--) {
                if (set.contains(s.substring(j, i))&&dp[j]) {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


//    Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
//Note that division between two integers should truncate toward zero.
//It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.

    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens) {
            if(s.equals("+")) {
                S.add(S.pop()+S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            }
            else if(s.equals("*")) {
                S.add(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            }
            else {
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }

//    Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<Integer>();

        for(int num: nums) set.add(num);
        int max = 1;
        for(int num: nums) {
            if(set.remove(num)) {//num hasn't been visited
                int val = num;
                int sum = 1;
                while(set.remove(val-1)) val--;
                sum += num - val;

                val = num;
                while(set.remove(val+1)) val++;
                sum += val - num;

                max = Math.max(max, sum);
            }
        }
        return max;
    }

//There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i]. You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
//Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for(int i = 0; i < gas.length; i++)
            tank += gas[i] - cost[i];
        if(tank < 0)
            return - 1;

        int start = 0;
        int accumulate = 0;
        for(int i = 0; i < gas.length; i++){
            int curGain = gas[i] - cost[i];
            if(accumulate + curGain < 0){
                start = i + 1;
                accumulate = 0;
            }
            else accumulate += curGain;
        }

        return start;
    }



//    An n-bit gray code sequence is a sequence of 2n integers where:
//
//    Every integer is in the inclusive range [0, 2n - 1],
//    The first integer is 0,
//    An integer appears no more than once in the sequence,
//    The binary representation of every pair of adjacent integers differs by exactly one bit, and
//    The binary representation of the first and last integers differs by exactly one bit.
//    Given an integer n, return any valid n-bit gray code sequence.
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0));
        for (int i = 0; i < n; ++i) {
            int prependVal = (1 << i);
            int oldSize = result.size();
            for (int j = oldSize - 1; j >= 0; --j) {
                result.add(result.get(j) + prependVal);
            }
        }
        return result;
    }


//    Given a string s containing only digits, return all possible valid IP addresses that can be obtained from s. You can return them in any order.
//    A valid IP address consists of exactly four integers, each integer is between 0 and 255, separated by single dots and cannot have leading zeros. For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.


    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new LinkedList<>();
        int[] path = new int[4];
        helper(ret, s, 0,  path, 0);
        return ret;
    }

    void helper(List<String> acc, String s, int idx, int[] path,  int segment){
        if(segment == 4 && idx == s.length() ){
            acc.add(path[0] + "." + path[1] + "."+ path[2] + "." + path[3]);
            return ;
        }else if(segment == 4 || idx == s.length() ){
            return ;
        }

        for(int len = 1; len <= 3 && idx + len <= s.length() ; len ++){
            int val = Integer.parseInt(s.substring(idx, idx + len));
            // range check, no leading 0.
            if(val > 255 || len >= 2  && s.charAt(idx) == '0')
                break;

            path[segment] = val;
            helper(acc, s, idx + len, path, segment + 1);
            path[segment] = -1; // for debug.
        }
    }



//    Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
//    It is guaranteed that the answer will fit in a 32-bit integer.
//    A subarray is a contiguous subsequence of the array.
    public int maxProduct(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }


//     Find Minimum in Rotated Sorted Array
    public int findMin(int[] nums) {
        if (nums==null || nums.length==0) { return Integer.MIN_VALUE; }
        int left = 0, right = nums.length-1;
        while (left < right-1) {  // while (left < right-1) is a useful technique
            int mid = left + (right-left)/2;
            if (nums[mid] > nums[right]) { left = mid; }
            else { right = mid; }
        }
        if (nums[left] > nums[right]) { return nums[right]; }
        return nums[left];
    }

//    Given an m x n matrix, return all elements of the matrix in spiral order.
    public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> res = new ArrayList<Integer>();

            if (matrix.length == 0) {
                return res;
            }

            int rowBegin = 0;
            int rowEnd = matrix.length-1;
            int colBegin = 0;
            int colEnd = matrix[0].length - 1;

            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse Right
                for (int j = colBegin; j <= colEnd; j ++) {
                    res.add(matrix[rowBegin][j]);
                }
                rowBegin++;

                // Traverse Down
                for (int j = rowBegin; j <= rowEnd; j ++) {
                    res.add(matrix[j][colEnd]);
                }
                colEnd--;

                if (rowBegin <= rowEnd) {
                    // Traverse Left
                    for (int j = colEnd; j >= colBegin; j --) {
                        res.add(matrix[rowEnd][j]);
                    }
                }
                rowEnd--;

                if (colBegin <= colEnd) {
                    // Traver Up
                    for (int j = rowEnd; j >= rowBegin; j --) {
                        res.add(matrix[j][colBegin]);
                    }
                }
                colBegin ++;
            }

            return res;
        }



//The set [1, 2, 3, ..., n] contains a total of n! unique permutations.
//    By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
    public String getPermutation(int n, int k) {
        List<Integer> num = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) num.add(i);
        int[] fact = new int[n];  // factorial
        fact[0] = 1;
        for (int i = 1; i < n; i++) fact[i] = i*fact[i-1];
        k = k-1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--){
            int ind = k/fact[i-1];
            k = k%fact[i-1];
            sb.append(num.get(ind));
            num.remove(ind);
        }
        return sb.toString();
    }


}

