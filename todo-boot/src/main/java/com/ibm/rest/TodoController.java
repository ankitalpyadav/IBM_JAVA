package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Todo;
import com.ibm.service.TodoService;

@CrossOrigin()
@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	private TodoService tservice;
	
	@PostMapping(value="/add/{userid}", consumes = "application/json")
	public String addTodo(@RequestBody Todo todo, @PathVariable int userid) {
		int id = tservice.addTodo(todo, userid);
		return "Todo created for user : " + userid + " with todo id : "+ id;
	}
	
	@GetMapping(value="/get/{id}",produces="application/json")
	public Todo getTodo(@PathVariable int id) {
		Todo todo = tservice.getTodo(id);
		return todo; 
	}
	
	@GetMapping(value="/getbyuser/{userid}",produces="application/json")
	public List<Todo> getTodosByUser(@PathVariable int userid){
		List<Todo> todos = tservice.todoByUser(userid);
		return todos;
	}
	
	@PostMapping(value="/delete/{id}")
	public boolean deleteTodo(@PathVariable int id) {
		boolean todo = tservice.removeTodo(id);
		return todo;
	}
	
	@PostMapping(value="/upadte", consumes = "application/json")
	public String updateTodo(@RequestBody Todo todo, @PathVariable int userid) {
		Todo utodo = tservice.updateTodo(todo);
		return "Todo updated for id : " + utodo.getId();
	}
	
}
