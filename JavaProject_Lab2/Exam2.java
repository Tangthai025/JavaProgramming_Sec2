import java.text.*;
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.00");
		final int BUFFET = 299;
		double total = BUFFET*5;
		double service = total + (total*3/100);
		System.out.println("Buffet of 5 customers is "+total);
		System.out.println("Add Service Charge 3% is "+df.format(service));
	}

}
