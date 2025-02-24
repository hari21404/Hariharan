package Task3.Task37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Consolein {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println();
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
