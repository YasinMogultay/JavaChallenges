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

}
