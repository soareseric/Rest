package com.ericsoares.restful.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsoares.restful.webservices.domain.HelloWorldBean;

//Controller 
@RestController
public class HelloWorldController {

	// GET
	// URI - /hello-world
	// method - "Hello World"

	//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return " Hello World ";
	}
	
	@GetMapping(value = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
	
	
}
