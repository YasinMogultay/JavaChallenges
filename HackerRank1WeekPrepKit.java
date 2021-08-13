import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HackerRank1WeekPrepKit {
    //Day 1
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        //created and float list to store ratios
        List<Float> counts = new ArrayList<>(3);
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        int size = arr.size();
        for (int i : arr) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        //added final ratios to array
        counts.add(positiveCount / size);
        counts.add(negativeCount / size);
        counts.add(zeroCount / size);

        //print them one by one
        for (Float i : counts)
            System.out.printf("%.6f \n", i);
    }

    //Q2
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long max = 0;
        long min = 0;
        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
        }
        max = min + arr.get(4) - arr.get(0);
        System.out.println(min + " " + max);
    }

    //Q3
    public static String timeConversion(String s) {
        // Write your code here
        String t = "";
        try {
            SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
            Date date = parseFormat.parse(s);
            t = displayFormat.format(date);
        } catch (Exception e) {
            System.out.println(e);
        }
        return t;
    }

    //Day 2

    //Given an array of integers, where all elements but one occur twice, find the unique element.
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            int temp = a.get(i);
            if (nums.contains(temp)) { //if array contains temp number remove
                nums.remove(nums.indexOf(temp));
            } else {
                nums.add(temp); //else add temp number to array
            }
        }
        return nums.get(0);
    }
}
