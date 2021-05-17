package com.ibm.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trains")
public class Train {
	
	@Id
	@GeneratedValue
	@Column(name="train_no")
	private int tcode;
	@Column(name="train_name", length=20)
	private String name;
	@Column(length=20)
	private String source;
	@Column(length=20)
	private String destiny;
	
	public Train() {
	}

	public Train(String name, String source, String destiny, int tcode) {
		super();
		this.tcode = tcode;
		this.name = name;
		this.source = source;
		this.destiny = destiny;
	}
	

	public int getTcode() {
		return tcode;
	}

	public void setTcode(int tcode) {
		this.tcode = tcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	
}
