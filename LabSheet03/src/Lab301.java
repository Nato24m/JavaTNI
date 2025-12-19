import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer number: ");
        int number = scan.nextInt();
        if (number > 0)
        {
            System.out.print(number % 2 == 0 ? "This number Even and Positive number" : "This number is Odd and Positive number.");
        }
        else if (number < 0)
        {
            System.out.print(number % 2 == 0 ? "This number Even and Negative number" : "This number is Odd and Negative number.");
        }
        else
        {
            System.out.print("This is Zero number.");
        }
    }
}