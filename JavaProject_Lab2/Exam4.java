import javax.swing.*;
import java.text.*;
public class Exam4 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showInputDialog("Input Product Name: ");
        int unit = Integer.parseInt(JOptionPane.showInputDialog("input Product Unit:"));
        Float price = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit:"));
        Float Total = price * unit;
        Float vat = Total + (Total*7/100);
        JOptionPane.showMessageDialog(null, "Total Price is "+df.format(Total)+" baht."+
        "\nAdd VAT 7 % is "+df.format(vat)+" baht.", "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
