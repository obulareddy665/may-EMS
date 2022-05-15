package com.ob.ems.object.methods;

import com.ob.ems.object.Employee;

public class EmployeeMethodsCalling {
	
	public static void save() {
		System.out.println("Printing Save method successfully");
	}
	
	public static Integer saveReturn() {
		return 1;
		
	}
	
	

	public static void main(String[] args) {
		/**
		 *  System.out.println("hi");
		System.out.println("hi");
		
		System.out.println("----------------------------");
		System.out.print("hi");
		System.out.print("hi");
		
		*/
		EmployeeMethodsCalling.save();
		System.out.println(EmployeeMethodsCalling.saveReturn());
		
		
	}
}
