package com.ibm.quiz.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.quiz.bean.Login;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
//	@PostMapping(value="/add/{name}")
//	public String addUser(@PathVariable String name) {
//		User u=new User();
//		u.setUsername(name);
//		int uid=service.addUesr(u);
//		return "User added with id"+uid;
//	}
//	
//	@PostMapping(value="/add")
//	public String addUserParam(@RequestParam("name") String name) {
//		User u=new User();
//		u.setUsername(name);
//		int uid=service.addUesr(u);
//		return "User added with id"+uid;
//	}
//	
	
	@PostMapping(value="/add",consumes = "application/json")
	public String addUserBody(@RequestBody User u) {
		int uid = service.addUesr(u);
		return "User added with id "+ uid;
	}
	
	@PostMapping(value="/auth",consumes = "application/json", produces="application/json" )
	public ResponseEntity<?> authenticate(@RequestBody Login login, HttpSession session ) {
		User user = service.validate(login);
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
	
	@GetMapping(value="/get/{uid}",produces="application/json")
	public User getUser(@PathVariable int uid) {
		
		User u=service.getUser(uid);
		//System.out.println(u.getUid()+"****");
		return u; 
	}
	
	@PostMapping(value = "/run/{uid}", consumes = "application/Json")
	public User runQuiz(@RequestBody Quiz quiz, @PathVariable int uid) {
		
		return null;
		
	}
	
	
	
}
