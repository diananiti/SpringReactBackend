package com.rest.webservices.restfulwebservices;
import java.lang.String;

public class HelloWorldBean {
private String message;

public HelloWorldBean(String message) {
	this.message=message;
}

public String getMessage() {
	return message;
}

@Override
public String toString() {
	return "HelloWorldBean [message=" + message + "]";
}

public void setMessage(String message) {
	this.message = message;
}
}
