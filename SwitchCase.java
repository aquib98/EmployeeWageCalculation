package WageSalary;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage computation");
		/*
		 * Get the value of wage of employee 
		 */
		 
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the  wage of the Employee : ");
		int wageOfEmp = sc.nextInt();
		/*
		 * calculating the full time and part time employee wage 
		 */
		int fullTimeEmp = wageOfEmp*12 ;
		int partTimeEmp = wageOfEmp*8 ;
		System.out.println("Wage of Full Time Eemployee :" +fullTimeEmp);
		System.out.println("Wage of Part Time Employee:" +partTimeEmp );
		int workingHour = 1 ;
		/*
		 * switch case statement 
		 */
		switch ( workingHour )  {
		 
	 	case 1: System.out.println("Part Time Employee"+ partTimeEmp);
		 break;
		 
		 
		case 2:System.out.println("Full Time Employee :" +fullTimeEmp);
			break;
		 }

		 


		 

	}

}
