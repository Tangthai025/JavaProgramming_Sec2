import javax.swing.*;
public class Example702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));
		double itemPrice = 0.0;//getPrice
		boolean validItem = false;//check item order (or not)
		
		for(int i=0;i<validValues.length;i++)//เอาวนหาvalidvalue 
		{
			if(itemOrder==validValues[i]) 
			{
				itemPrice = price[i];
				validItem = true;
			}
		}//end for
		if (validItem) 
		{
			System.out.print("Item "+itemOrder+ " is "+itemPrice);
		}
		else 
		{
			System.out.print("Invalid Item");
		}
	}
}
