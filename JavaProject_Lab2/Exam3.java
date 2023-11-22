import java.util.Scanner;
import java.text.*;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Input product name   : ");
		String name = sc.next();
		System.out.print("Input product unit   : ");
		int unit = sc.nextInt();
		System.out.print("Input price per unit : ");
		float price = sc.nextFloat();
		float Total = price * unit;
		float vat = Total + (Total*7/100);
		System.out.println();
		System.out.println("Total Price is "+df.format(Total)+" baht.");
		System.out.println("Add VAT 7%  is "+df.format(vat)+" baht.");
	}

}
