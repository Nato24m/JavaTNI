
package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    private static Scanner scanner = new Scanner(System.in);
    private static int espressoCount = 0;
    private static int frappuccinoCount = 0;
    private static double totalPrice = 0;

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scanner.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        char choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.print("How many shots for adding in Espresso: ");
            int shots = scanner.nextInt();
            espresso.addShot(shots);
        }

        espressoCount++;
        System.out.println(espresso);
        totalPrice += espresso.calculateFinalPrice();
        return espresso;
    }

    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter a size: ");
        String size = scanner.next();

        System.out.print("Do you would like to add whipped cream? [y/n]: ");
        char choice = scanner.next().charAt(0);
        boolean whipped = (choice == 'y' || choice == 'Y');

        Frappuccino frappe = new Frappuccino(size, whipped);
        frappuccinoCount++;
        totalPrice += frappe.calculateFinalPrice();
        System.out.println(frappe);
        return frappe;
    }

    public static void main(String[] args) {
        char more;
        do {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                orderEspresso();
            } else if (option == 2) {
                orderFrappuccino();
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            more = scanner.next().charAt(0);

        } while (more == 'y' || more == 'Y');

        System.out.println("\nYou ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + totalPrice);
    }
}
