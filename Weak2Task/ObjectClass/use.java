package Weak2Task.ObjectClass;

public class use {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);

        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        System.out.println("secondUser1: " + secondUser1);
        System.out.println("secondUser2: " + secondUser2);


        System.out.println("user1 equals user2: " + user1.equals(user2));
        System.out.println("secondUser1 equals secondUser2: " + secondUser1.equals(secondUser2));

        System.out.println("user1 hashCode: " + user1.hashCode());
        System.out.println("user2 hashCode: " + user2.hashCode());
        System.out.println("secondUser1 hashCode: " + secondUser1.hashCode());
        System.out.println("secondUser2 hashCode: " + secondUser2.hashCode());
    }
}
