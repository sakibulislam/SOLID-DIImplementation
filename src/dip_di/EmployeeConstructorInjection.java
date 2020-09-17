package dip_di;

/**
 * 
 * Implementing constructor injection, when whole class needs the dependency
 *
 */

//this is the high level module class
public class EmployeeConstructorInjection {
	private IRepository _repository; //encapsulation implemented where we declared interface 'IRepository' variable 
	
	public EmployeeConstructorInjection(IRepository repository) { //this is the constructor and 'repository' is the argument receivable
		_repository = repository;
		
	}
	
	public void add() {
		_repository.addEmployee();
	}
}
