import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("input your e-mail").toLowerCase();
		
		boolean chkEmail= checkEmail(inputEmail);
		if(chkEmail == true) {
			JOptionPane.showMessageDialog(null, "your e-mail"+inputEmail);			
		}else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail ");
		}
	}//end main
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}//end checkEmail
}
