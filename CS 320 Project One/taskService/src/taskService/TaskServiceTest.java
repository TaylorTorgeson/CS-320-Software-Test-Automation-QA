package taskService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TaskServiceTest {

	// Tests for adding Task Objects
	
	@Test
	void testAddTask() {
		TaskService testService = new TaskService();
	    Task newTask = new Task("12345", "TaskName", "TaskDescription");
	    testService.addTask(newTask);
	    Task addedTask = testService.tasks.get("12345");
	    assertTrue(newTask.getTaskId() == addedTask.getTaskId()); 

	}
	
	// Tests for deleting Task Objects
	
	@Test
	void testDeleteContact() {
		TaskService testService = new TaskService();
	    Task newTask = new Task("12345", "TaskName", "TaskDescription");
	    testService.addTask(newTask); 
	    testService.deleteTask(newTask.getTaskId());
	    assertTrue(testService.tasks.get("12345") == null);     
	}
	
	// Tests for Updating Task Names
	
	@Test
	void testUpdateTaskName() {
		TaskService testService = new TaskService();
	    Task newTask = new Task("12345", "TaskName", "TaskDescription");
	    testService.addTask(newTask); 
	    testService.updateTaskName(newTask.getTaskId(), "NameTask");
	    assertTrue(testService.tasks.get(newTask.getTaskId()).getTaskName() == "NameTask"); 
	}
	
	// Tests for Updating Task Descriptions
	
	@Test
	void testUpdateTaskDescription() {
		TaskService testService = new TaskService();
	    Task newTask = new Task("12345", "TaskName", "TaskDescription");
	    testService.addTask(newTask); 
	    testService.updateTaskDescription(newTask.getTaskId(), "DescriptionTask");
	    assertTrue(testService.tasks.get(newTask.getTaskId()).getTaskDescription() == "DescriptionTask"); 
	}
}
