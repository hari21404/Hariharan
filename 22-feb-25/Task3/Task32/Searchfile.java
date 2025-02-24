package Task3.Task32;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Searchfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter file extension (e.g., .txt, .java, .pdf): ");
        String extension = scanner.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(extension.toLowerCase());
            String[] files = directory.list(filter);
            if (files != null && files.length > 0) {
                System.out.println("Files with extension '" + extension + "' in: " + directoryPath);
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found with the extension '" + extension + "'.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }

        scanner.close();
    }
}