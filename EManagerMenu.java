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
* EManagerMenu is the main control for the menu display
* 
*/

public class EManagerMenu {

	public static String main() {
		String menu = (
				  "\n  ________________________________________________________"
				+ "\n  |                                                      |"
				+ "\n  |            -- MENU --                                |"
				+ "\n  |                                                      |"
				+ "\n  |      1: Enter Employees                              |"
				+ "\n  |      2: Display Employees                            |"
				+ "\n  |      3: Retrieve Employee based in ID                |"
				+ "\n  |      4: Retrieve Employees based on salary range     |"
				+ "\n  |      0: Exit Program                                 |"
				+ "\n  |                                                      |"
				+ "\n  |______________________________________________________|");
		return menu; 

	}

}

