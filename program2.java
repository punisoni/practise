package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class program2 
{
	
		List<program2 > employeeDb = new ArrayList<>();
		
		public boolean addEmployee(program2  e) 
		{
			return employeeDb.add(e);
		}
		
		public boolean deleteEmployee(int empId)
		{
			boolean isRemoved = false;
			
			Iterator<program2 > it = employeeDb.iterator();
			
			while (it.hasNext()) {
				program2 emp = it.next();
				if (emp.getproId() == empId) {
					isRemoved = true;
					it.remove();
				}
			}
			
			return isRemoved;
		}
		
		private int getproId() {
		
			return 0;
		}

		public String showPaySlip(int empId) {
			String paySlip = "Invalid employee id";
			
			for (program2 e : employeeDb) {
				if (e.getproId() == empId) {
					paySlip = "Pay slip for employee id " + empId + " is " +
							e.getEmpSalary();
				}
			}

			return paySlip;
		}
		
		private String getEmpSalary() {
			
			return null;
		}

		public program2 [] listAll() {
			program2 [] empArray = new program2 [employeeDb.size()];
			for (int i = 0; i < employeeDb.size(); i++)
				empArray[i] = employeeDb.get(i);
			return empArray;
		}
		
	}
