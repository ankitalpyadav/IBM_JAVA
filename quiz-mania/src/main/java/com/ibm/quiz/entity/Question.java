package com.ibm.quiz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ques")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	@Column(length=40)
	private String question;
	@Transient
	private char answer;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="qcode")
	private Quiz quiz;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "que",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Option> option =new ArrayList<Option>();

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public List<Option> getOption() {
		return option;
	}

	public void setOption(List<Option> option) {
		this.option = option;
	}
	
	
	
}
