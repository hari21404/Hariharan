

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
    
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        colors.add(0, "Red");
        System.out.println("Updated list: " + colors);
    }
}
