import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input Section");
		int sectionInput = in.nextInt();
		Header();
		showListStudent(sectionInput);
	}
	public static void showListStudent(int section) throws IOException
	{
		BufferedReader rf = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp = rf.readLine())!=null) 
		{
			String[] data = tmp.split("\t");
			int sectionData = Integer.parseInt(data[3]);
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			
			if(sectionData == section) 
			{
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore+"\t"
			+finalScore+"\t"+findResult(midtermScore,finalScore));
				
			}
		}
	}
	public static String findResult(double midscore,double finalscore) 
	{
		double totalScore = midscore+finalscore;
		/*if(totalScore<=40)
			return "Fail";
		else
			return "Pass";
			*/
		return totalScore<=40?"Fail":"Pass";//ternary
	}
	public static void Header() 
	{
		System.out.println("****************************************************************");
		System.out.println("\t\tList of Data for Section 1");
		System.out.println("****************************************************************");
		
	}
}
