package com.ericsoares.restful.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ericsoares.restful.webservices.dao.UserDao;
import com.ericsoares.restful.webservices.domain.User;

@RestController
public class UserController {

	@Autowired
	private UserDao dao;
	
	@GetMapping("/users")
	public List<User> retrieveAllUser(){
		return dao.findAll();
	}
	
	
	
	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable int id) {
		return dao.findOne();
	}
}
