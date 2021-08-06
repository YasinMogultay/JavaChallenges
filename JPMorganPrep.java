import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JPMorganPrep {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        List<Character> open = Arrays.asList('(','{','[');
        List<Character> close = Arrays.asList(')','}','[',']');
        for (char i : s.toCharArray()){

        }
    }
}
