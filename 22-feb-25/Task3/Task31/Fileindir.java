package Task3.Task31;

import java.io.File;
import java.util.Scanner;

public class Fileindir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path");
        String directoryPath = sc.nextLine();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null && files.length > 0) {
                System.out.println("Files and Directories in: " + directoryPath);
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}



