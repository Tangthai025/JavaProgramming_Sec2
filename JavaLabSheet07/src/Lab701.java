import java.util.*;
public class Lab701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[7];
        int i = 0;
        int odd_count = 0;
        int odd = 0;
        for(int num:n)
        {
            System.out.print("Input number "+(i+1)+": ");
            n[i] = sc.nextInt();
            if (n[i] % 2!=0) 
            {
                odd_count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("There are "+odd_count+" of odd number");
        System.out.print("List of odd number : ");
        for(int x:n) {
        	if (x % 2!=0) 
            {
        		System.out.print(x+" ");
            }
        }
    }
}