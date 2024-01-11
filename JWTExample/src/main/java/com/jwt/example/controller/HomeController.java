package com.jwt.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.service.UserService;

@RestController
public class HomeController {

	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserService service;

	@RequestMapping("/test")
	public String test() {
		this.logger.warn("This is working message");
		return "Testing message";
	}

	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting User");
		return service.getUsers();
	}

}
