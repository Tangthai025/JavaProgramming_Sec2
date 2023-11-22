import javax.swing.*;
import java.text.*;
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		String bill1 = JOptionPane.showInputDialog("How many customber per bill?");
		int bill = Integer.parseInt(bill1);
		double Totalprice = BUFFET * bill;
		int option =JOptionPane.showConfirmDialog(null, "Total Price is "+df.format(Totalprice)+" baht."+
		"\nDo you have a member card?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
		do {
			if(option == JOptionPane.YES_OPTION) {
			double AfterTotalPricediscount = 0;
			AfterTotalPricediscount = Totalprice * 90/100;
			JOptionPane.showMessageDialog(null,"Amount to paid is "+AfterTotalPricediscount+"baht.");	
			}
			else if(option == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+df.format(Totalprice)+" baht.");
			}
		}while(option == JOptionPane.CANCEL_OPTION);
	}

}
