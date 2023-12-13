import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Message : ");
		String message = sc.nextLine();
		int count = 0;
		if((message.indexOf("nichi")>=0)) {
			System.out.print("Nichi is a sentence");
			count =+1;
		}else {
			System.out.print(message);
		}
	}

}
