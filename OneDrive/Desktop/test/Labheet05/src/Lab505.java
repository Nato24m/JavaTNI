import javax.swing.*;

public class Lab505 {
    public static boolean is_palindrome(String word)
    {
        word = word.toLowerCase();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }

    static void main() {
        String word = JOptionPane.showInputDialog(null,"Enter some word:");
        if ( is_palindrome(word)) JOptionPane.showMessageDialog(null,word+" is Palindrome");
        else JOptionPane.showMessageDialog(null,word+" is NOT Palindrome");
    }
}
