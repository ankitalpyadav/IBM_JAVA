package com.ibm.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.quiz.bean.Login;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repo;

	@Override
	public int addUesr(User user) {
		repo.save(user);
		return user.getUid();
	}

	@Override
	public User getUser(int uid) {
		User u=repo.findById(uid).get();
		return u;
	}

	@Override
	public User runQuiz(Quiz quiz, int uid) {
		User u = new User();
		u.setQuiz(quiz);
		User uquiz = repo.findById(uid).get();
		return uquiz;
	}

	@Override
	public User validate(Login login) {
		return repo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
	}

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}


	
}
