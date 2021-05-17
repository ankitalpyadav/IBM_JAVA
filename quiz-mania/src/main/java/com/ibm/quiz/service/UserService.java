package com.ibm.quiz.service;

import java.util.List;

import com.ibm.quiz.bean.Login;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.entity.User;

public interface UserService {
	int addUesr(User user);
	
	User getUser(int uid);
	
	User runQuiz(Quiz quiz, int uid);
	
	User validate(Login login);
	
	List<User> getAllUser();
}
