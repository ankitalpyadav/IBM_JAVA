package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int pid;
	
	@Column(length = 20)
	private String pname;
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
