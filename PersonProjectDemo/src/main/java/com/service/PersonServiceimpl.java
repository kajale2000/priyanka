package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonRepository;
import com.model.Person;

@Service
public class PersonServiceimpl implements PersonService{

	@Autowired
	PersonRepository personrepo;

	@Override
	public Person add(Person p) {
		
		return personrepo.save(p);
	}

	@Override
	public Person getByCity(String p) {
		// TODO Auto-generated method stub
		return personrepo.getByCity(p);
	}

	
	
	
	
	

		
	
}
