import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException
	{
		//create object for input data from keyboard(console)
		Scanner sc = new Scanner(System.in);
		// Crate object for write data to File using PrintStrem Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		do {
			header();
			System.out.print("Enter name: ");
			name = sc.next();
			System.out.print("Enter department: ");
			dept = sc.next();
			//save all data to file
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = sc.next().toLowerCase();
		}while(answer.equals("y"));
	}
	public void read() 
	{
		try {
			//create object for File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			int i = 1,count = 0;
			while(readFile.hasNext()) 
			{
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) 
				{
					System.out.println(i+") "+name);
					check=true;
					i++;
					count++;
				}
			}header();
			System.out.println("Employee in dept "+super.getDept()+" is "+count+" person.");
			if(check == false) 
			{
				System.out.println("\nSorry, no department "+super.getDept()+" in File");
				header();
			}
			readFile.close();
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}
}
