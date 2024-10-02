import java.util.Scanner;

public class BankingSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAcount account = new BankAcount();

        int choice;
        do {
            System.out.println("___________________________________________");
            System.out.println("-----------------MAIN MENU-----------------");
            System.out.println("\n1. Check Balance\t2. Deposit Money");
            System.out.println("2. Deposit Money\t3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear input salah
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawal(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
        scanner.close();
    }
}
