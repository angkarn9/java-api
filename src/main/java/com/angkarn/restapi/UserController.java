package com.angkarn.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/user/1", method = RequestMethod.GET)
	public User getUser(){
		return new User(1, "Angkarn");
	}
}
