package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import non.zibatomaso.xamine.model.Employee.Title;


@Entity
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String email;
	@Column
	private String phoneNumber;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Title title;
	
	@Column //One-to-One relationship, user
	private Long user_id;

	public Patient() {
		this("", "", "", "");
		this.id = -1L;
		this.title = Title.PATIENT;
	}

	public Patient(String firstName, String lastName, String email, String phoneNumber) {
		this.id = -1L;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.title = Title.PATIENT;
	}
	
	

	public Long getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", title=" + title + "]";
	}

}