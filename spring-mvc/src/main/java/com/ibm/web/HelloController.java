package com.ibm.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public String sayHello(Map<String, String> model) {
		
		model.put("message", "Welcome to Spring MVC");
		return "hello";
	}
}
