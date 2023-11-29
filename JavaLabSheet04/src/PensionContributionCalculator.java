import java.util.Scanner;
import java.text.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		// Declare constants
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW =0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		// Declare variables
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		//input salary
		System.out.print("Enter the mouthly salary: ");
		salary = sc.nextInt();
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		//Check the contribution cap
		contributableSalary = Math.min(salary, SALARY_CEILING);
		//System.out.print(contributableSalary);
		if (age <= 55) {
			employeeContribution = EMPLOYEE_RATE_55_AND_BELOW*contributableSalary;
			employerContribution = EMPLOYER_RATE_55_AND_BELOW*contributableSalary;
			totalContribution = employeeContribution+employerContribution;
		}else if (age >55 && age <=60) {
			employeeContribution = EMPLOYEE_RATE_55_TO_60*contributableSalary;
			employerContribution = EMPLOYER_RATE_55_TO_60*contributableSalary;
			totalContribution = employeeContribution+employerContribution;
		}else if (age >60 && age <=65) {
			employeeContribution = EMPLOYEE_RATE_60_TO_65*contributableSalary;
			employerContribution = EMPLOYER_RATE_60_TO_65*contributableSalary;
			totalContribution = employeeContribution+employerContribution;
		}else {
			employeeContribution = EMPLOYEE_RATE_65_ABOVE*contributableSalary;
			employerContribution = EMPLOYER_RATE_65_ABOVE*contributableSalary;
			totalContribution = employeeContribution+employerContribution;
		}
		System.out.println("The employee's contribution is: "+df.format(employeeContribution));
		System.out.println("The employer's contribution is: "+df.format(employerContribution));
		System.out.print("The total comtribution is : "+df.format(totalContribution));
		
	}

}
