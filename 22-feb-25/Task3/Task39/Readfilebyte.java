package Task3.Task39;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Readfilebyte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] fileData = new byte[(int) file.length()];
                fis.read(fileData);

                System.out.println("File successfully read into byte array.");
                System.out.println("File size in bytes: " + fileData.length);
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist.");
        }
        scanner.close();
    }
}
