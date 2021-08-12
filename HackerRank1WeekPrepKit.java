import java.util.ArrayList;
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

}
