import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader rf = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0,i=1;
		while((tmp = rf.readLine())!=null) 
		{
			String[] data = tmp.split("\t");
			System.out.println(i+". "+data[0]+"("+data[1]+"), Rating "+data[2]+"publist no "+data[5]);
			countBook++;
			i++;
		}
		System.out.println("===================================================================");
		System.out.println("Total number of Book :"+countBook);
		rf.close();
	}

}
