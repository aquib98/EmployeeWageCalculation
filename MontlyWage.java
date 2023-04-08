package WageSalary;

public class MontlyWage {

	public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage computation");
		/*
		  * Initiating EmpWage  and Hours of work variables
		  * Assigning the assumed values to the integer variables
		  */
		 int Empwage , hours ,days ;
		 Empwage = 20 ;
		 hours = 8 ;
		 days = 20 ;
		 /*
		  * calculating the dailyWage of the employee
		  * calculating the monthly Wage of the employee
		  */
		 int  dailyWage = Empwage*hours ;
		 int MontlyWage = dailyWage*days ;
		 System.out.println("The Dailywage of the Employee is : " +dailyWage);
		 System.out.println("Montly Wage of Employee is : " +MontlyWage );
		 

	}

}
