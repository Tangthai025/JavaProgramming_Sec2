import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = sc.nextLine();
		String text="";
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = sc.nextLine();
	}
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println();
			}else {
				System.out.print(sentence.charAt(i));
			}
	}
		
	}
}