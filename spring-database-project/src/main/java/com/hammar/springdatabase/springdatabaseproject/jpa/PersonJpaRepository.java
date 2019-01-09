package com.hammar.springdatabase.springdatabaseproject.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager em;
	
	
	public Person findById(int id) {
		return em.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return em.merge(person);
	}

}
