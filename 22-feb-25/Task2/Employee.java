package Task2;

public class Employee {

    private int empId;
    private String empName;
    private double salary;
    private int yearsWorked;

    public void setEmployeeDetails(int empId, String empName, double salary, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Loan Eligibility: " + getLoanEligibility());
    }

    public String getLoanEligibility() {
        double annualSalary = salary * 12; // Calculate annual salary

        if (yearsWorked <= 5) {
            return "Not Eligible (Work Experience < 5 years)";
        }

        if (annualSalary >= 15_00_000) {
            return "Eligible for 7 Lakhs Loan";
        } else if (annualSalary >= 10_00_000) {
            return "Eligible for 5 Lakhs Loan";
        } else if (annualSalary >= 6_00_000) {
            return "Eligible for 2 Lakhs Loan";
        } else {
            return "Not Eligible (Annual Salary < 6 Lakhs)";
        }
    }
}

