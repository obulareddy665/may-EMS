package com.ob.ems.object;

public class Employee {

	private static Integer eid=1;
	
	private String ename="jaya";
	
	public static void main(String[] args) {
		System.out.println(Employee.eid);
		System.out.println();
		
	Employee employee=	new Employee();
	
	System.out.println(new Employee().ename);
	System.out.println(new Employee().ename);
	
	System.out.println(employee.ename);
	System.out.println(employee.ename);
	}
}
