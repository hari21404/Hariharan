package Task1.Task11;

public class Task11copyarr {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80}; // Example array

        int newSize = (originalArray.length + 1) / 2;
        int[] newArray = new int[newSize];


        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            newArray[index++] = originalArray[i];
        }
        System.out.println("Original array");
        for (int i:originalArray)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("New array");
        for (int i:newArray)
        {
            System.out.print(i+"  ");
        }
    }
}


