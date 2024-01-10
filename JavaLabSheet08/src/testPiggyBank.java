import java.util.*;
public class testPiggyBank {
			static Scanner sc = new Scanner(System.in);
			static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	
	public static void inputCoin() 
	{
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank:");
		int sizeofPiggyBank = sc.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Money Total : "+pb.getPiggyBank());
		mainMenu();
	}
	public static void mainMenu() 
	{
		while(true) 
		{
			System.out.println("===============================");
			System.out.println("Menu of PiggyBank");
			System.out.println("===============================");
			System.out.println("[1] one baht");
			System.out.println("[2] two baht");
			System.out.println("[3] five baht");
			System.out.println("[4] ten baht");
			System.out.println("[5] Exit");
			System.out.println("===============================");
			System.out.print("Please Select Menu[1-5] : ");
			int select = sc.nextInt();
			if (select == 1) 
			{
				System.out.print("Insert 1 Baht Money: ");
				int money = sc.nextInt();
				pb.addOne(money);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if (select == 2)
			{
				System.out.print("Insert 2 Baht Money: ");
				int money = sc.nextInt();
				pb.addTwo(money);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if (select == 3)
			{
				System.out.print("Insert 5 Baht Money: ");
				int money = sc.nextInt();
				pb.addFive(money);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else if (select == 4)
			{
				System.out.print("Insert 10 Baht Money: ");
				int money = sc.nextInt();
				pb.addTen(money);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println();
			}
			else 
			{
				System.out.println("Bye Bye");
				break;
			}
		}
	}
}
