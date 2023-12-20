import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Plese input year between 1000-3000"+
		"\nInput Year, again"));
		}
		if(isLeapYear(inputYear)==true) {
			JOptionPane.showMessageDialog(null, inputYear + " is leap Year");
		}else {
			JOptionPane.showMessageDialog(null, inputYear + "is not Leap Year");
		}
		
	}
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			return true;
		}
		return false;
	}
	public static boolean checkYear(int year) {
		if (year >=1000 & year <=3000) {
			return true;
		}
		return false;
	}
			


}
