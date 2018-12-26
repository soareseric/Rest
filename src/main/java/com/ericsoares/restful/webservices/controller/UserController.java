package com.ericsoares.restful.webservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ericsoares.restful.webservices.dao.UserDao;
import com.ericsoares.restful.webservices.domain.User;
import com.ericsoares.restful.webservices.exceptions.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	private UserDao dao;

	@GetMapping("/users")	
	public List<User> retrieveAllUser() {
		return dao.findAll();
	}

	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable("id") int id) {
		User user = dao.findOne(id);
		if (user == null) {
			throw new UserNotFoundException("id - " + id);
		}
		return user;
	}
	
//	@GetMapping(value = "/user/{id}")
//	public ResponseEntity<User> find(@PathVariable Integer id) {
//		User obj = dao.findOne();
//		return ResponseEntity.ok().body(obj);
//	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = dao.save(user);
		
		URI location = ServletUriComponentsBuilder
		.fromCurrentRequest().path("/{id}")
		.buildAndExpand(savedUser.getId()).toUri();
	
		return ResponseEntity.created(location).build();
	}	

}
