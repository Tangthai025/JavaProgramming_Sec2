import java.util.Scanner;
public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		String firstName = sc.nextLine();
		int space = firstName.indexOf(" ");
		String Name = firstName.substring(0,space);
		System.out.println(abbreviatName(firstName)+Name);
	}
	static String abbreviatName(String fullname) {
		String shotname = "";
		for (int i=0;i<fullname.length()-1;i++) {
			if(fullname.charAt(i)==' ') {
				shotname = shotname+fullname.charAt(i+1)+".";
			}
		}
		return shotname;
	}

}
