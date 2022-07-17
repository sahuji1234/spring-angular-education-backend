package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContactEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.ContactService;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/**")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/login")
	public String login(@RequestBody UserEntity user) {
		boolean res= userService.fingdByUsername(user.getUsername());
		boolean res1= userService.findByPassword(user.getUsername(),user.getPassword());
		
		if(res==false) {return "user not found";}
		if(res1==true) {return "login success";}
		else {return "wrong password";}
		
	
	}
	
	@GetMapping("/register")
	public String register(@RequestBody UserEntity user) {
		boolean res= userService.saveUser(user);
		if(res==true) {return "registration success";}
		else {return "registration failed";}
		
	}
	
	@GetMapping("/contact-us")
	public String contactUs(@RequestBody ContactEntity contact) {
		boolean res= contactService.saveQuestion(contact);
		if(res==true) {return "success";}
		else {return "failed";}
		
	}
	

}
