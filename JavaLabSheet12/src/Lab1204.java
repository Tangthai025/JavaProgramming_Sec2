import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of book:");
		double rating = input.nextDouble();
		System.out.println("------------------------------------------------------------------");
		BufferedReader rf = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int count = 0,i=1;
		while((tmp = rf.readLine())!=null) 
		{
			String[] data = tmp.split("\t");
			if(rating<=Double.parseDouble(data[2])) {
			System.out.println("Book "+i+":"+data[0]+" write by "+data[1]+" ("+data[3]+") reviews");
			count++;
			}
			i++;
		}
		rf.close();
		System.out.println("----------------------------------------------------------");
		System.out.println("There are "+count+" book get rating more than "+rating);
	}

}
