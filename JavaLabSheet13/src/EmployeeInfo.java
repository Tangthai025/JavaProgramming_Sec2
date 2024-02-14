import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//create object for input data from keyboard(console)
		Scanner sc = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data? : ");
		choice = sc.next().toLowerCase();
		while(!(choice.equals("insert"))&& !(choice.equals("read"))) 
		{
			System.out.print("Please type insert or read data,agin:");
			choice = sc.next().toLowerCase();
		}
		//create object : call all method in class SaveandOpen
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) 
		{
			obj.insert();//เรียกใช้เมดทอด insert จาก class SaveandOpen
		}
		else if(choice.equals("read")) 
		{
			System.out.print("\nEnter department: ");
			department = sc.next();
			obj.setDept(department);//ส่ง department to setDept() method from Class Employee
			obj.read();
		}
	}

}
