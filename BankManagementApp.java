import java.util.Scanner;

public class BankManagementApp{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int choice;

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Amount deposited successfully.");

            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }

            } else if (choice == 3) {
                System.out.println("Current Balance: " + balance);

            } else if (choice == 4) {
                System.out.println("Thank you! Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
