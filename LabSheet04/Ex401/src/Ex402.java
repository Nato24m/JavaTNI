import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first message:");
        String msg1 = scanner.nextLine();
        System.out.println("Enter the second message:");
        String msg2 = scanner.nextLine();

        System.out.println("Insenitive comparison");
        if (msg1.equalsIgnoreCase(msg2))
        {
        }
    }
}
