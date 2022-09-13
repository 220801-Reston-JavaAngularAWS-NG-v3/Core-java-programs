package demo;
public class User {

	private String firstName;
	private String lastName;
	private long contact;
	private Address address;
	
	
	public User() {
		super();
	}
	
	public User(String firstName, String lastName, long contact, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String retrieveFullName() {
		return firstName + " " + lastName;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", address="
				+ address + "]";
	}
}
