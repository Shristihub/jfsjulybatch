package com.shristi.lang;

public class DeepCloneDemo {
	public static void main(String[] args) {
		Department department = new Department(100, "Admin");
		Employee emp = new Employee(1, "Raju", department);
		Employee emp1 = null;
		try {
			emp1 = emp.clone();
			System.out.println("emp1 "+emp1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// get the department
		Department depart = emp1.getDepartment(); //returns 100,admin
		depart.setDeptName("HR"); 
		emp1.setDepartment(depart);// set the new department
		emp1.setName("Rajaram");
		
		System.out.println("emp1 "+emp1);
		System.out.println("emp "+emp);
		
	
	}

}
