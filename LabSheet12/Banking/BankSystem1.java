package Banking;
import java.util.Scanner;
public class BankSystem1 {

    static Scanner sc = new Scanner(System.in);
    public static String input_account_id() {
        String id;
        while (true) {
            System.out.print("Enter account id: ");
            id = sc.nextLine();
            if (id.length() == 10) {
                return id;
            }
        }
    }
    public static double input_initial_balance() {
        double balance = 0;
        System.out.print("\nEnter your initial deposit amount: ");
        while (true) {
            try {
                balance = Double.parseDouble(sc.nextLine());
                return balance;
            } catch (Exception e) {
                System.out.print("Try again!! Enter your initial deposit amount: ");
            }
        }
    }
    public static void main(String[] args) {
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);

        System.out.println();
        System.out.println(account.recordAccount());
    }
}