import java.util.*;


public class HackerRank {
//    public static void main(String[] args) {
//        try {
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.doubleValue();
//            System.out.println(x + b + d);
//        } catch (NumberFormatException e) {
//            System.out.println("bad number");
//        }
//
//    }

    public static boolean stringComparator(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i] && a.length == b.length) {
                return true;
            }
        }
        return true;
    }


    public static int sockMerchant(int n, List<Integer> ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int element = ar.get(i);
            if (set.contains(element)) {
                set.remove(element);
                count++;
            } else {
                set.add(element);
            }
        }
        return count;
    }


    public static int countingValleys(int steps, String path) {
        int valleyCounter = 0;
        int altitude = 0;
        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCounter++;
                }
            } else {
                altitude--;
            }
        }
        return valleyCounter;
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int count = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) != c.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aa = 0;
        int bb = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aa++;
            } else if (a.get(i) < b.get(i)) {
                bb++;
            }
        }
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(aa, bb));
        return numbers;
    }

    public static long repeatedString(String s, long n) {
        long whole = n / s.length();
        int remainder = (int) (n % s.length());
        long found = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                found++;
            }
        }
        long total = found * whole;
        if (remainder == 0)
            return total;
        else {
            String part = s.substring(0, remainder);
            for (char ch : part.toCharArray()) {
                if (ch == 'a') {
                    total++;
                }
            }
        }
        return total;
    }

    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 != 0 && i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }




}
