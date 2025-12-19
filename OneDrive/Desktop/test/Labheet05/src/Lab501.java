import javax.swing.*;
import java.text.DecimalFormat;
import java.text.Format;

public class Lab501 {
    public static double cal_bmi(double weight,double height_cm)
    {
        return weight / ((height_cm / 100)*(height_cm / 100)) ;
    }
    public static String check_bmi(double bmi)
    {
        if ( bmi < 18.5) return ("Underweight");
        else if ( bmi < 24.9) return("Healthy Weight");
        else if ( bmi < 29.9) return("OverWeight");
        else return("OverWeight");
    }

    static void main() {
        int answer_yes_no = JOptionPane.showConfirmDialog(
                null,
                "Do you want to check your BMI?",
                "Check BMI",
                JOptionPane.YES_NO_OPTION);
        if ( answer_yes_no == JOptionPane.NO_OPTION) JOptionPane.showMessageDialog(null,"END PROGRAM");
        else
        {
            double weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your weight(kg.):"));
            double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height(cm.):"));
            double bmi = cal_bmi(weight,height);
            DecimalFormat frm = new DecimalFormat(".##");
            String result = check_bmi(bmi);
            JOptionPane.showMessageDialog(null,"Your BMI = "+frm.format(bmi)+"\nYour BMI result = "+result);
        }
    }
}
