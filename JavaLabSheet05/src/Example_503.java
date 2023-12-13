import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("Input a sentence : ");
		word = sc.nextLine();
		while(!word.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			word = sc.nextLine();
	}
		int countSpace = 0;
		for(int i =0;i<word.length()-1;i++) {
			if(word.charAt(i)==' ') {
				countSpace+=1;
			}	
		}
		System.out.println();
		System.out.println("This sentence has "+countSpace+" spacebar");
		System.out.println("This sentence has "+(countSpace+1)+" spacebar");
	}
}
