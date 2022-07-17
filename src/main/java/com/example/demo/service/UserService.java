package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public boolean fingdByUsername(String username) {
	    UserEntity user= userRepo.getByUsername(username);
	    if(user!=null) {return true;}    
	    else {return false;} 
	    	
	}

	public boolean findByPassword(String username,String password) {
		UserEntity user= userRepo.getByPassword(username,password);
		   if(user!=null) {return true;}    
		    else {return false;} 
		
	}

	public boolean saveUser(UserEntity user) {
		  UserEntity res =userRepo.save(user);
		  if(res!=null) {return true;}
		  else {return false;}
	}
	
	
	
	
}
