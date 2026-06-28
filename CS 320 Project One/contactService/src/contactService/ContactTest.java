package contactService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
	
	// Setter Tests for length 
	
	@Test
	void testContactContactIdClassLength() {
	      Contact newContact = new Contact("12345", "Taylor", "Taylor", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getContactId().length() < 10);     
	}
	@Test
	void testContactFirstNameClassLength() {
	      Contact newContact = new Contact("12345", "Taylor", "Taylor", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getFirstName().length() < 10);     
	}
	@Test
	void testContactLastNameClassLength() {
	      Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getLastName().length() < 10);    
	}
	@Test
	void testContactPhoneNumberClassLength() {
	      Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getPhoneNumber().length() == 10);    
	}
	@Test
	void testContactAddressClassLength() {
	      Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getAddress().length() < 30);    
	}
	      
	// I worked testing into the program itself, so the tests may "fail", but the exception is handled in the Setter methods in the Contact class      
	// null tests for all Setters
	@Test
	void testContactNullContactIdClass() {
	      Contact newContact = new Contact(null, "Taylor", "Taylor", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getContactId().equals(null));    
	}
	
	@Test
	void testContactNullFirstNameClass() {
	      Contact newContact = new Contact("12345", null, "Taylor", "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getFirstName().equals(null));     
	}
	@Test
	void testContactNullLastNameClass() {
	      Contact newContact = new Contact("12345", "Taylor", null, "1111111111", "1 Random Address Way");
	      assertTrue(newContact.getLastName().equals(null));     
	}
	@Test
	void testContactNullPhoneNumberClass() {
	      Contact newContact = new Contact("12345", "Taylor", "Taylor", null, "1 Random Address Way");
	      assertTrue(newContact.getPhoneNumber().equals(null));     
	}
	@Test
	void testContactNullAddressClass() {
	      Contact newContact = new Contact("12345", "Taylor", "Taylor", "1111111111", null);
	      assertTrue(newContact.getAddress().equals(null));     
	}
}