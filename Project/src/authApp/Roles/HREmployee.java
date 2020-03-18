package authApp.Roles;

import authApp.User;

/**
 * Child class of the User, which dictates the User is a HR Employee
 */
public class HREmployee extends User {

	public HREmployee(String fName, String lName,int id) {
		super(fName, lName, "HR Employee", true,id);
		// TODO Auto-generated constructor stub
	}
	
}
