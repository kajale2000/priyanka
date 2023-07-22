package com.service;

import com.model.Person;

public interface PersonService {

		Person add(Person p);
		Person getByCity(String s);
}
