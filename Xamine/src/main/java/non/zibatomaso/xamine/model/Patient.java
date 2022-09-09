package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private User user;

	public Patient() {
		this("", "", "", "", new User());
		this.id = -1L;
		this.title = Title.PATIENT;
	}

	public Patient(String firstName, String lastName, String email, String phoneNumber, User user) {
		this.id = -1L;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", title=" + title + ", user=" + user + "]";
	}

}