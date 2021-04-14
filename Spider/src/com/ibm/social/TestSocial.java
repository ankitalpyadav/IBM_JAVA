package com.ibm.social;

import java.time.LocalDate;

public class TestSocial {

	public static void main(String[] args) {
		User u = new User("Ankita");
		LocalDate now = LocalDate.now();
		String [] comments = {"nice","good"};
		Post p = new Post(u, "This is my first post..", now, 10, 5, comments);
	
	}

}
