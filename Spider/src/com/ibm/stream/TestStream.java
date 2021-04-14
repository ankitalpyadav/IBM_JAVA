package com.ibm.stream;

public class TestStream {

	public static void main(String[] args) {
		//Subscription sub = new Subscription();
		SubscriptionFactory sf = new SubscriptionFactory();
		
		User u1 = new User("Polo", 19, "Male", 2000);
		User u2 = new User("Lili", 21, "Female", 150);
		User u3 = new User("Polo", 51, "Male", 00);

		Movie m1 = new Movie("Hangover", "Erotic", false);
		Movie m2 = new Movie("Evil dead", "Horro", true);
		Movie m3 = new Movie("Avtar", "Action", false);
		
		Series s1 = new Series("GOT", "Erotic", false, 7, 10);
		Series s2 = new Series("LOST", "Action", false, 3, 10);
		
		
		Subscription sub = SubscriptionFactory.oneSubscribe("Anuualy", u1);
		u1.profile();
		u1.mySubscription();
		
		try {
			m1.play(u1);
		} catch (AgeRestrictionException | SubscriptionException e) {
			e.printStackTrace();
		}
		
	}

}
