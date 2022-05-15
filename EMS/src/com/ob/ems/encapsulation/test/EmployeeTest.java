package com.ob.ems.encapsulation.test;

import com.ob.ems.encapsulation.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEid(10);
		System.out.println(employee.getEid());
	}
}
