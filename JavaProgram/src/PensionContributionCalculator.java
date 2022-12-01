import java.text.*;
import java.util.Scanner;

public class PensionContributionCalculator {
	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("####.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary : $");
		int salary = scan.nextInt();
		System.out.print("Enter the age: ");
		int age = scan.nextInt();
		double employeeContribution=0, employerContribution=0, totalContribution=0;
		
		 if(age <= 55) {
			employeeContribution = (double)salary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = (double)salary*EMPLOYER_RATE_55_AND_BELOW;
			}
		 else if (age <= 60) {
			 employeeContribution = (double)salary*EMPLOYEE_RATE_55_TO_60;
			 employerContribution = (double)salary*EMPLOYER_RATE_55_TO_60;
			}
		else if(age <= 65) {
			employeeContribution = (double)salary*EMPLOYEE_RATE_60_TO_65;
			 employerContribution = (double)salary*EMPLOYER_RATE_60_TO_65;
			}
		else if(age < 65) {
			employeeContribution = (double)salary*EMPLOYEE_RATE_65_ABOVE;
			 employerContribution = (double)salary*EMPLOYER_RATE_65_ABOVE;
		}
		 totalContribution = employeeContribution + employerContribution;
		 System.out.println("The employee's contribution is: "+frm.format(employeeContribution));
		 System.out.println("The employer's contribution is: "+frm.format(employerContribution));
		 System.out.println("The total contribution is: "+frm.format(totalContribution));
		 
	}

}
