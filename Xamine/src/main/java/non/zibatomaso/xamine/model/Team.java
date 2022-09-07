package non.zibatomaso.xamine.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // One-to-Many Employees
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Transient
	private Employee doctor;
	@Column
	private Long doctor_id;

	@Transient
	private Employee radiologist;
	@Column
	private Long radio_id;

	@Transient
	private ArrayList<Employee> techs = new ArrayList<>();

	@Transient
	private ArrayList<Order> orders = new ArrayList<>();

	public Team() {
		this(new Employee(), new Employee(), new ArrayList<>(), new ArrayList<>());
		this.id = -1L;
	}

	public Team(Employee doctor, Employee radiologist, ArrayList<Employee> techs, ArrayList<Order> orders) {
		this.id = -1L;
		this.doctor = doctor;
		this.doctor_id = doctor.getId();
		this.radiologist = radiologist;
		this.radio_id = radiologist.getId();
		this.techs = techs;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public Employee getDoctor() {
		return doctor;
	}

	public void setDoctor(Employee doctor) {
		this.doctor = doctor;
	}

	public Long getDoctorId() {
		return doctor_id;
	}

	public void setDoctorId(Long doctorId) {
		this.doctor_id = doctorId;
	}

	public Employee getRadiologist() {
		return radiologist;
	}

	public void setRadiologist(Employee radiologist) {
		this.radiologist = radiologist;
	}

	public Long getRadioId() {
		return radio_id;
	}

	public void setRadioId(Long radioId) {
		this.radio_id = radioId;
	}

	public ArrayList<Employee> getTechs() {
		return techs;
	}

	public void setTechs(ArrayList<Employee> techs) {
		this.techs = techs;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", doctor=" + doctor + ", doctor_id=" + doctor_id + ", radiologist=" + radiologist
				+ ", radio_id=" + radio_id + ", techs=" + techs + ", orders=" + orders + "]";
	}

}
