package WageSalary;
import java.util.*;
public class EmpPartTime {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		  System.out.println("Welcome to Employee Wage computation");
		 /*
		  * Employee Working Hours is Defined
		  */
		  int FullTimeHours = 12 ;
		  int PartTimeHours = 8 ;
		  /*
		   * Get the wage of the employee
		   */
		  Scanner sc = new Scanner(System.in);
		   
		  System.out.println("Enter the Wage of the Employee  ");
		  int WageOfEmployee = sc.nextInt();
		  /*
		   * Calculating the wage of part time  and full time employee
		   */
		  
		  int FullTimeDailyWage = WageOfEmployee*FullTimeHours;
		  int PartTimeDailyWage = WageOfEmployee*PartTimeHours;
		  System.out.println("Full Time Employee Wage : " +FullTimeDailyWage );
		  System.out.println("Part Time Employee Wage :" +PartTimeDailyWage );
		  
		  sc.close();
		   
		  
		  
		 
	}

}
