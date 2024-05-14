package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.ToDo;

@Repository
public interface ToDoRepo extends JpaRepository <ToDo, Long> {
	
}
