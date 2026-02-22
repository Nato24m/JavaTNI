package Banking;
import java.util.Scanner;
public class BankSystem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank account: ");
        String id = sc.nextLine();
        AccountTransaction account = new AccountTransaction(id);
        if (!account.hasAccountId()) {
            System.out.println("Bank account not found...");
            return;
        }
        System.out.println();
        System.out.println("Press 1 to deposit");
        System.out.println("Press 2 to withdraw");
        System.out.println("Press 3 to check balance");
        System.out.println("Press 4 to exit");

        int menu;
        while (true) {
            System.out.print("\nEnter a menu: ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
                System.out.println("Your balance = " + account.checkBalance());
            }
            else if (menu == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                System.out.println("Your balance = " + account.checkBalance());
            }
            else if (menu == 3) {
                System.out.println("Your balance = " + account.checkBalance());
            }
            else if (menu == 4) {
                break;
            }
        }
    }
}