package Task1.Task12;


import java.util.Arrays;

public class Student implements Comparable<Student> {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    
    private void calculateTotalAndAverage() {
        total = Arrays.stream(marks).sum();
        average = (double) total / marks.length;
    }

    // Compare students based on total marks (Descending order)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.total, this.total); // Sorting in descending order
    }

    // Display student details
    public void display() {
        System.out.println(name + " - Total: " + total + ", Average: " + average);
    }
}
