import java.util.*;
import java.text.*;
public class Lab702 {
    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        float student[] = new float[5];
        int i = 0;
        float sum = 0;
        for(float score:student)
        {
            System.out.print("Input score of student "+(i+1)+" : ");
            student[i] = sc.nextFloat();
            sum = sum + student[i];
            i++;
        }
        float Average = sum / 5;
        System.out.println();
        System.out.println("Average of 5 student is "+df.format(Average));
        for (int n =0;n<student.length;n++) 
        {
        	if (student[n]>=Average) 
        	{
        		System.out.println("> Student "+(n+1)+" ("+student[n]+")");
        	}
        }
    }
}