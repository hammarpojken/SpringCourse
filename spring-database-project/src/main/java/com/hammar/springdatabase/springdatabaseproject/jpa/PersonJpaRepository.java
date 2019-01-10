package com.hammar.springdatabase.springdatabaseproject.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager em;

	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = em.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	public Person findById(int id) {
		return em.find(Person.class, id);
	}

	public Person update(Person person) {
		return em.merge(person);
	}

	public void deleteById(int id) {
		Person person = findById(id);
		em.remove(person);
	}

}
