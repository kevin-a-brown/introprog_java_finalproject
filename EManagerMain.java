/**
* Week 8
* Project
* Name: Brown, Kevin
* CMIS141/6380
* Date:07/11/2021
* 
* @author Kevin Brown
* @version 1.0 Build JUL 11, 2021
* 
* This program is used to enter and view employee information.
* EManagerMain is the main control for the methods required for all options
* 
*/

import java.util.Scanner;

// this main method adds data to all arrays
// Request how many employees then cycles through arrays until complete
// Can be used for bulk or singular entry
public class EManagerMain {
		
	static int numberEmployees; // This variable is incremented and used in other methods to control loops
	
	static String[] nameArray = new String[100];
	static int[] idArray = new int[100];
	static int[] salaryArray = new int[100];

		public static void main() {
		
			Scanner quantityInput = new Scanner(System.in);
			Scanner nameInput = new Scanner(System.in);
			Scanner idInput = new Scanner(System.in);
			Scanner salaryInput = new Scanner(System.in);
			
			System.out.print("\n    How many employees do you want to enter: ");
			int inputEmployees = quantityInput.nextInt();
			
			int counter = 0; 

			while (counter <= inputEmployees - 1) {
				
				System.out.println("\nEmployee " + (counter + 1));

				System.out.print("    Enter employee's name: ");
				String employeeName = nameInput.nextLine();;
				nameArray[numberEmployees] = employeeName;
				
				System.out.print("    Enter employee's ID (5 digits): ");
				int employeeID = idInput.nextInt();
				idArray[numberEmployees] = employeeID;
				
				System.out.print("    Enter employee's annual salary: ");
				int employeeSalary = salaryInput.nextInt();
				salaryArray[numberEmployees] = employeeSalary;

				numberEmployees++;
				counter++;

			}
			
			EmployeeManager.menu(); //Print menu again
			
			quantityInput.close();
			nameInput.close();
			idInput.close();
			salaryInput.close();
		}

		// This method prints employee data in arrays using numberEmployees variable to prevent reading NULL values
		public static void display() {
			
			System.out.println("\nEmployees: ");
			System.out.println(String.format("\n    %-20s%-20s", "NAME", "ID")); //Column headers
			System.out.println();
			
			if (numberEmployees >=1) {
				for (int i = 0; i < numberEmployees; i++) {
					System.out.println(String.format("    %-20s%-20s", nameArray[i], idArray[i]));
					
				}
			}
			else {
				System.out.println("\n** No employees found **");
			}
			
			EmployeeManager.menu(); //Print menu again
		}
		
		//This method displays employee data by cycling through ID array and comparing to input
		public static void retrieve() {
			
			Scanner searchInput = new Scanner(System.in);
			int counter = 0;
			
			System.out.println();
			System.out.print("\n   Enter employee ID to search: ");
			int idSearch = searchInput.nextInt();
			System.out.println(String.format("\n    %-20s%-20s%-20s", "ID", "NAME", "SALARY")); //Column headers
			System.out.println();
			
			// This loop with counter incrementing is required to prevent reading NULL values
			for (int i = 0; i < salaryArray.length; i++) {
				if (idArray[i] == idSearch) {
					System.out.println(String.format("    %-20s%-20s%-20s", idArray[i], nameArray[i], salaryArray[i]));
					counter++;
				}
			}
			
			if (counter == 0) {
				System.out.println("\n** No employees found **");
			}
			
			EmployeeManager.menu(); // Print menu again
			
			searchInput.close();
			
		}
		
		//This method displays employee data by cycling through Salary array and comparing to input
		public static void range() {
			
			Scanner rangeInput = new Scanner(System.in);
			int counter = 0;
			
			System.out.println();
			System.out.print("\n   Enter the low and high salary range to search : ");
			int rangeLow = rangeInput.nextInt();
			int rangeHigh = rangeInput.nextInt();
			System.out.println(String.format("\n    %-20s%-20s%-20s", "NAME", "ID", "SALARY")); //Column headers
			System.out.println();

			// This loop with counter incrementing is required to prevent reading NULL values
			for (int i = 0; i < salaryArray.length; i++) {
				if (salaryArray[i] >= rangeLow && salaryArray[i]<= rangeHigh) {
					System.out.println(String.format("    %-20s%-20s%-20s", nameArray[i], idArray[i], salaryArray[i]));
					counter++;
				}
			}
			
			if (counter == 0) {
				System.out.println("\n** No employees found **");
			}
			
			EmployeeManager.menu(); // Print menu again
			
			rangeInput.close();
	}
}
