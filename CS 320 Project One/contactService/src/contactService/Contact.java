
package contactService;

public class Contact {
	
	// necessary variables for each contact
	
	private final String contactId;
	private String firstName; 
	private String lastName; 
	private String phoneNumber; 
	private String address; 
  
	//Getters 
	public String getContactId(){
		return contactId;
	}
	  
	public String getFirstName(){
		return firstName;
	}
	  
	public String getLastName(){
		return lastName;
	}
	  
	public String getPhoneNumber(){
	    return phoneNumber;
	}
	  
	public String getAddress(){
		return address;
	}
	  
	 //Setters with validation
	 public void setFirstName(String firstName) {
		 // Exception Handling for length and Null check
		 if(firstName == null || firstName.length() > 10) {
	    	 throw new IllegalArgumentException("Invalid First Name");
	     }
	     // set First Name
	     this.firstName = firstName;
	 }
	  
	 public void setLastName(String lastName) {
		 // Exception Handling for length and Null check
		 if(lastName == null || lastName.length() > 10) {
			  throw new IllegalArgumentException("Invalid Last Name");
		 }
	     // set Last Name
		 this.lastName = lastName;
	 }
	  
	 public void setPhoneNumber(String phoneNumber) {
		// Exception Handling for length and Null check
		 if(phoneNumber == null || phoneNumber.length() != 10) {
	    	 throw new IllegalArgumentException("Invalid Phone Number");
	     }
		 // set Phone Number
		 this.phoneNumber = phoneNumber;
	 }
	  
	 public void setAddress(String address) {
		 // Exception Handling for length and Null check
		 if(address == null || address.length() > 30) {
			 throw new IllegalArgumentException("Invalid Address");
		 }
		 //set Address
		 this.address = address;
	 }
	
	 //constructor for Contact Objects
	 
	 public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address){
		 // Exception Handling for length and Null check
		 if(contactId == null || contactId.length() > 10) {
			 throw new IllegalArgumentException("Invalid Contact ID");
		 }
		 //set contactId
		 this.contactId = contactId;
		 //setting the rest of the data for each object
		 setFirstName(firstName);
		 setLastName(lastName);
		 setPhoneNumber(phoneNumber);
		 setAddress(address);
	 }
}