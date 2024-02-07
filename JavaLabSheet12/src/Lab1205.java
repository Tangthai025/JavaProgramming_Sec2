import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner rf = new Scanner(new File("d://txtFile//student.txt"));
		int i = 1;
		Header();
		while(rf.hasNext()) 
		{
			String id = rf.next();
			rf.next();
			String fname = rf.next();
			String lname = rf.next();
			double Grade = rf.nextDouble();
			rf.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"
			+fname.substring(0,1)+"."+lname+"\t"+Grade+"\t"+Status(Grade));
			i++;
		}
	}
	public static String Level(String id) 
	{
		return id.startsWith("19")?"4th":"3th";
	}
	public static String Status(double Grade) 
	{
		if(Grade<=1.00) 
		{
			return "Retired";
		}
		if(Grade<=2.00) 
		{
			return "Critical";
		}
		else 
		{
			return "Pass";
		}
	}
	public static void Header() 
	{
		System.out.println("No.\tID\t\tLevel\t Name\t\tGrade\tStatic");
		System.out.println("****************************************************************");
	}
}
