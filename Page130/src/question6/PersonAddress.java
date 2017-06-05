package question6;

public class PersonAddress
	{
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNmuber;
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public String getPhoneNumber()
	{
		return phoneNmuber;
	}
	public void setEmailAddress(String newEmailAddress)
	{
		emailAddress = newEmailAddress;
	}
	
	public void setPhoneNumber(String newPhoneNumber)
	{
	 phoneNmuber = newPhoneNumber;
	}
	
	 public boolean equals ( PersonAddress otherObject)
	 {
	 if (firstName.equals (otherObject.firstName ) && ( lastName.equals (otherObject.lastName)))
		 return true;
	 else
		 return false;
	 }
	
}
