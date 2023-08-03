package com.examly.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository ;

	@Autowired
	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	} 
	
	public List<Task> getTasks()
	{
		return taskRepository.findAll();
	}
	
	public Task addTasks(TaskDTO taskDTO)
	{
		Task t1 = new Task(
					taskDTO.getTaskId(),
					taskDTO.getTaskHolderName(),
					taskDTO.getTaskDate(),
					taskDTO.getTaskName(),
					taskDTO.getTaskStatus()
				);
		
		taskRepository.save(t1);
		
		return t1;
	}
	
	public void deleteTask(Long id) 
	{
		taskRepository.deleteById(id);
	}

	public Task findByTaskHolderName(String taskHolderName) {
		return taskRepository.findByTaskHolderName(taskHolderName);
	}

	public Object findById(Long id) {
		return taskRepository.findById(id);
	}
	
	
}
