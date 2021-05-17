package com.cg.entity;

public class Flight {
	private int flightNo;
	private String carrier;
	private String source;
	private String destiny;
	
	public Flight() {
	}
	
	public Flight(int flightNo, String carrier, String source, String destiny) {
		this.flightNo = flightNo;
		this.carrier = carrier;
		this.source = source;
		this.destiny = destiny;
	}

	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
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

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", carrier=" + carrier + ", source=" + source + ", destiny=" + destiny
				+ "]";
	} 
}
