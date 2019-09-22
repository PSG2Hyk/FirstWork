package com.mingyin.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
	@RequestMapping(value = "/sayHello/{name}", 
			method = RequestMethod.GET)
	public String sayHello(@PathVariable("name") String name) {
		System.out.println("aaa");
		return "{'msg': 'hello, " + name + "'}";  
	}
}