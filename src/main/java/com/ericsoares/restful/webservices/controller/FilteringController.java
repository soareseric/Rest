package com.ericsoares.restful.webservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsoares.restful.webservices.filter.SomeBean;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("value 1", "value 2", "value 3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value 1", "value 2", "value 3"), new SomeBean("value 11", "value 12", "value 13"));
	}
}
