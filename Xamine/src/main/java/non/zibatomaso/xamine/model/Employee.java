package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static enum Title {
		DOCTOR, RECEPTIONIST, RADIOLOGIST, TECHNICIAN, PATIENT
	}

	@Id // One-to-Many Team
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String email;
	@Column
	private String phoneNumber;

	@Column()
	@Enumerated(EnumType.STRING)
	private Title title;

	@Column // One-to-One relationship, user
	private Long user_id;

	public Employee() {
		this("", "", "", "", Title.RECEPTIONIST, 0L);
		this.id = -1L;
	}

	public Employee(String firstName, String lastName, String email, String phoneNumber, Title title, Long user_id) {
		super();
		this.id = -1L;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.title = title;
		this.user_id = user_id;
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
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", title=" + title + ", user_id=" + user_id + "]";
	}

}
