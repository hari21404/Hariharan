package Task4.Task45;
import java.io.*;
import java.util.Scanner;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}
public class FileEmpty {

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path:");
        String filePath = sc.nextLine();
        try {
            checkFileNotEmpty(filePath);
            System.out.println("File is not empty. Proceeding with reading...");
        } catch (EmptyFileException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String filePath) throws EmptyFileException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            if (br.readLine() == null) {
                throw new EmptyFileException("The file is empty: " + filePath);
            }
        }
    }
}
}