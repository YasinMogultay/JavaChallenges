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

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 2, 1, 3);
        System.out.println(birthdayCakeCandles(array));
    }
}
