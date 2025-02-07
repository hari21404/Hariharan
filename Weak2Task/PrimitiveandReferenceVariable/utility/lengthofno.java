package Weak2Task.PrimitiveandReferenceVariable.utility;

import java.util.Scanner;

public class lengthofno {
    public static int utility(int n)
    {
        int count=0;
        while (n>0)
        {
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(utility(n));
    }
}
