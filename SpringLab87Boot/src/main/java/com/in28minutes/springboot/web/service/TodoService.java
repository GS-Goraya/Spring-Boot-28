package com.in28minutes.springboot.web.service;

import java.util.List;

import com.in28minutes.springboot.web.model.Todo;

public interface TodoService {

	Todo saveTodo(Todo todo);

	Todo updateTodo(Todo todo);

	void deleteTodo(int id);

	Todo getTodoById(int id);

	List<Todo> getAllTodo(String name);

}
