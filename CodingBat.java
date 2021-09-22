public class CodingBat {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep = false;
        if (!weekday || vacation) {
            sleep = true;
        }
        return sleep;
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble
    //if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true)) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        }
        return false;
    }

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }


    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return 21 - n;
    }

    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 && talking == true)
            return true;
        else if (hour > 20 && talking == true)
            return true;
        return false;
    }

    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || ((a + b) == 10))
            return true;
        return false;
    }

    //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n) {
        return Math.abs(n) == 100;
    }

    //Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == true && (a < 0 && b < 0))
            return true;
        else if (a > 0 && b < 0 && !negative)
            return true;
        else if (a < 0 && b > 0 && !negative)
            return true;
        return false;
    }

    //Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(n).toString();
    }

    //Given a string, return a new string where the first and last chars have been exchanged.
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        char first = str.charAt(0);
        String mid = str.substring(1, str.length() - 1);
        char last = str.charAt(str.length() - 1);
        return first + mid + last;
    }

    //Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    public String front3(String str) {
        if (str.length() >= 3) {
            String firstThree = str.substring(0, 3);
            return firstThree + firstThree + firstThree;
        } else if (str.length() == 2) {
            String firstThree = str.substring(0, 2);
            return firstThree + firstThree + firstThree;
        } else if (str.length() == 1) {
            String firstThree = str.substring(0, 1);
            return firstThree + firstThree + firstThree;
        } else {
            return str;
        }
    }

    //Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0)
            return true;
        return false;
    }

    //Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there
    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    //Given a string, return true if the string starts with "hi" and false otherwise.
    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("hi"))
            return true;
        return false;
    }

    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    public boolean hasTeen(int a, int b, int c) {
        if ((a <= 19 && a >= 13) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
            return true;
        return false;

    }

    //Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del"))
            return str.substring(0, 1) + str.substring(4, str.length());
        return str;
    }

    //Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    public boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equals("ix"))
            return true;
        return false;
    }

    //Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    //Given three int values, a b c, return the largest.
    public int intMax(int a, int b, int c) {
        int large = Math.max(a, b);
        return Math.max(large, c);
    }

    //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    public int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b))
            return b;
        else if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        else
            return 0;
    }

    //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
    public boolean in3050(int a, int b) {
        if ((a <= 40 && a >= 30) && (b <= 40 && b >= 30))
            return true;
        else if ((a <= 50 && a >= 40) && (b <= 50 && b >= 40))
            return true;
        return false;
    }

    //    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
    public int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    //Return true if the given string contains between 1 and 3 'e' chars.
    public boolean stringE(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for (char i : ch) {
            if (i == 'e')
                count++;
        }

        if (count < 4 && count > 0)
            return true;
        else return false;
    }

    //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10)
            return true;
        return false;
    }

    public String endUp(String str) {
        if (str.length() < 3)
            return str.toUpperCase();

        int toCut = str.length() - 3;
        String front = str.substring(0, toCut);
        String back = str.substring(toCut);

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    //    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }

    //Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }

    //    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    //    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i + 1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i + 1, i + 2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }


    //    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        String result = "";
        // Note: the loop increments i by 2
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
            // Alternately could use str.charAt(i)
        }
        return result;
    }

    //    Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    //    Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    //    Given an array of ints, return the number of 9's in the array.
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    //    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    public boolean arrayFront9(int[] nums) {
        // First figure the end for the loop
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

    // Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public boolean array123(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    // Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
    public int stringMatch(String a, String b) {

        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    // Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1); // Could use str.charAt(i) here
            }
        }
        return result;
    }

    // Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    public String altPairs(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }


    // Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

    public String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    // Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

    public int array667(int[] nums) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    //    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
    public boolean noTriples(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return false immediately if every seeing a triple.
        for (int i = 0; i < (nums.length - 2); i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) return false;
        }

        // If we get here ... no triples.
        return true;
    }


    //    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    public boolean has271(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return true immediately when seeing 271.
        for (int i = 0; i < (nums.length - 2); i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) &&              // the "7" check
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {  // the "1" check
                return true;
            }
        }

        // If we get here ... none found.
        return false;
    }

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6)
            return true;
        return false;
    }

//    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    public boolean sameFirstLast(int[] nums) {
        if(nums.length == 1)
            return true;
        if (nums.length > 1 && nums[0] == nums[nums.length-1])
            return true;
        return false;
    }

//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
public boolean commonEnd(int[] a, int[] b) {
    return (a[0] == b[0] ||
            a[a.length -1] == b[b.length -1] );
}

//Given an array of ints length 3, return the sum of all the elements.
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int[] rotateLeft3(int[] nums) {

        return new int[] {nums[1],nums[2],nums[0]};
    }

//    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int[] reverse3(int[] nums) {
        int[] myArray = new int[3];

        myArray[0] = nums[2];
        myArray[1] = nums[1];
        myArray[2] = nums[0];
        return myArray;
    }

//    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[nums.length-1]) {
            nums[0] = nums[0];
            nums[1] = nums[0];
            nums[2] = nums[0];
        }
        else if (nums[0] <= nums[nums.length-1]) {
            nums[0] = nums[nums.length-1];
            nums[1] = nums[nums.length-1];
            nums[2] = nums[nums.length-1];
        }
        return new int[] { nums[0],nums[1],nums[2]};
    }

//    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 0)
            return 0;
        else
            return nums[0] + nums[1];
    }

//    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {
        int[] myArray = new int[] {a[1], b[1]};
        return myArray;
    }

    // Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0],nums[nums.length-1]};
    }

//    Given an int array length 2, return true if it contains a 2 or a 3.
    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
            return true;
        else
            return false;
    }

//    Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3)
            return true;
        else
            return false;
    }

//Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more.
    public int[] makeLast(int[] nums) {
        int[] num = new int[nums.length*2];
        num[nums.length*2 - 1] = nums[nums.length -1];
        return num;
    }

//    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    public boolean double23(int[] nums) {
        if (nums.length < 2)
            return false;
        if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3))
            return true;
        else
            return false;
    }

//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;
        return new int[] {nums[0],nums[1],nums[2]};
    }

//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0) {
            if (a[0]== 1) count++; }
        if (b.length != 0) {
            if (b[0]== 1) count++; }

        return count;
    }


}
