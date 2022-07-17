package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContactEntity;
import com.example.demo.repo.ContactRepo;


@Service
public class ContactService {

	@Autowired
	private ContactRepo contactRepo;
	
	public boolean saveQuestion(ContactEntity contact) {
	    ContactEntity res =  contactRepo.save(contact);
	    if(res!=null) { return true; }
	    else {return false;}
	}

}
