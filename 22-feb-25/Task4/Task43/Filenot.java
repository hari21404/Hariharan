package Task4.Task43;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Filenot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("Error: File '" + filePath + "' not found!");
            } else {
                Scanner sc = new Scanner(file);
                System.out.println("File Content:");
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
