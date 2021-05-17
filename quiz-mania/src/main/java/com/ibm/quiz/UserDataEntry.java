package com.ibm.quiz;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.service.UserService;

@Component
public class UserDataEntry {
	
	@Autowired
	private UserService service;
	
	@EventListener
	public void onAppReady(ApplicationReadyEvent are) {
		if(service.getAllUser().size() ==0) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				User[] users = mapper.readValue("users.json", User[].class);
				for (User u : users) {
					service.addUesr(u);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
