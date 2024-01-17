import java.util.*;
public class Authordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author e-mail : ");
		String email = sc.nextLine();
		System.out.print("Input author gender : ");
		char gender = sc.nextLine().charAt(0);
		Author a1 = new Author(name,email,gender);
		System.out.println();
		System.out.println(a1);
	}

}
