package dip_di;

/**
 * 
 * Implementing method injection, when only operations need the dependency
 *
 */

public class EmployeeMethodInjection {
	private IRepository _repository; //encapsulation implemented where we declared interface 'IRepository' variable
	
	
	public void add(IRepository repository) { //this is the method and 'repository' is the argument receivable
		this._repository.addEmployee();
	}

}
