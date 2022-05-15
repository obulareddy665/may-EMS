package com.ob.ems.object;

public class EmployeeC {
	
	Integer eid;
	String ename;
	
	// arguments/paramter constructor we are creating
	public EmployeeC(Integer id,String name) {
			eid=id;
			ename=name;
		
	}
	
	public void display() {
		System.out.println("Employee id is : "+eid);
		System.out.println("Employee name is : "+ename);
	}
	
	public Integer printValue(Integer id) {
		return id;
	}
	
	EmployeeC() {
		
	}
	
	
	

}
