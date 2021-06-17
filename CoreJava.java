public class CoreJava {

    public static void main(String[] args) {
        System.out.println(addTwoDigits(29));
        System.out.println(largestNumber(2));
    }

  public static int addTwoDigits(int n) {
        return (n % 10) + (n / 10);
    }

    public static int largestNumber(int n) {
        return (int)Math.pow(10,n)-1;
    }

    public static int candies(int n, int m) {
        int div = m / n;
        return div * n;
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int n1 =(nCols - col) + 1;
        int n2 =nRows - row;
        return n1 * n2;
    }

    public static int maxMultiple(int divisor, int bound) {
        return (bound / divisor) * divisor;
    }

    public static boolean reachNextLevel(int experience, int threshold, int reward) {
        if((experience + reward ) < threshold){
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
        if(a == b){
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
    }


}
