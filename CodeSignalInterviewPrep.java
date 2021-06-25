import java.util.HashSet;

public class CodeSignalInterviewPrep {
    public static void main(String[] args) {
       int[] a = new int[]{1, 2, 2, 4};
        System.out.println(firstDuplicate(a));

    }

    //question https://app.codesignal.com/interview-practice/task/pMvymcahZ8dY4g75q/description

    public static int firstDuplicate(int[] a) {
        int min_second_index = a.length;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j <a.length; j++) {
                if(a[i] == a[j]) {
                    min_second_index = Math.min(min_second_index,j);
                }
            }
        }
        if (min_second_index == a.length)
            return -1;
        else
            return a[min_second_index];
    }

    public static int firstDuplicateSecondSolution(int[] a) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < a.length; i ++) {
            if (seen.contains(a[i])){
                return a[i];
            } else {
                seen.add(a[i]);
            }
        }
        return -1;
    }

//    public static char firstNotRepeatingCharacter(String s) {
//        HashSet<String> seen = new HashSet<>();
//        for(int i = 0; i < s.length(); i++) {
//            if (!seen.contains())
//        }
//    }
}
