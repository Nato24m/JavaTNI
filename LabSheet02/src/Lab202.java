import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###.##");
        System.out.print("Enter number 1: ");
        double numberone = scan.nextInt();
        System.out.print("Enter number 2: ");
        double numbertwo = scan.nextInt();
        System.out.println("\nSummation = " + frm.format(numberone + numbertwo));
        System.out.println("Subtraction = " + frm.format(numberone - numbertwo));
        System.out.println("Multiplication = "+ frm.format(numberone * numbertwo));
        System.out.println("Division = " + frm.format(numberone / numbertwo));
        System.out.println("Modulus = " + frm.format(numberone % numbertwo));
    }
}
