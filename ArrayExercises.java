import java.util.ArrayList;
import java.util.List;

public class ArrayExercises {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        List<String> colors = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");

        colors.add("Blue");
        colors.add("Black");

        System.out.println(animals);
        System.out.println(colors);
        System.out.println(animals.isEmpty());
        System.out.println(colors.size());

    }
}
