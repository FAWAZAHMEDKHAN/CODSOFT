import java.util.Scanner;  

public class ATM {  
    private double balance;  
    private Scanner scanner = new Scanner(System.in);  

    public ATM(double initialBalance) {  
        this.balance = initialBalance;  
    }  

    public void run() {  
        int choice;  
        do {  
            displayMenu();  
            choice = scanner.nextInt();  
            scanner.nextLine(); // Consume newline  

            switch (choice) {  
                case 1:  
                    withdraw();  
                    break;  
                case 2:  
                    deposit();  
                    break;  
                case 3:  
                    checkBalance();  
                    break;  
                case 4:  
                    System.out.println("Thank you for using the ATM.");  
                    break;  
                default:  
                    System.out.println("Invalid choice. Please try again.");  
            }  
        } while (choice != 4);  
        scanner.close();  
    }  

    private void displayMenu() {  
        System.out.println("\nWelcome to the ATM!");  
        System.out.println("1. Withdraw");  
        System.out.println("2. Deposit");  
        System.out.println("3. Check Balance");  
        System.out.println("4. Exit");  
        System.out.print("Enter your choice: ");  
    }  

    private void withdraw() {  
        System.out.print("Enter amount to withdraw: ");  
        double amount = scanner.nextDouble();  
        if (amount > 0 && amount <= balance) {  
            balance -= amount;  
            System.out.println("Withdrawal successful.");  
        } else {  
            System.out.println("Insufficient balance or invalid amount.");  
        }  
    }  

    private void deposit() {  
        System.out.print("Enter amount to deposit: ");  
        double amount = scanner.nextDouble();  
        if (amount > 0) {  
            balance += amount;  
            System.out.println("Deposit successful.");  
        } else {  
            System.out.println("Invalid deposit amount.");  
        }  
    }  

    private void checkBalance() {  
        System.out.println("Your balance is: " + balance);  
    }  

    public static void main(String[] args) {  
        ATM atm = new ATM(1000); // Initial balance  
        atm.run();  
    }  
}