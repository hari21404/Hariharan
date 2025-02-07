package Weak2Task.Finalkeyword;

final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class FinalExample {
    private final int CONSTANT_VALUE = 100;

    public void showValue() {
        System.out.println("Final variable value: " + CONSTANT_VALUE);
    }

    public final void displayMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();
        FinalExample fineg=new FinalExample();
        fineg.displayMessage();
        fineg.showValue();
    }
}


