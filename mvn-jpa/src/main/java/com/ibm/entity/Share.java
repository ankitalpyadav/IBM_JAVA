package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Share {
	
	@Id
	@GeneratedValue
	private int sid;
	@Column(length = 15)
	private String stock;
	private int qunatity;
	private double quote;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	public double getQuote() {
		return quote;
	}
	public void setQuote(double quote) {
		this.quote = quote;
	}
	
	@Override
	public String toString() {
		return "Share [sid=" + sid + ", stock=" + stock + ", qunatity=" + qunatity + ", quote=" + quote + "]";
	}
	
}
