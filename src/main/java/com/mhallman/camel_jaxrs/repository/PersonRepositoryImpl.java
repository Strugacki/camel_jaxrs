package com.mhallman.camel_jaxrs.repository;

import org.springframework.stereotype.Service;

import com.mhallman.camel_jaxrs.domain.Person;

@Service
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public Person create() {
		Person person = new Person();
		person.setFirstName("Domino");
		person.setLastName("Jachas");
		person.setAge(44);
		System.out.println(person.toString());
		return person;
	}

}
