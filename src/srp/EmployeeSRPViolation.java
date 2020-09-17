package srp;

/**
 * 
 * example of single responsibility principle, where Employee class has multiple responsibilities which violates the SRP, this class
 * should have only one responsibility to avoid the SRP violation.
 *
 */

public class EmployeeSRPViolation {
	public void addEmployee() {

			//code to add employee into database: Responsibility 1
		
	}
	
	public void save() {
		//code to save into database: Responsibility 2
	}
}
