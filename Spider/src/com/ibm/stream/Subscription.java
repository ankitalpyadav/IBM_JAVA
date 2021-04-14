package com.ibm.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Subscription {
	
	//private String [][] plan = {{"Monthly", "100"}, {"Annual", "1000"}};
	private String plan;
	private LocalDate expiry;
	
	public Subscription() {
		
	}
	
	public void subscribe(String plan, User user) throws SubscriptionException {
		if (user.getSubscription() == null) {
		
		if(plan.equalsIgnoreCase("Monthly") && user.getBalance() >= 100) {
			user.setBalance(user.getBalance() - 100);
			user.setSubscription(this);
			this.plan = plan;
			expiry = LocalDate.now().plus(1, ChronoUnit.MONTHS);
			
		}
		else if (plan.equalsIgnoreCase("Annualy") && user.getBalance() >= 1000) {
			user.setBalance(user.getBalance() - 1000);
			user.setSubscription(this);
			this.plan = plan;
			expiry = LocalDate.now().plus(1, ChronoUnit.YEARS);
		}
		
		else
			throw new SubscriptionException("Insufficient balance against subscription amount");
		}
		else
			System.out.println("You are already subscribed");
	}

	public String getPlan() {
		return plan;
	}

	public LocalDate getExpiry() {
		return expiry;
	}
	
	
}
