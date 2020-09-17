package lsp;

import java.util.ArrayList;

public class SolutionTester {
	public static void main (String args[]) {
		ArrayList<IEmployee> listEmployees = new ArrayList <IEmployee>();
		listEmployees.add(new PermanentEmployeeSolution());
		listEmployees.add(new TraineeEmployeeSolution());
		
		listEmployees.get(1).addEmployee();
		
		
		ArrayList<ILeaves> listLeaves = new ArrayList <ILeaves>();
		listLeaves.add(new PermanentEmployeeSolution());
		
		listLeaves.get(0).getLeavesDetails();
	}

}
