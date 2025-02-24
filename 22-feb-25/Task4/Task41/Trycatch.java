package Task4.Task41;

public class Trycatch {

    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic excepion");
        }
    }
}
