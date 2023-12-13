import javax.swing.JOptionPane;
public class Example_502 {

	public static void main(String[] args) 
	{
		//1.input email from dialog box
		String email = JOptionPane.showInputDialog("Input your e-mail: ");
		//2.input email start with @ or space bar or not
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again: ");
	}
		//3.check email end with hotmail.com or gmail.com or not
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your email is "+email.toLowerCase());
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or email dot com");
		}
	}
}
