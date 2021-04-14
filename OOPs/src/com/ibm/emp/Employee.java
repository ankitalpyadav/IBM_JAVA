package com.ibm.emp;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	
	private static int autogen;
	static { //static initializer block, it executes at the time of class loader
		System.out.println("Employee class ready...");
		autogen = 1001;
	}
	
	public Employee() {
		this("Shruti",200000);
	}
	public Employee(String empName, double salary) {
		super();
		this.empID = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip()
	{
		System.out.println("-------PaySlip-------");
		System.out.println("ID : "+ empID);
		System.out.println("Name : "+ empName);
		System.out.println("Salary :"+ salary);
	}
	
	public double getSalary() {
		return salary;
	}

	

}
