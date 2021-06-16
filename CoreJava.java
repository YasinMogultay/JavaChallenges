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



}
