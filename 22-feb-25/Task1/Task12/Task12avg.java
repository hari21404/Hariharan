package Task1.Task12;
import java.util.Arrays;
import java.util.Scanner;
public class Task12avg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();

            int[] marks = new int[numSubjects];
            System.out.print("Enter marks: ");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            students[i] = new Student(name, marks);
        }

        Arrays.sort(students);

        System.out.println("Students sorted by total marks:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        scanner.close();
    }
}
