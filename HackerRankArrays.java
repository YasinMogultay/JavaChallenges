import java.util.*;

public class HackerRankArrays {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        for (int i = 0; i < d; i++) {
            int temp = a.get(0); // temporary variable to store 1st element
            a.remove(0);//remove first element
            a.add(temp);//adding the value of temp to last
        }
        return a;
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int temp, sol = -19;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //calculating  all hourglass(array) variations
                temp = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                //checking temp is greatest number and if yes assign to sol which is solution
                if (temp > sol) {
                    sol = temp;
                }
            }
        }
        return sol;
    }

    public static void countSwaps(List<Integer> a) {
        List<Integer> comp = new ArrayList<>(a);
        Collections.sort(a);
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            int temp1 = a.get(0);
            if (!a.equals(comp)) {
                a.remove(0);
                a.add(temp1);
                count++;
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.\n" +
                "First Element: " + a.get(0) + "\n" +
                "Last Element: " + a.get(a.size() - 1));
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long total = 0;
        for (int i = 0; i < ar.size(); i++) {
            total += ar.get(i);
        }

        return total;
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos = 0, neg = 0, zero = 0;
        int size = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f %n %.6f %n %.6f %n", (float) pos / size, (float) neg / size, (float) zero / size);
    }


}
