/*2. Create an ArrayList to store Employee objects with attributes like name, id, and salary. 
Add three employees, update one employee's salary, remove another by their id, and print the remaining employees
 */
import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Add 3 employees
        employeeList.add(new Employee("Alice", 101, 50000));
        employeeList.add(new Employee("Bob", 102, 60000));
        employeeList.add(new Employee("Charlie", 103, 55000));

        // Update salary for employee with ID 102
        for (Employee emp : employeeList) {
            if (emp.getId() == 102) {
                emp.setSalary(65000); // updated salary
                break;
            }
        }

        // Remove employee with ID 101
        employeeList.removeIf(emp -> emp.getId() == 101);

        // Print remaining employees
        System.out.println("Remaining Employees:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
