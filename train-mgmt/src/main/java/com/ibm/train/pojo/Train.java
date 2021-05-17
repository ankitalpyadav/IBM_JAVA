package com.ibm.train.pojo;

public class Train {
	
	private int tcode;
	private String name;
	private String source;
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
