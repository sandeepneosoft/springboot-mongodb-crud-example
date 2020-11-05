package net.guides.springboot.crud.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {

	@Id
	private long id;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique=true)
	private String firstName;
	private String lastName;
	
	@NotBlank
	@Size(max=100)
	@Indexed(unique=true)
	private String emailId;

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, firstName=%s, lastName=%s, emailId=%s]", id, firstName, lastName,
				emailId);
	}
	
}
