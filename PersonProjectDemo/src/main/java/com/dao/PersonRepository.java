package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

	Person getByCity(String s);
}
