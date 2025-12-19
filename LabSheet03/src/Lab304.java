import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.)"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.)"));
        double height_total = height / 100;
        double bmi = weight / (height_total * height_total);
        DecimalFormat frm = new DecimalFormat("##.00");
        if (bmi >= 30 )
        {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(bmi) + "\nBMI result is Obese"  );
        }
        else if (bmi >= 25 )
        {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(bmi) + "\nBMI result is Overweight"  );
        }
        else if (bmi >= 18.5 )
        {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(bmi) + "\nBMI result is Healthy weight"  );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your BMI is " + frm.format(bmi) + "\nBMI result is Underweight"  );
        }





    }
}