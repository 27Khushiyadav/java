/* Ques4:-  Define a Worker class with DailyWorker and SalariedWorker as its subclasses. 
Each worker has a name and salary rate. Implement a method computePay(int hours)
to compute weekly pay. DailyWorker is paid based on the number of days worked 
(assuming 8 hours per day), whereas SalariedWorker receives a fixed wage for
 40 hours per week, regardless of actual hours worked. Use polymorphism to implement 
this program and test worker salary calculations. */
// Superclass Worker
class Worker {
    protected String name;
    protected double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute pay (to be overridden by subclasses)
    public double computePay(int hours) {
        return 0;  // Default implementation, overridden in subclasses
    }
}

// Subclass DailyWorker
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day
        return daysWorked * salaryRate;
    }
}

// Subclass SalariedWorker
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return salaryRate * 40; // Fixed weekly pay for 40 hours
    }
}

// Main class to test the program
public class WorkerSalaryTest {
    public static void main(String[] args) {
        // Creating objects of different workers
        DailyWorker dailyWorker = new DailyWorker("John Doe", 100);
        SalariedWorker salariedWorker = new SalariedWorker("Jane Smith", 50);

        // Computing and displaying weekly salaries
        System.out.println("Daily Worker Salary for 48 hours: $" + dailyWorker.computePay(48));
        System.out.println("Salaried Worker Salary for 50 hours: $" + salariedWorker.computePay(50));
    }
}
