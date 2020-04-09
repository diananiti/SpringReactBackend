package com.rest.webservices.restfulwebservices.toDo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ToDoHardcodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	// like a database

	static {
		todos.add(new Todo(++idCounter, "diana", "learn Spring", new Date(), false));
		todos.add(new Todo(++idCounter, "diana", "learn Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "diana", "learn React", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
}
