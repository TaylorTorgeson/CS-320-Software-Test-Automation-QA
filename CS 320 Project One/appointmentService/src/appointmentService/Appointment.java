package appointmentService;

// import necessary Library

import java.util.Date;

public class Appointment {

	// necessary variables for each appointment
	private final String appointmentId;
	private Date appointmentDate; 
	private String appointmentDescription;
	Date currentDate = new Date();
  
	//Getters 
	
	public String getAppointmentId(){
		return appointmentId;
	}
	  
	public Date getAppointmentDate(){
		return appointmentDate;
	}
	  
	public String getAppointmentDescription(){
		return appointmentDescription;
	}

	  
	 //Setters with validation
	
	 public void setAppointmentDate(Date appointmentDate) {
		 // Exception Handling for Date and Null check
		 if(appointmentDate == null || appointmentDate.before(currentDate)) {
	    	 throw new IllegalArgumentException("Invalid Appointment Date");
	     }
	     // set Appointment Date
	     this.appointmentDate = appointmentDate;
	 }
	  
	 public void setAppointmentDescription(String appointmentDescription) {
		 // Exception Handling for length and Null check
		 if(appointmentDescription == null || appointmentDescription.length() > 50) {
			  throw new IllegalArgumentException("Invalid Appointment Description");
		 }
	     // set appointment Description
		 this.appointmentDescription = appointmentDescription;
	 }
	
	 //constructor for appointment Objects
	 
	 public Appointment(String appointmentId, Date appointmentDate, String appointmentDescription){
		 // Exception Handling for length and Null check
		 if(appointmentId == null || appointmentId.length() > 10) {
			 throw new IllegalArgumentException("Invalid Appointment ID");
		 }
		 //set appointmentId
		 this.appointmentId = appointmentId;
		 //setting the rest of the data for each appointment object
		 setAppointmentDate(appointmentDate);
		 setAppointmentDescription(appointmentDescription);
	 }
}
