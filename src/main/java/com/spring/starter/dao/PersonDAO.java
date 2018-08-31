
package com.spring.starter.dao;

import java.util.List;

import com.spring.starter.model.*;

public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
