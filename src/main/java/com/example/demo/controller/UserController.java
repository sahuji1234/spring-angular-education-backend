package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/login")
	public String login(@RequestBody UserEntity user) {
		boolean res= userService.fingdByUsername(user.getUsername());
		boolean res1= userService.findByPassword(user.getUsername(),user.getPassword());
		
		if(res==false) {return "user not found";}
		if(res1==true) {return "login success";}
		else {return "wrong password";}
		
	
	}

}
