package com.ibm.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate assign_date;
	private LocalDate finish_date;
	private String category;
	private String priority;
	private String status;
	private String task;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	public Todo() {
	}

	public Todo(int id, LocalDate assign_date, LocalDate finish_date, String category, String priority, String status,
			String task, User user) {
		super();
		this.id = id;
		this.assign_date = assign_date;
		this.finish_date = finish_date;
		this.category = category;
		this.priority = priority;
		this.status = status;
		this.task = task;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getAssign_date() {
		return assign_date;
	}

	public void setAssign_date(LocalDate assign_date) {
		this.assign_date = assign_date;
	}

	public LocalDate getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(LocalDate finish_date) {
		this.finish_date = finish_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
