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
* EmployeeManager is the main control for the options linked to the methods
* 
*/


import java.util.Scanner;

public class EmployeeManager {
	
	public static void main(String[] args) {

	//Welcome message printed only once at initialization
	System.out.println("\n    ** Welcome to the EMPLOYEE MANAGER portal **");
	
	menu();
	
	}
	
	public static void menu() {
		
	Scanner stdIn = new Scanner(System.in);
	int methodSelection = 0;
	
	System.out.println(EManagerMenu.main()); //executes menu display after each option until terminated
	System.out.print("\n       Enter your selection (0-4): ");
	methodSelection = stdIn.nextInt();
	
	switch (methodSelection) {
	
	case 1 : EManagerMain.main(); //method to add employees, both bulk and singular
		break;
	
	case 2 : EManagerMain.display(); //method to display all employees in array
		break;
	
	case 3 : EManagerMain.retrieve(); //method to get data from array using id variable
		break;
	
	case 4 : EManagerMain.range(); //method to get data from arrays using a salary range
		break;
	//Exit message printed only one at termination
	case 0 : System.out.print("\n    Thank you for using the program. Goodbye!") ;
		break;
		}
	
	stdIn.close();
	
	}
	
}