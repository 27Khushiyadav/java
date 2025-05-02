/*2. 
 Write a Java program to create an abstract class Employee with abstract methods calculateSalary() 
 and displayDetails(). Derive two classes Manager and Developer from Employee and implement the methods 
 to calculate the salary (e.g., based on fixed salary or hourly wage) and display employee details 
 (e.g., name, role, salary). In the main() method, create objects of Manager and Developer and test their functionality.
 */

 import java.util.Scanner;  // Import Scanner for user input

 // Abstract class Employee with abstract methods
 abstract class Employee {
     String name, role;
     
     Employee(String name, String role) {
         this.name = name;
         this.role = role;
     }
 
     abstract void calculateSalary();
     abstract void displayDetails();
 }
 
 // Manager class inheriting Employee
 class Manager extends Employee {
     double fixedSalary;
 
     Manager(String name, double fixedSalary) {
         super(name, "Manager");
         this.fixedSalary = fixedSalary;
     }
 
     void calculateSalary() {
         System.out.println("Salary: Rs" + fixedSalary);
     }
 
     void displayDetails() {
         System.out.println("Name: " + name + ", Role: " + role);
         calculateSalary();
     }
 }
 
 // Developer class inheriting Employee
 class Developer extends Employee {
     double hourlyRate;
     int hoursWorked;
 
     Developer(String name, double hourlyRate, int hoursWorked) {
         super(name, "Developer");
         this.hourlyRate = hourlyRate;
         this.hoursWorked = hoursWorked;
     }
 
     void calculateSalary() {
         double salary = hourlyRate * hoursWorked;
         System.out.println("Salary: Rs" + salary);
     }
 
     void displayDetails() {
         System.out.println("Name: " + name + ", Role: " + role);
         calculateSalary();
     }
 }
 
 // Main class to test the program
 public class Company {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);  // Scanner for user input
 
         // Input for Manager
         System.out.print("Enter Manager's name: ");
         String managerName = scanner.nextLine();
         System.out.print("Enter Manager's fixed salary: ");
         double managerSalary = scanner.nextDouble();
 
         // Input for Developer
         scanner.nextLine(); // Consume newline
         System.out.print("Enter Developer's name: ");
         String developerName = scanner.nextLine();
         System.out.print("Enter Developer's hourly rate: ");
         double hourlyRate = scanner.nextDouble();
         System.out.print("Enter hours worked by Developer: ");
         int hoursWorked = scanner.nextInt();
 
         // Creating objects
         Manager manager = new Manager(managerName, managerSalary);
         Developer developer = new Developer(developerName, hourlyRate, hoursWorked);
 
         // Displaying details
         System.out.println("\nManager Details:");
         manager.displayDetails();
         
         System.out.println("\nDeveloper Details:");
         developer.displayDetails();
 
         scanner.close(); // Close scanner
     }
 }
 