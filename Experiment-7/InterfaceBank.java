/*3. Write a Java program to create an interface Bank with methods deposit(double amount) and withdraw(double amount).
 Implement this interface in a class Account that overrides these methods to perform deposit and withdrawal operations on a
  balance variable. Create another class BankDemo with a main() method to test the functionality by depositing and 
  withdrawing amounts and displaying the updated balance. */


    import java.util.Scanner;  // Import Scanner for user input

// Bank interface with deposit and withdraw methods
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Account class implementing Bank interface
class Account implements Bank {
    private double balance;

    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: Rs" + balance);
    }
}

// BankDemo class with main() method to test functionality
public class InterfaceBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking initial balance input from user
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating Account object
        Account account = new Account(initialBalance);

        // Deposit operation
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        account.displayBalance();

        // Withdraw operation
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();

        scanner.close(); // Close scanner
    }
}

    

