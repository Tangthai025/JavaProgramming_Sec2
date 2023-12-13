import java.util.Scanner;
public class Lab501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fullname;
		System.out.print("Full Name: ");
		fullname = sc.nextLine();
		String firstname = fullname.substring(0,fullname.indexOf(" "));
		String lastname = fullname.substring(fullname.indexOf(" "),fullname.lastIndexOf(""));
		if(fullname.indexOf(" ")==-1){
		System.out.print("Incorrent Name");
		}else {
			System.out.println("First Name: "+firstname);
			System.out.println("Last Name: "+lastname.trim());
		}

}
}
