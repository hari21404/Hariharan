package Task1.Task13;

import java.util.Arrays;

public class EqualsVsDeepEquals{
    public static void main(String[] args) {
        // Case 1: Comparing primitive arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("Case 1: Primitive Arrays");
        System.out.println("equals() result: " + Arrays.equals(arr1, arr2));
        System.out.println("deepEquals() result: " + Arrays.deepEquals(new Object[]{arr1}, new Object[]{arr2}));
        System.out.println();

        Integer[][] nestedArr1 = {{1, 2}, {3, 4}};
        Integer[][] nestedArr2 = {{1, 2}, {3, 4}};

        System.out.println("Case 2: Nested Arrays");
        System.out.println("equals() result: " + Arrays.equals(nestedArr1, nestedArr2));
        System.out.println("deepEquals() result: " + Arrays.deepEquals(nestedArr1, nestedArr2));
        System.out.println();

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println("Case 3: Objects");
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s2: " + (s1 == s2));
    }
}