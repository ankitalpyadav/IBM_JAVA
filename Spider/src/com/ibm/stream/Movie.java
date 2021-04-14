package com.ibm.stream;

public class Movie extends Media{
	
	public Movie() {
	}

	public Movie(String title, String genere, boolean free) {
		super(title, genere, free);
	}

	@Override
	public void play(User user) throws AgeRestrictionException, SubscriptionException {
		super.play(user);
		System.out.println("Playing Movie : "+ title);
	}
	
	
}
