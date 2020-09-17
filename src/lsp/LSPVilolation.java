package lsp;

import java.util.ArrayList;

public class LSPVilolation {
//	List listEmployees = new List<EmployeeLSP>();
	public static void main(String args[]) {
//		List<EmployeeLSP> listEmployees = new ArrayList<EmployeeLSP>();
		ArrayList<EmployeeLSP> listEmployees = new ArrayList<EmployeeLSP>();
		listEmployees.add(new ContractualEmployee());
		listEmployees.add(new PermanenetEmployee());
		listEmployees.add(new TraineeEmployee());
		
		//calling getLeavesDetails(); we will get an error throw new NotImplementedException()
		try {
			listEmployees.get(2).getLeavesDetails();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		}
	
	}

