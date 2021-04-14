package com.ibm.stream;

public class Media {
	
	protected String title;
	protected String genere;
	private boolean free;
	
	public Media() {
		
	}
	
	public Media(String title, String genere, boolean free) {
		super();
		this.title = title;
		this.genere = genere;
		this.free = free;
	}

	public void play(User user) throws AgeRestrictionException, SubscriptionException {
		if (!free && user.getSubscription() == null)
			throw new SubscriptionException("You are not subscribed");
			
		else if (genere.equals("Erotic") && user.getAge() < 18 || genere.equals("Horror") && user.getAge() > 50)
			throw new AgeRestrictionException("Restricted content");
		
		System.out.println("Playing... " + title);
	}

}
