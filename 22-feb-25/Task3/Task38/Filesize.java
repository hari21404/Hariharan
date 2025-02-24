package Task3.Task38;

import java.io.File;
import java.util.Scanner;
public class Filesize {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();
            File file = new File(filePath);

            if (file.exists() && file.isFile()) {
                long fileSizeBytes = file.length();
                double fileSizeKB = fileSizeBytes / 1024.0;
                double fileSizeMB = fileSizeKB / 1024.0;

                System.out.println("File Size:");
                System.out.println();
                System.out.println("Bytes: " + fileSizeBytes + " B");
                System.out.println();
                System.out.printf("Kilobytes: %.2f KB", fileSizeKB);
                System.out.println();
                System.out.printf("Megabytes: %.2f MB", fileSizeMB);
            } else {
                System.out.println("The specified file does not exist.");
            }
            scanner.close();
        }
}
