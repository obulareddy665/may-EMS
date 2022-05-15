package com.ob.ems.object.methods;

public class EmployeeMetodTypes {
	
	public static void add() {
		System.out.println("adding............");
	}
	
	public static Integer addWithArguments(Integer a, Integer b) {
		return a+b;
	}
	
	public void sub() {
		System.out.println("sub..........");
		
	}
	public Integer subArguments(Integer a,Integer b) {
		System.out.println("hjhfjhfi");
	        return a-b;
	}
	
	public EmployeeMetodTypes() {
		
	}
	
	public static void main(String[] args) {
		
		EmployeeMetodTypes.add();
		System.out.println(EmployeeMetodTypes.addWithArguments(10, 20));
		
		EmployeeMetodTypes employeeMetodTypes=new EmployeeMetodTypes();
		employeeMetodTypes.sub();
		System.out.println(employeeMetodTypes.subArguments(20, 10));
		
	}

}
