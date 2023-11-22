import javax.swing.*;
import java.util.Random;
import java.text.*;
public class Withdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using class Random for random money
		Random rdmoney = new Random();
		DecimalFormat df = new DecimalFormat("#,###");
		int balance = rdmoney.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("You balance:"+df.format(balance)+
				"\nInput money to withdraw"));
		if(money > balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (money > 20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);			
		}
		else if (money % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+(money%100)+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			int x = (money / 1000);
			int y = (money % 1000)/500;
			int z = (money % 1000 %500)/100;
			JOptionPane.showMessageDialog(null, "You withdraw "+df.format(money)+
					"\n1000 = "+x+"\n500 = "+y+"\n100 = "+z,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
