package Weak2Task.Abstraction;

abstract class animal
{
    abstract void makeSound();

}

public class Dog extends animal {
    @Override
    public void makeSound()
    {
        System.out.println("dog is barking.");
    }

    public static void main(String[] args) {
        Dog an=new Dog();
        an.makeSound();
    }
}
