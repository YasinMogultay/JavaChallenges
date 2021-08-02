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
        // Write your code here
        Collections.sort(arr);
        int minTotal = 0;
        int maxTotal = 0;
        int length = arr.size() - 1;
        for (int i = 0; i < length; i++) {
            minTotal += arr.get(i);
            maxTotal += arr.get(length - i);
        }
        System.out.print(minTotal + " " + maxTotal);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 69, 2, 221, 8974);
//        Collections.sort(list);
//        System.out.println(list);
        miniMaxSum(list);
    }
}
