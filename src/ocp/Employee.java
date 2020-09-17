package ocp;
/**
 * 
 * @param dbRepository
 * 	The application that we create must be ready for extensions, because the systems are changing very quickly these days. 
	Thanks to the OCP principle,
	we are able to repeatedly use our classes for various tasks, 
	which promotes re-usability of the code, 
	but also makes it easy to understand.
 */

public  class Employee {
	public void addEmployee(DBRepository dbRepository) {
		dbRepository.addEmployees();
	}
}
