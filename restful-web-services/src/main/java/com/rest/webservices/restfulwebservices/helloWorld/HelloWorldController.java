package com.rest.webservices.restfulwebservices.helloWorld;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
//resolve the CORS error from frontend ,not allowed to call one server from another server
public class HelloWorldController {
	
	//get method
	
	//uri -/hello world 
	//method - "hello world"
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//create a bean 
	//hello-word-bean
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	//hello-world/path-variable/diana
	@GetMapping(path="hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean (String.format("Hello World, %s", name));
	}
	

}
