

import java.util.LinkedList;

public class Task17 {
    public static void main(String[] args) {
        LinkedList<String> desserts = new LinkedList<>();
        desserts.add("Cake");
        desserts.add("Ice Cream");

        desserts.addFirst("Brownie"); // Inserts at the front
        System.out.println("Updated desserts list: " + desserts);
    }
}
