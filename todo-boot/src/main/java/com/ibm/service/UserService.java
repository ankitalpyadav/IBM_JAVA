package com.ibm.service;

import java.util.List;

import com.ibm.entity.User;
import com.ibm.pojo.Login;

public interface UserService {
	int addUser(User user);
	
	User getUser(int userid);
	
	List<User> getAllUsers();
	
	User authenticate(Login login);
}
