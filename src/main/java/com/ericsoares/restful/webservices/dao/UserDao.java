package com.ericsoares.restful.webservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ericsoares.restful.webservices.domain.User;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Smith", new Date()));
		users.add(new User(3, "Will", new Date()));
	}
	
	private List<User> findAll(){
		return users;
	}
	
	private User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	private User findOne() {
		for (User user : users) {
			return user;
		}
		return null;
	}

}