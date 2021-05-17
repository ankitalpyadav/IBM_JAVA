package com.ibm.quiz.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.quiz.entity.Option;
import com.ibm.quiz.entity.Question;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.repo.QuizRepository;
import com.ibm.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService service;
	
	@PostMapping(value = "/add/{topic}")
	public String addQuiz(@PathVariable String topic, HttpSession session) {
		User user = (User) session.getAttribute("USER");
		if (user != null && user.getRole().equals("Admin")) {
			Quiz q=new Quiz();
			q.setTopic(topic);
			System.out.println("topic"+topic);
			int id=service.addQuiz(q);
			return "Quiz added with code "+ id +"for topic "+ topic;
		}
		else {
			return "Only admin can create quiz";
		}
		
	}
	
	@GetMapping(value="/getqs/{qcode}", produces="application/json")
	public ResponseEntity<?> getAllQuizes(@PathVariable int qcode, HttpSession session) {
		if(session.getAttribute("USER") != null)
			return new ResponseEntity<Quiz>(service.getQuiz(qcode), HttpStatus.OK);
		else
			return new ResponseEntity<String>("Sorry you are not logged in", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value="/fetchquestion/{qcode}", produces="application/json")
	public Question getAllQusetions(@PathVariable int qcode) {
		Question q=service.getQuestion(qcode);
		return q;
	}
	
	@PostMapping(value="/create/{qcode}",consumes="application/json")
	public String addQuestion(@RequestBody Question q,@PathVariable("qcode") int qcode) {
		
		int qid=service.addQuestion(q, qcode);
		return "Question added with id"+qid;
		
	}
	
	@PostMapping(value="/addopt/{qid}",consumes="application/json")
	public String addOption(@RequestBody Option option,@PathVariable int qid) {
		
		int oid=service.addOption(option, qid);
		service.addOption(option, qid);
		return "Option added with id"+oid;
		
	}
	
	

	@PostMapping(value = "/submit", consumes = "application/json")
	public String submitQuiz(@RequestBody Quiz q) {
		
		return service.submitQuiz(q);
	}

}
