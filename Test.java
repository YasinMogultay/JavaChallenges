import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {

//Given an array of non-negative integers, write a method that finds the first non-consecutive integer.
//The array is sorted in ascending order and does not contain any duplicates. For example, if the array is {4,5,7,8},
//then the method returns 7, since 7 does not come after 5. If the whole array is consecutive, then return -1.
// If the array does not have at least two values, then return -1.

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(7);
        nums.add(8);
        System.out.println(nonCons(nums));
    }


    public static int nonCons(ArrayList<Integer> ints) {
        if (ints.size() < 2)
            return -1;

        for (int i = 0; i < ints.size()-1; i++) {
            if (ints.get(i) + 1 != ints.get(i + 1))
                return ints.get(i + 1);
        }

        return -1;
    }


}
