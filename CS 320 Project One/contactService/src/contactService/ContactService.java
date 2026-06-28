package contactService;

// import Hashmap Library

import java.util.HashMap;

public class ContactService{
  
// Hashmap declaration	

final HashMap<String, Contact> contacts = new HashMap<>();
  
	// Function for adding contacts

	public void addContact(Contact contact){
		// Exception Handling for duplicate keys
		if(contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact Id already exist");
		}
		contacts.put(contact.getContactId(), contact);
	}
	// Delete oOntact Function
	public void deleteContact(String contactId){
		contacts.remove(contactId);
	}
	// Update First Name Function
	public void updateFirstName(String contactId, String firstName) {
		Contact currentContact = contacts.get(contactId);
		currentContact.setFirstName(firstName);
	}
	// Update Last Name Function
	public void updateLastName(String contactId, String lastName) {
		Contact currentContact = contacts.get(contactId);
		currentContact.setLastName(lastName);
	}
	// Update Phone Number Function
	public void updatePhoneNumber(String contactId, String phoneNumber) {
		Contact currentContact = contacts.get(contactId);
		currentContact.setPhoneNumber(phoneNumber);
	}
	// Update Address Function
	public void updateAddress(String contactId, String address) {
		Contact currentContact = contacts.get(contactId);
		currentContact.setAddress(address);
	}
}
