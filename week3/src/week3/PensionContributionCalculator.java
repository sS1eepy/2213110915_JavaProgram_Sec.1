package week3;
import java.text.DecimalFormat;
import java.util.*;

public class PensionContributionCalculator {
	public static void main(String[] args) {
		DecimalFormat f3 = new DecimalFormat("#,###.00");
		
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age; // to be input
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		salary = scan.nextInt();
		System.out.print("Enter the age : ");
		age = scan.nextInt();
		
		// Compute various contributions in "double" using a nested-if to handle 4 cases
		if (age <= 55) { // 55 and below
			employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution+employerContribution;
		} else if (age <= 60) { // (60, 65]
			employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution+employerContribution;
		} else if (age <= 65) { // (55, 60]
			employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution+employerContribution;
		} else { // above 65
			employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution+employerContribution;
		}
		System.out.println("The employee 's contribution is: $"+f3.format(employeeContribution));
		System.out.println("The employer 's contribution is: $"+f3.format(employerContribution));
		System.out.println("The total contribution is : $"+f3.format(totalContribution));
	}

}
