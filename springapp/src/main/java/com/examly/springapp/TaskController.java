package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;


@RestController
@RequestMapping("/")
public class TaskController {

    @Autowired
	private TaskService taskService ; 
    
    @PostMapping("/saveTask")
	    public Task saveTask(@RequestBody TaskDTO taskDTO , @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {	
	        return taskService.addTasks(taskDTO) ;  
	    }
	    
	    @GetMapping("/alltasks")
	    public ResponseEntity<List<Task>> getAllTasks() {
	        List<Task> tasks = taskService.getTasks();
	        return ResponseEntity.ok(tasks);
	    }
    
}
