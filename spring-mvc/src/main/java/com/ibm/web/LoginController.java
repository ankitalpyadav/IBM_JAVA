package com.ibm.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.bean.Login;

@Controller
public class LoginController {
	
	@RequestMapping(name = "/login.do", method = RequestMethod.POST)
	public String validate(Login login, Map<String, String> model) {
		
		if(login.getUserid().equals("duke") && login.getPasswd().equals("oracle")) {
			model.put("message", "Login Successful");
		}
		else {
			model.put("message", "Invalid Login");
		}
		return "output";
			
	}
}
