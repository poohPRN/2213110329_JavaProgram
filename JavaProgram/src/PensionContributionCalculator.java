import java.text.*;
import java.util.Scanner;

public class PensionContributionCalculator {
	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	static double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the monthly salary : $");
		int salary = scan.nextInt();
		System.out.println("Enter the age: ");
		int age = scan.nextInt();
		if(age <= 55) {
		System.out.println("The employee's contribution is: $");
		}
	}

}
