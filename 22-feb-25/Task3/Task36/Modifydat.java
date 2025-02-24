package Task3.Task36;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Modifydat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Last Modified Date: " + dateFormat.format(date));
        } else {
            System.out.println("The specified file does not exist.");
        }

        scanner.close();
    }
}
