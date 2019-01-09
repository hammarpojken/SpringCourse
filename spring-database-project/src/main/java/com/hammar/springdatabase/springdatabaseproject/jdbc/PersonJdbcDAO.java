package com.hammar.springdatabase.springdatabaseproject.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hammar.springdatabase.springdatabaseproject.entity.Person;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;   
	
	
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	public List<Person> findByName(String name) {
		return jdbcTemplate.query
				("select * from person where name=?", new Object [] { name }, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	public Person findById(int id) {
		return jdbcTemplate.queryForObject
				("select * from person where id=?", new Object [] {id}, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int deleteById(int id) {
		 return jdbcTemplate.update
				("delete from person where id=?", new Object [] {id});
	}

}
