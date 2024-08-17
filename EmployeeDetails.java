import java.util.Scanner;
class Employee {
    String empId, empName;
    int phone;
    float salary;
    public void accept(Scanner scanner) {
        System.out.println("Enter employee id:");
        empId = scanner.next();
        System.out.println("Enter employee name:");
        empName = scanner.next();
        System.out.println("Enter employee phone number:");
        phone = scanner.nextInt();
        System.out.println("Enter employee salary:");
        salary = scanner.nextFloat();
        scanner.nextLine();  // Consume newline
    }
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Phone: " + phone);
        System.out.println("Employee Salary: " + salary);
    }
}
class Teaching extends Employee {
    String domain;
    int noPublications;
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("Enter domain:");
        domain = scanner.nextLine();
        System.out.println("Enter number of publications:");
        noPublications = scanner.nextInt();
    }
    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Number of Publications: " + noPublications);
    }
}
class Technical extends Employee {
    String skills;
    public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("Enter skills:");
        skills = scanner.nextLine();
    }
    public void display() {
        super.display();
        System.out.println("Skills: " + skills);
    }
}
class Contract extends Employee {
    int period;
   public void accept(Scanner scanner) {
        super.accept(scanner);
        System.out.println("Enter contract period:");
        period = scanner.nextInt();
    }
    public void display() {
        super.display();
        System.out.println("Contract Period: " + period);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teaching t1 = new Teaching();
        Technical t2 = new Technical();
        Contract t3 = new Contract();
        System.out.println("Enter details for Teaching employee:");
        t1.accept(scanner);
        System.out.println("\nTeaching Employee details:");
        t1.display();
        System.out.println("\nEnter details for Technical employee:");
        t2.accept(scanner);
        System.out.println("\nTechnical Employee details:");
        t2.display();
        System.out.println("\nEnter details for Contract employee:");
        t3.accept(scanner);
        System.out.println("\nContract Employee details:");
        t3.display();
        scanner.close();  // Close the scanner at the end
    }
}
