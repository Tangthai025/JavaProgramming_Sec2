import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		// Crate object for write data to File using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//produuct.txt",true));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input product id:");
		String productId = sc.next();
		System.out.print("Input product Name:");
		String productName = sc.next();
		System.out.print("Input product Unit:");
		int productUnit = sc.nextInt();
		System.out.print("Input product Price:");
		float productPrice = sc.nextFloat();
		//Save data
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already...");
		writeFile.close();
	}

}
