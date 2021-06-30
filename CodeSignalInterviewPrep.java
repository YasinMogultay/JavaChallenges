import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CodeSignalInterviewPrep {
    public static void main(String[] args) {
       int[] a = new int[]{1, 2, 2, 4};
        int[] b = new int[]{1, 2, 2, 4};

//        System.out.println(firstDuplicate(a));
//        System.out.println(someFunction(b));
//        System.out.println(merge(a,b));
        System.out.println(isSpecial("abcdef"));
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

    public static char firstNotRepeatingCharacter(String s){
      for (int i = 0; i < s.length(); i++) {
          boolean seenDuplicate = false;
          for (int j = 0; j < s.length(); j++) {
              if (s.charAt(i) == s.charAt(j) && (i != j)){
                  seenDuplicate = true;
                  break;
              }
          }
          if (!seenDuplicate)
              return s.charAt(i);
      }
      return '_';
    }








public static List<Integer> someFunction(final List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            result.add(numbers.get(i));
        }
        return result;
}

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[2*i] = a[i];
            result[(2*i)+1] = b[i];
        }
        return result;
    }

    public static boolean isSpecial(String text) {
        String tempText = alterText(text);
        return text.equals(tempText);
    }

    public static String alterText(String inputText){
        if (inputText == null || inputText.isEmpty()) {
            return inputText;
        }
        return inputText.charAt(inputText.length() -1) +
                alterText((inputText.substring(0,inputText.length()-1)));
    }
}
