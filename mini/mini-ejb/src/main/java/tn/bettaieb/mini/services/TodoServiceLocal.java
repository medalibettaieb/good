package tn.bettaieb.mini.services;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.mini.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
