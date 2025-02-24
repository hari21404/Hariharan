package Task4.Task42;

import java.util.Scanner;

public class Oddexep {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try {
            int n = in.nextInt();
            if (n % 2 == 1)
                throw new OddNumberException();
        } catch (OddNumberException e) {

        }
    }
}
class OddNumberException extends Exception {
    public OddNumberException() {
        System.out.println("Oddnumber found");;
    }
}