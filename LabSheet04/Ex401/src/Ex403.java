import javax.swing.*;

public class Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your Gmail:");

        while (email.toUpperCase().endsWith("@GMAIL.COM")==false)
        {
            email = JOptionPane.showInputDialog("Enter your Gmail:");
        }
        JOptionPane.showMessageDialog(null,"Your mail is " + email);
    }
}
