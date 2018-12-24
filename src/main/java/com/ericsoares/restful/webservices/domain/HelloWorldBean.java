package com.ericsoares.restful.webservices.domain;

public class HelloWorldBean {

	private String message;
//	private String name;

	public HelloWorldBean(String message) {
		this.setMessage(message);
	}
	
	public HelloWorldBean(String message, String name) {
		this.setMessage(message);
//		this.setName(name);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "message" +  ": " + "name";
	}

}
 