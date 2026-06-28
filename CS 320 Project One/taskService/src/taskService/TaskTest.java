package taskService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
	
	// Setter Tests for length 
	
	@Test
	void testTaskTaskIdClassLength() {
	      Task newTask = new Task("12345", "TaskName", "TaskDescription");
	      assertTrue(newTask.getTaskId().length() < 10);     
	}
	@Test
	void testTaskNameClassLength() {
	      Task newTask = new Task("12345", "TaskName", "TaskDescription");
	      assertTrue(newTask.getTaskName().length() < 20);   
	}
	@Test
	void testTaskTaskDescriptionClassLength() {
	      Task newTask = new Task("12345", "TaskName", "TaskDescription");
	      assertTrue(newTask.getTaskDescription().length() < 50);    
	}
	      
	// I worked testing into the program itself, so the tests may "fail", but the exception is handled in the Setter methods in the Contact class      
	// null tests for all Setters
	@Test
	void testTaskNullTaskIdClass() {
	      Task newTask = new Task(null, "TaskName", "TaskDescription");
	      assertTrue(newTask.getTaskId().equals(null));    
	}
	
	@Test
	void testTaskNullTaskNameClass() {
	      Task newTask = new Task("12345", null, "TaskDescription");
	      assertTrue(newTask.getTaskName().equals(null));     
	}
	@Test
	void testTaskNullTaskDescriptionClass() {
	      Task newTask = new Task("12345", "TaskName", null);
	      assertTrue(newTask.getTaskDescription().equals(null));     
	}
}