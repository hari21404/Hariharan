package Task2;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();
        Employee emp = new Employee();
        emp.setEmployeeDetails(empId, empName, salary, yearsWorked);
        System.out.println("\nEmployee Details:");
        emp.getEmployeeDetails();

        scanner.close();
    }
}
