package com.ibm.stream;

public class User extends Subscription {

	private String name;
	private int age;
	private String  gender;
	private double balance;
	private Subscription subscription;
	
	public void profile(){
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		
	}
	
	public void mySubscription() {
		if (subscription != null) {
			System.out.println("Plan : " + subscription.getPlan());
			System.out.println("Expiry : " + subscription.getExpiry());
		}
		else
			System.out.println("Not Subscribed to any plan !!");
	}
	
	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public User() {
		
	}

	public User(String name, int age, String gender, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
