import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GoldmanSachsHackerRank {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(6);
        array.add(4);
        array.add(11);
        array.add(5);
        System.out.println(maxPoints(array));
    }

    //Meandering Array Question
    public static List<Integer> meanderingArray(List<Integer> unsorted) {
        List<Integer> finalArr = new ArrayList<>(unsorted.size());
        Collections.sort(unsorted);
        boolean flag = true;
        int small = 0;
        int big = unsorted.size() - 1;

        for (int i = 0; i < unsorted.size(); i++) {
            if (flag) {
                finalArr.add(unsorted.get(big--));
            } else {
                finalArr.add(unsorted.get(small++));
            }

            flag = !flag;
        }
        return finalArr;
    }

    public static long maxPoints(List<Integer> elements) {
        int max = 0;
        for (int i : elements)
            max = Math.max(max, i);
        int[] s = new int[max + 1];
        for (int i : elements)
            s[i] += i;
        for (int i = 2; i <= max; i++)
            s[i] = Math.max(s[i] + s[i - 2], s[i - 1]);
        return s[max];
    }
}
