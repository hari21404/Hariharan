package Task3.Task33;

import java.io.File;
import java.util.Scanner;

public class Filecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();

        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path refers to an existing file.");
            } else if (file.isDirectory()) {
                System.out.println("The path refers to an existing directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }

        scanner.close();
    }
}
