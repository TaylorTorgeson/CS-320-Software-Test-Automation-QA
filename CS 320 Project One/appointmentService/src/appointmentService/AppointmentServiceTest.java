package appointmentService;

// importing necessary libraries

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

	// Tests for adding Appointment Objects
	// These tests to work, you have to manipulate the days to be in the future, since the program selects today's date
	
	@Test
	void testPassAddTask() {
		Date currentDate = new Date();
		AppointmentService appointmentService = new AppointmentService();
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "TaskDescription");
	    appointmentService.addAppointment(newAppointment);
	    Appointment addedAppointment = appointmentService.appointments.get("12345");
	    System.out.println(addedAppointment);
	    System.out.println(newAppointment);
	    assertTrue(addedAppointment == newAppointment); 
	}
	
	// Tests for deleting Appointment Objects
	
	@Test
	void testPassDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "TaskDescription");
	    appointmentService.addAppointment(newAppointment);
	    appointmentService.deleteAppointment("12345");
	    assertTrue(appointmentService.appointments.get("12345") == null);   
	}
}
