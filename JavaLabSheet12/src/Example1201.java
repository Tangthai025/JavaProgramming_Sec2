import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner readF = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readF.hasNext()) {
			String fname = readF.next();
			String lname = readF.next();
			readF.next();
			String email = readF.next().toUpperCase();
			
			System.out.println(fname+" "+"("+email+")");
		}readF.close();
	}

}
