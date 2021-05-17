package com.ibm.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.quiz.entity.Option;
import com.ibm.quiz.entity.Question;
import com.ibm.quiz.entity.Quiz;
import com.ibm.quiz.repo.OptionRepository;
import com.ibm.quiz.repo.QuestionRepository;
import com.ibm.quiz.repo.QuizRepository;


@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizRepository zrepo;
	@Autowired
	private QuestionRepository qrepo;
	@Autowired
	private OptionRepository orepo;

	@Override
	public int addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		zrepo.save(quiz);
		System.out.println("******"+quiz.getQcode());
		return quiz.getQcode();
	}

	@Override
	public Quiz getQuiz(int qcode) {
		
		return zrepo.findById(qcode).get();
	}
	
	

	@Override
	public int addQuestion(Question que, int qcode) {
		Quiz quiz=zrepo.findById(qcode).get();
		quiz.getQuestions().add(que);
		que.setQuiz(quiz);
		//setting quiz to question and vice versa
		qrepo.save(que);
		return que.getQid();
	}

	@Override
	public int addOption(Option opt, int qid) {
		Question que=qrepo.findById(qid).get();
		que.getOption().add(opt);
		opt.setQue(que);
		opt.setFlag(opt.getFlag());
		orepo.save(opt);
		return opt.getOpid();
	}

	@Override
	public String submitQuiz(Quiz q) {
		int totalQues = q.getQuestions().size();
		int totalAns = 0;
//		int marks=0;
		String status=null;
		for(Question que : q.getQuestions()) {
			char ans = que.getAnswer();
			System.out.println(que.getQuestion() + " : " + que.getAnswer());
			for(Option op : que.getOption()) 
				if(op.getOption() == ans && op.getFlag() == 1)
					totalAns ++;
//				System.out.println(op.getOption() +" "+ op.getText());
				
			}
		System.out.println("Correct ans : "+ totalAns +" Out of" + totalQues);
		double percent = (totalAns * 100 )/totalQues;
		if(percent>=60.0)
			return "Percentage: "+ percent +  "  PASS";
		else
			return "Percentage: "+ percent +  "  FAIL";
//				if(que.getAnswer() == op.getOption() && op.getFlag() == 1 ) {
//					marks += 10;
//					if(marks>=20) {
//						status="You are passed";
//					}
//					else {
//						status="You are failed";
//					}
//				}
//			}
//		}
//		System.out.println("Quiz result: "+ marks + "%  " + status);
	}

	@Override
	public Question getQuestion(int qid) {
		return qrepo.findById(qid).get();
	}

}
