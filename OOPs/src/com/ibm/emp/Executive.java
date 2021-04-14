package com.ibm.emp;

public class Executive extends Employee {
	
	private double commission;

	public Executive() {
		super();
	}

	public Executive(String empName, double salary,double commission) {
		super(empName, salary);
		this.commission = commission;
		
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commission: "+ commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commission;
	}

}
