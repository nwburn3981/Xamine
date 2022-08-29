package non.zibatomaso.xamine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;



@Entity
public class Doctor extends User {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String password;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String email;
	@Column
	private String phoneNumber;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Title title;

	private boolean isActive;

	public Doctor() {
		super();
		this.title = Title.DOCTOR;
		this.isActive = true;
	}

	public Doctor(String username, String password, String firstName, String lastName, String email, String phoneNumber,
			Role role) {
		super(username, password, firstName, lastName, email, phoneNumber, role);
		this.title = Title.DOCTOR;
		this.isActive = true;
	}

	@Override
	public String toString() {
		return "Doctor [ID=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", username=" + username + ", email=" + email + ", phoneNumber=" + phoneNumber + ", role="
				+ role + ", title=" + title + ", isActive=" + isActive + "]";
	}



}
