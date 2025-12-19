import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String total = "";
        while (true) {
            System.out.print("Enter word: ");
            word = sc.next();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            total = total + word + " ";
        }
        System.out.println(total.trim());
    }
}
