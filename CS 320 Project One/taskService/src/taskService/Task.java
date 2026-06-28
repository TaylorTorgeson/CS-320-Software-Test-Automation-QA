package taskService;

public class Task {

	// necessary variables for each task
	
	private final String taskId;
	private String taskName; 
	private String taskDescription; 
 
  
	//Getters 
	public String getTaskId(){
		return taskId;
	}
	  
	public String getTaskName(){
		return taskName;
	}
	  
	public String getTaskDescription(){
		return taskDescription;
	}

	  
	 //Setters with validation
	 public void setTaskName(String taskName) {
		 // Exception Handling for length and Null check
		 if(taskName == null || taskName.length() > 20) {
	    	 throw new IllegalArgumentException("Invalid Task Name");
	     }
	     // set Task Name
	     this.taskName = taskName;
	 }
	  
	 public void setTaskDescription(String taskDescription) {
		 // Exception Handling for length and Null check
		 if(taskDescription == null || taskDescription.length() > 50) {
			  throw new IllegalArgumentException("Invalid Task Description");
		 }
	     // set Task Description
		 this.taskDescription = taskDescription;
	 }
	  
	
	 //constructor for Task Objects
	 
	 public Task(String taskId, String taskName, String taskDescription){
		 // Exception Handling for length and Null check
		 if(taskId == null || taskId.length() > 10) {
			 throw new IllegalArgumentException("Invalid Task ID");
		 }
		 //set taskId
		 this.taskId = taskId;
		 //setting the rest of the data for each task object
		 setTaskName(taskName);
		 setTaskDescription(taskDescription);
	 }
}
