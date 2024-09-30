package com.demo.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

	@RequestMapping("api/health")
	public String sayHello() {
		return "API Health is good";
	}
	
	@RequestMapping("api/ping")
	public String sayPing() {
		return "Server responds good";
	}
	
	@RequestMapping("api/user")
	public String loginUser() {
		return "Hello Buddy!";
	}

	@RequestMapping("api/delete")
	public String deleteUser() {
		return "User has been deleted";
	}

	@RequestMapping("api/delete/users")
	public String deleteUsers() {
		return "Users has been deleted";
	}
	
	@RequestMapping("api/create/users")
	public String createUsers() {
		return "Users have been created";
	}
}
