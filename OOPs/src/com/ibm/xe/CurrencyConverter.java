package com.ibm.xe;

public class CurrencyConverter {
	
	public double convert(Currency source, Currency target, double amount) {
		double rate = target.dollarValue() / source.dollarValue();
		return rate * amount;
	}
	
}
