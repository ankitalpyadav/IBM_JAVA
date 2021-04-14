package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "empd")
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	@Column(length=30)
	private String empName;
	private double salary;
	
	@ManyToOne
	@JoinColumn(name = "deptId")
	private Department dept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empTd) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
