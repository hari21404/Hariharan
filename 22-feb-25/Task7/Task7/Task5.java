
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        colors.set(2,"White");
        System.out.println(colors);
    }
}
