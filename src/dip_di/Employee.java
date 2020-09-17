package dip_di;

public class Employee {
	private  DBRepository dbRep = new DBRepository(); //dependency which creates tightly coupled code
	
	public void add() {
		dbRep.addEmployee(); 
	}

}
