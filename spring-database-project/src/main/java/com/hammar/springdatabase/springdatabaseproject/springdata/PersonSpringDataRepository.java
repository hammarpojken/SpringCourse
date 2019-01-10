package com.hammar.springdatabase.springdatabaseproject.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
