package Task3.Task34;

import java.io.File;
import java.util.Scanner;

public class Checkperm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists()) {
            System.out.println("\nFile/Directory: " + path);
            System.out.println("Readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("Writable: " + (file.canWrite() ? "Yes" : "No"));
        } else {
            System.out.println("The specified path does not exist.");
        }

        scanner.close();
    }
}
