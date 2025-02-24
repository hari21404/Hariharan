package Task4.Task44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}
public class Positiveexept {

    public static void readNumbersFromFile(String filePath) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("Error: File '" + filePath + "' not found!");
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number > 0) {
                        throw new PositiveNumberException("Error: Positive number found -> " + number);
                    }
                } else {
                    scanner.next();
                }
            }
        }

        System.out.println("File processed successfully. No positive numbers found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        try {
            readNumbersFromFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
