package Weak2Task.PrimitiveandReferenceVariable;

import java.util.Scanner;

public class TrailingZeroes {
    public static int countTrailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number = in.nextInt();
        int trailingZeroes = countTrailingZeroes(number);
        System.out.println("Number of trailing zeroes in " + number + "! is: " + trailingZeroes);
    }
}
