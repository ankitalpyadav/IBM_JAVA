package com.ibm.quiz.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.quiz.entity.User;
import com.ibm.quiz.service.UserService;

public class TestUser {
	@Autowired
	private  UserService uservice;
	
	@Test
	public void testaddUser() {
		User u=new User();
		u.setUsername("Shivam");
		uservice.addUesr(u);
	}
	
	
}
