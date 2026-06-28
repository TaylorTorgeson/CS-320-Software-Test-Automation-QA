package appointmentService;

//import necessary Libraries

import java.util.HashMap;

public class AppointmentService{

	//Hashmap declaration	

	final HashMap<String, Appointment> appointments = new HashMap<>();

	// Function for adding Appointments

	public void addAppointment(Appointment appointment){
		// Exception Handling for duplicate keys
		if(appointments.containsKey(appointment.getAppointmentId())) {
			throw new IllegalArgumentException("Appointment Id already exist");
		}
		appointments.put(appointment.getAppointmentId(),appointment);
	}
	
	// Delete Appointment Function
	
	public void deleteAppointment(String appointmentId){
		appointments.remove(appointmentId);
	}

}