import java.util.Arrays;
import java.util.HashSet;

public class CoreJava {

    public static void main(String[] args) {
        System.out.println(addTwoDigits(29));
        System.out.println(largestNumber(2));
        int[] statues = {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive(statues));
    }

    public static int addTwoDigits(int n) {
        return (n % 10) + (n / 10);
    }

    public static int largestNumber(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    public static int candies(int n, int m) {
        int div = m / n;
        return div * n;
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int n1 = (nCols - col) + 1;
        int n2 = nRows - row;
        return n1 * n2;
    }

    public static int maxMultiple(int divisor, int bound) {
        return (bound / divisor) * divisor;
    }

    public static boolean reachNextLevel(int experience, int threshold, int reward) {
        if ((experience + reward) < threshold) {
            return false;
        } else {
            return true;
        }
    }

    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW)
            return value1 + value2;
        else if (weight1 > maxW && weight2 > maxW)
            return 0;
        else if (weight1 <= maxW && weight2 > maxW)
            return value1;
        else if (weight2 <= maxW && weight1 > maxW)
            return value2;
        else if (value1 >= value2)
            return value1;
        else if (value1 < value2)
            return value2;

        return 0;
    }

    public static int extraNumber(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
    }


    public static int adjacentElementsProduct(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > max) {
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

    public static int makeArrayConsecutive(int[] statues) {
        Arrays.sort(statues);
        int length = statues.length;
        int minNum = statues[0];
        int maxNum = statues[length - 1];
        return maxNum - minNum - length + 1;
    }

    public static boolean almostIncreasing(int[] sequence) {
        int size = sequence.length;
        int counter = 0;
        if (size == 2)
            return true;
        for (int i = 0; i < size - 1; i++) {
            if (sequence[i + 1] <= sequence[i]) {
                counter++;
                boolean skipNeighbor = i + 2 < size && sequence[i + 2] <= sequence[i];
                boolean skipBack = i - 1 >= 0 && sequence[i + 1] <= sequence[i - 1];
                if (skipBack && skipNeighbor || counter >= 2)
                    return false;
            }
        }
        return true;
    }



}
