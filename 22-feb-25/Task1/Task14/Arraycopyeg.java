package Task1.Task14;

import java.util.Arrays;

public class Arraycopyeg {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("Original array");
        for (int i:originalArray)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("Copy of array:");
        for (int i:copiedArray)
            System.out.print(i+"  ");
    }
}
