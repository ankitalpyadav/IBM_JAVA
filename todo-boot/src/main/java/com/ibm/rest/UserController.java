package com.ibm.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pojo.Login;
import com.ibm.entity.User;
import com.ibm.service.UserService;

@CrossOrigin()
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService uservice;
	
	@PostMapping(value="/add",consumes = "application/json")
	public String addUser(@RequestBody User u) {
		int uid = uservice.addUser(u);
		return "User added with id : "+ uid;
	}
	
	@GetMapping(value="/get/{uid}",produces="application/json")
	public User getUser(@PathVariable int uid) {
		User u=uservice.getUser(uid);
		return u; 
	}
	
	@PostMapping(value="/auth",consumes = "application/json", produces="application/json" )
	public ResponseEntity<?> authenticate(@RequestBody Login login, HttpSession session ) {
		User user = uservice.authenticate(login);
		if (user != null) {
			session.setAttribute("USER", user);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Invalid username or password", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); //destroy session
		return "Logged out successfully";
	}
	
	
}
