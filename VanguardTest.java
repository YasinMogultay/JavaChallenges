import java.util.Collections;
import java.util.List;

public class VanguardTest {

    public static char maximumOccurringCharacter(String text) {
        // Write your code here
        int count[] = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++)
            count[text.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[text.charAt(i)]) {
                max = count[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static int toolchanger(List<String> tools, int startIndex, String target) {
        // Write your code here
        int sol = 0;
        int negSol = 0;
        for (int i = startIndex; i < tools.size(); i ++){
            sol = tools.indexOf(target) - startIndex;
            negSol = startIndex - tools.indexOf(target);
        }

        if (startIndex == tools.indexOf(target)){
            return startIndex;
        } else if (sol > negSol * (-1)){
            return negSol;
        } else {
            return sol;
        }

    }


    public static int pickingNumbers(List<Integer> tickets) {
        // **** empty or 1 item ****
        if (tickets.size() <= 1)
            return 0;
        Collections.sort(tickets);

        int maxCount = 0;
        int count = 0;
        int fi = 0;

        for (int i = 1; i < tickets.size(); i++) {

            // **** count this entry (if needed) ****
            if (Math.abs(tickets.get(fi) - tickets.get(i)) <= 1) {
                maxCount = count;
            }

            else {
                count = 0;
                fi = i;
            }
        }

        // **** ****
        return maxCount;

    }


}
