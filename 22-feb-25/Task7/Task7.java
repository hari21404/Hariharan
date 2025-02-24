

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

       
        if (colors.contains("Red")) {
            System.out.println(  "Red is in the list.");
        } else {
            System.out.println("Red is not in the list.");
        }
    }
}
