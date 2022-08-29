package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//ToDo
//OneToOne Relationships

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static enum Role {
		ROLE_USER, ROLE_ADMIN
	}

	public static enum Title {
		DOCTOR, RECEPTIONIST, RADIOLOGIST, TECHNICIAN, PATIENT
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

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
	
	@Column()
	@Enumerated(EnumType.STRING)
	private Title title;

	private boolean isActive;
	
	public User() {
		
		this( "", "", "", "N/A", "", "", Role.ROLE_USER);
		this.id = -1L;
	}

	public User(String username, String password, String firstName, String lastName, String email, String phoneNumber, Role role) {

		this.id = -1L;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [ID=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", username=" + username + ", email=" + email + ", Phone Number =" + phoneNumber + ", role=" + role + ", title=" + title + ", isActive="
				+ isActive + "]";
	}

}
