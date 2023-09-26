package com.project.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.task.model.Task;
import com.project.task.repository.TaskRepository;

@RestController
public class TaskController {
	@Autowired
	TaskRepository taskRepository;
	
	
	//@GetMapping(path="allTasks" , produces= {"application/xml"})
	 @GetMapping("/allTasks")
	public List<Task> getAllQuestions(){
		// int i=9/0;
		 //System.out.println("fetching");
		return taskRepository.findAll();
	
	}
	 //@PostMapping(path="addTask", produces={"application/json"})
	@PostMapping("/addTask")
	public Task addStudent(@RequestBody Task task ) {
	    taskRepository.save(task);
	    return task;
	}

}
