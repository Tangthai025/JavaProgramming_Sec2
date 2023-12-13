import java.util.*;
public class Example_501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word;
		String text="";
		while(true) {
			System.out.print("Enter word: ");
			word = sc.next();
			if(word.equalsIgnoreCase("stop"))break;
			text = text+word+" ";
		}
		System.out.println(text.toUpperCase());
	}

}
