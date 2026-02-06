import java.util.Scanner;

public class CakeOrder2 {

    static String selectFlavor() {
        Scanner scanner = new Scanner(System.in);
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};
        int choice;

        for (int i = 0; i < flavors.length; i++) {
            System.out.println("Press " + (i + 1) + " for " + flavors[i]);
        }

        while (true) {
            System.out.print("Enter a flavor number: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= flavors.length) {
                return flavors[choice - 1];
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Cream Horn");
        System.out.print("Enter an option: ");
        int option = scanner.nextInt();
        System.out.println(" ");

        if (option == 1) {
            String flavor = selectFlavor();
            scanner.nextLine();

            System.out.println(" ");
            System.out.print("Enter message: ");
            String message = scanner.nextLine();

            System.out.print("How many pounds: ");
            double pound = scanner.nextDouble();
            System.out.println(" ");

            BirthdayCake order = new BirthdayCake(message, pound, flavor, 350);
            System.out.println(order);

        }
        else if (option == 2) {
            String flavor = selectFlavor();

            System.out.print("\nHow many pieces: ");
            int piece = scanner.nextInt();

            System.out.println(" ");
            CupCake order = new CupCake(piece, flavor, 70);
            System.out.println(order);
        }
        else if (option == 3) {
            String flavor = selectFlavor();

            System.out.print("How many Cream Horn pastries: ");
            int pastry = scanner.nextInt();

            CreamHorn order = new CreamHorn(pastry, flavor, 15);
            System.out.println(order);

        }
        else {
            System.out.println("\nWrong option!! Try again!!");
        }
    }
}
