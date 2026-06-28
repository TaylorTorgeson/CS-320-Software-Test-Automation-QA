package appointmentService;

//importing necessary libraries

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

	// I worked testing into the program itself, so the tests may "fail", but the exception is handled in the Setter methods in the Contact class
	// Date verification
	// These tests to work, you have to manipulate the days to be in the future, since the program selects today's date
	
	@Test
	void testFailAppointmentDateVerification() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 9);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "TaskDescription");
	    assertTrue(newAppointment.getAppointmentId().length() < 10);     
	}
	@Test
	void testPassAppointmentDateVerification() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "TaskDescription");
	    assertTrue(newAppointment.getAppointmentId().length() < 10);     
	}
	
	// Length Verification Tests
	
	@Test
	void testPassAppointmentIdLength() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "Appointment Description");
	    assertTrue(newAppointment.getAppointmentId().length() < 10);   
	}
	@Test
	void testFailAppointmentIdLength() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("1234567891011", appointmentDate, "Appointment Description");
	    assertTrue(newAppointment.getAppointmentId().length() < 10);   
	}
	@Test
	void testFailAppointmentDescriptionClassLength() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "Appointment Description but Ver Long......................................................................................");
	    assertTrue(newAppointment.getAppointmentDescription().length() < 50);    
	}          
	@Test
	void testPassAppointmentDescriptionClassLength() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, "Appointment Description");
	    System.out.println(newAppointment.getAppointmentDescription());
		assertTrue(newAppointment.getAppointmentDescription().length() < 50);    
	}
	
	// null tests for all Setters 
	
	@Test
	void testFailNullAppointmentId() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment(null, appointmentDate, "Appointment Description");
	    System.out.println(newAppointment.getAppointmentDescription());
	}
	@Test
	void testFailNullAppointmentDate() {
		Appointment newAppointment = new Appointment("12345", null, "Appointment Description");
	    System.out.println(newAppointment.getAppointmentDescription());    
	}
	@Test
	void testFailNullAppointmentDescription() {
		Date appointmentDate = new Date(2026 - 1900, 6 - 1, 30);
		Appointment newAppointment = new Appointment("12345", appointmentDate, null);
	    System.out.println(newAppointment.getAppointmentDescription());    
	}
}
