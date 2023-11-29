import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;// Terminating value for input
		//Declare variables
		int sales;
		double salary;
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = sc.nextInt();
			if (sales == SENTINEL) {
				System.out.print("Bye bye...");
				break;
			}
			salary = 1000+sales*COMMISSION_RATE;
			System.out.printf("Saraly is :$%.2f\n",salary);
		}
	}

}
