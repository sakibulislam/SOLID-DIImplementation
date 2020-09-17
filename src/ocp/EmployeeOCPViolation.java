package ocp;

public class EmployeeOCPViolation {
	public void addEmployee(DBRepository dbRep, int employeeType) {
		if (employeeType == 1 ) {
			dbRep.addTrainees();
		} else {
			dbRep.addEmployees();
		}
		
	}
}
