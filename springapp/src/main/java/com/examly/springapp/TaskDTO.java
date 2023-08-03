package com.examly.springapp;

import java.time.LocalDate;

public class TaskDTO {
    
    private Long taskId;
	private String taskHolderName;
	private LocalDate taskDate;
	private String taskName;
	private String taskStatus;
	
	public TaskDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TaskDTO(Long taskId, String taskHolderName, LocalDate taskDate, String taskName, String taskStatus) {
		super();
		this.taskId = taskId;
		this.taskHolderName = taskHolderName;
		this.taskDate = taskDate;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskHolderName() {
		return taskHolderName;
	}

	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	@Override
	public String toString() {
		return "TaskDTO [taskId=" + taskId + ", taskHolderName=" + taskHolderName + ", taskDate=" + taskDate
				+ ", taskName=" + taskName + ", taskStatus=" + taskStatus + "]";
	}
	
	
}
