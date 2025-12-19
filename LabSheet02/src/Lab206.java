import javax.swing.*;
import java.lang.classfile.CustomAttribute;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final int buffe_price = 299;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        int customer = Integer.parseInt(
                JOptionPane.showInputDialog("How many customer?"));
        double net = buffe_price * customer + (buffe_price * customer * 7.0 / 100);

        int discount_coupon = Integer.parseInt(
                JOptionPane.showInputDialog("Price with NET is "+ frm.format(net)  + "baht.\nHow much of discount(%) on your coupon"));
double total_coupon = net - (net * discount_coupon / 100.0);
        int customer_paid = Integer.parseInt(
                JOptionPane.showInputDialog("Total price is " + frm.format(total_coupon) +"baht.\nEnter the amount the customer paid:"));
        double get_change = customer_paid - total_coupon;
        JOptionPane.showMessageDialog(null,
                 "Total price is " + frm.format(total_coupon) +"\nCustomer paid "+ customer_paid + " baht.\nGet change " + frm.format(get_change) +" baht.");
    }
}
