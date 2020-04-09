package com.rest.webservices.restfulwebservices.toDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.rest.webservices.restfulwebservices.toDo.Todo;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ToDoResource {
	@Autowired
	private ToDoHardcodedService todoService;
@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable  String username) {
		return todoService.findAll();
	}
}
