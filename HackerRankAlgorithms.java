import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankAlgorithms {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum=0;
        for (int n : arr) {
            totalSum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println((totalSum-max) + " " + (totalSum-min));
    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int max = candles.get(candles.size()-1);
        return Collections.frequency( candles, max);
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        String time = s.substring(2, 8);
        String meridiem = s.substring(8, 10);

        if (hour.equals("12"))
            hour = "00";

        if (meridiem.equals("AM"))
            return hour + time;
        else
            return String.valueOf(Integer.valueOf(hour) + 12) + time;
    }
}
