package srp;
/**
 * 
 * Example of the solution of SRP violation where a class have only one reason to change.
 *
 */


public class EmployeeSRPSolution {
	SaveHelperSRPSolution saveHelper = new SaveHelperSRPSolution();
	public void addEmployee() {
		
		//code to add employee into database
		saveHelper.save();
	}
	
	
	
}
