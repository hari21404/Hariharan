package Task1.Task15;

import java.util.Scanner;

public class Altercap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = capitalizeAlternate(input);

        System.out.println("Output: " + result);

        scanner.close();
    }


    public static String capitalizeAlternate(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize even index
            } else {
                sb.append(str.charAt(i)); // Lowercase odd index
            }
        }
        return sb.toString();
    }
}
