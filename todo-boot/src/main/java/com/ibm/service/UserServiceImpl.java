package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository urepo;

	@Override
	public int addUser(User user) {
		urepo.save(user);
		return user.getUserid();
	}

	@Override
	public User getUser(int userid) {
		return urepo.findById(userid).orElseThrow (() -> new IllegalArgumentException("User not found with Id : " + userid));
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = urepo.findAll();
		return users;
	}

	@Override
	public User authenticate(Login login) {
		
		return urepo.findByEmailAndPasswd(login.getEmail(), login.getPasswd()).orElseThrow(() -> new IllegalArgumentException("Invalid Email Id and Password"));
	}

}
