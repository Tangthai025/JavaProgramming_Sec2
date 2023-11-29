import java.util.Scanner;
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentNumber,previousNumber;
		System.out.print("Input number : ");
		previousNumber = sc.nextInt();
		while(true) {
			System.out.print("Input number : ");
			currentNumber = sc.nextInt();
			if(currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
			}
			System.out.print("Bye Bye");
		
		
	}

}
