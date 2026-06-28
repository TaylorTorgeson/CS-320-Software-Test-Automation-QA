package taskService;

//import Hashmap Library

import java.util.HashMap;

public class TaskService{

	//Hashmap declaration	

	final HashMap<String, Task> tasks = new HashMap<>();


	// Function for adding tasks

	public void addTask(Task task){
		// Exception Handling for duplicate keys
		if(tasks.containsKey(task.getTaskId())) {
			throw new IllegalArgumentException("Task Id already exist");
		}
		tasks.put(task.getTaskId(),task);
	}
	// Delete Task Function
	public void deleteTask(String taskId){
		tasks.remove(taskId);
	}
	// Update Task Name Function
	public void updateTaskName(String taskId, String taskName) {
		Task currentTask = tasks.get(taskId);
		currentTask.setTaskName(taskName);
	}
	// Update Last Name Function
	public void updateTaskDescription(String taskId, String taskDescription) {
		Task currentTask = tasks.get(taskId);
		currentTask.setTaskDescription(taskDescription);
	}
}