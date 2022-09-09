package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//ToDo
//OneToOne Relationships

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static enum Role {
		ROLE_USER, ROLE_ADMIN
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String password;

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;

	@Column
	private boolean isActive;

	@OneToOne(mappedBy = "user")
	private Patient patient;

	@OneToOne(mappedBy = "user")
	private Employee employee;

	public User() {

		this("", "", Role.ROLE_USER);
		this.id = -1L;
	}

	public User(String username, String password, Role role) {

		this.id = -1L;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", username=" + username + ", role=" + role + ", isActive="
				+ isActive + ", patient=" + patient + ", employee=" + employee + "]";
	}

}
