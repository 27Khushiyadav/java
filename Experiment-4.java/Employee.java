/* QUESTION 5 :- A company wants to develop an Employee Management System to track employee details such as name, department, salary, and 
employee ID. The system should also calculate the total salary expenditure and keep a record of the total number of employees. 
Implement a Java program by creating an Employee class that includes instance variables for employee ID, name, department, and salary. 
The class should have a default constructor that initializes employee details with default values and a parameterized constructor that
 sets employee details based on user input. Use a static variable totalEmployees to track the total number of employees and implement a 
 static method to display this count. Additionally, define a method calculateSalary() that returns the salary of the employee and another 
 method displayEmployeeInfo() to display all employee details. To ensure data encapsulation, mark the salary variable as private and provide
 a public method to access it. 
Declare the totalEmployees variable as static so that it is shared among all instances. In the main method, create multiple Employee 
objects using both default and parameterized constructors. Use the this keyword in the constructors to distinguish between
 class variables and constructor parameters. Finally, display the total number of employees and the salary details for each employee. 
 The program should successfully demonstrate the behavior of static and non-static members, the initialization of objects using constructors, 
 and the role of access modifiers in an employee management scenario.


*/
public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    
    // Static variable to track total number of employees
    private static int totalEmployees = 0;
    
    // Default constructor
    public Employee() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }
    
    // Parameterized constructor
    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    
    // Method to calculate salary
    public double calculateSalary() {
        return this.salary;
    }
    
    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
    
    // Getter method for salary
    public double getSalary() {
        return salary;
    }
    
    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public static void main(String[] args) {
        // Creating employees using both constructors
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "HR", 50000);
        Employee emp3 = new Employee(102, "Bob", "IT", 60000);
        
        // Displaying employee details
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        
        // Displaying total number of employees
        Employee.displayTotalEmployees();
    }
}
    

