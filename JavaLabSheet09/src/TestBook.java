import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		System.out.print("Input book title   : ");
		b1.setTitle(sc.nextLine());
		System.out.print("Input book price   : ");
		b1.setPrice(sc.nextFloat());
		System.out.print("Input publish year : ");
		b1.setPublishyear(sc.nextInt());
		System.out.println();
		System.out.println(b1.toString());
	}

}
