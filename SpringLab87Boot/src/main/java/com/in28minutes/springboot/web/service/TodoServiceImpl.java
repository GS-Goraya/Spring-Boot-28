package com.in28minutes.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.springboot.web.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	TodoRepository todoRep;

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRep.save(todo);

	}

	@Override
	public Todo updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRep.save(todo);
	}

	@Override
	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		todoRep.deleteById(id);

	}

	@Override
	public List<Todo> getAllTodo(String name) {
		// TODO Auto-generated method stub
		return todoRep.findAll();
	}

	@Override
	public Todo getTodoById(int id) {
		// TODO Auto-generated method stub

		return todoRep.getOne(id);
	}

}
