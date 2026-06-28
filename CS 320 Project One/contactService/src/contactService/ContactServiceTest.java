package contactService;

// Import Junit Test Libraries

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
	
	// Tests for adding Contact Objects
	
	@Test
	void testAddContact() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact);
	    Contact addedContact = testService.contacts.get("12345");
	    assertTrue(newContact.getContactId() == addedContact.getContactId()); 

	}
	
	// Tests for deleting Contact Objects
	
	@Test
	void testDeleteContact() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact); 
	    testService.deleteContact(newContact.getContactId());
	    assertTrue(testService.contacts.get("12345") == null);     
	}
	
	// Tests for Updating First Names
	
	@Test
	void testUpdateFirstName() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact); 
	    testService.updateFirstName(newContact.getContactId(), "Sarah");
	    assertTrue(testService.contacts.get(newContact.getContactId()).getFirstName() == "Sarah"); 
	}
	
	// Tests for Updating Last Names
	
	@Test
	void testUpdateLastName() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact); 
	    testService.updateLastName(newContact.getContactId(), "Sarah");
	    assertTrue(testService.contacts.get(newContact.getContactId()).getLastName() == "Sarah"); 
	}
	
	// Tests for Updating Phone Numbers
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact); 
	    testService.updatePhoneNumber(newContact.getContactId(), "2222222222");
	    assertTrue(testService.contacts.get(newContact.getContactId()).getPhoneNumber() == "2222222222"); 
	}
	
	// Tests for Updating Addresses
	
	@Test
	void testUpdateAddress() {
		ContactService testService = new ContactService();
	    Contact newContact = new Contact("12345", "Taylor", "Torgeson", "1111111111", "1 Random Address Way");
	    testService.addContact(newContact); 
	    testService.updateAddress(newContact.getContactId(), "2 Impossible Address Way");
	    assertTrue(testService.contacts.get(newContact.getContactId()).getAddress() == "2 Impossible Address Way"); 
	}
	
}