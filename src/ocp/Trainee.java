package ocp;

public class Trainee extends Employee {
	@Override
	public void addEmployee(DBRepository dbRep) {
		dbRep.addTrainees();
	}
}
