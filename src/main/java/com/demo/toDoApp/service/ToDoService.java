package com.demo.toDoApp.service;

import java.util.List;

import com.demo.toDoApp.model.ToDo;

public interface ToDoService {
	public List<ToDo> getAllToDoItems();
	public ToDo getToDoItemById(Long id);
	public boolean updateStatus(Long id);
	public boolean saveOrUpdateToDoItem(ToDo todo);
	public boolean deleteToDoItem(Long id);
}