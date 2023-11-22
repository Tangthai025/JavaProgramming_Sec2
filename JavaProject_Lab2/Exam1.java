import java.text.*;
public class Exam1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double price = 225.75;
		int unit = 5;
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Book ISBN  : IB2-6325-85-4-1");
		System.out.println("Book Title : Basic Java Programming");
		System.out.println("Book ISBN  : "+unit+" books.");
		System.out.println("Book Price : "+price+" Baht.");
		System.out.println("-----------------------------------");
		Double Total = price * unit;
		Double vat = Total + (Total*7/100);
		System.out.println("Total Price is "+df.format(Total));
		System.out.println("Add VAT 7%  is "+vat);
	}

}
