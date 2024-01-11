package com.demo.toDoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.toDoApp.model.ToDo;
@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Long>{

}
 