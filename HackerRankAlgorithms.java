import java.util.*;

public class HackerRankAlgorithms {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;
        for (int n : arr) {
            totalSum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int max = candles.get(candles.size() - 1);
        return Collections.frequency(candles, max);
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

    private static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//
//        if (n % 2 == 0 && n < 5 && n > 2) {
//            System.out.println("Not Weird");
//        } else if (n % 2 == 0 && n < 20 && n > 6) {
//            System.out.println("Weird");
//        } else if (n % 2 == 0 && n > 20) {
//            System.out.println("Not Weird");
//        } else {
//            System.out.println("Weird");
//        }
//    }


    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a + (int) (Math.pow(2, 0)) * b;
            System.out.print(sum + " ");

            for (int j = 1; j < n; j++) {
                sum = sum + (int) (Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }

            System.out.println();
        }
        in.close();
    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> resGrades = new ArrayList<Integer>(grades.size());
        for (int i = 0; i < grades.size(); i++) {
            int res = grades.get(i);
            int res1 = res;
            if (res > 37) {
                for (int j = 0; j < 3; j++) {
                    if (res1 % 5 == 0) {
                        res = res1;
                        break;
                    }
                    res1++;
                }
            }
            resGrades.add(res);
        }
        return resGrades;
    }


}
