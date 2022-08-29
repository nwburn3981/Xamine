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
public class Team implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Transient
	private Doctor doctor;
	@Column
	private String doctorName;
	
	@Transient
	private Radiologist radiologist;
	@Column
	private String radioName;
	
	@Transient
	private ArrayList<Technician> techs = new ArrayList<>();
	@Transient
	private ArrayList<Patient> patients = new ArrayList<>();
	@Transient
	private ArrayList<Order> orders = new ArrayList<>();
	
	public Team() {
		this(new Doctor(), new Radiologist(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		this.id = -1L;
	}

	public Team(Doctor doctor, Radiologist radiologist, ArrayList<Technician> techs, ArrayList<Patient> patients,
			ArrayList<Order> orders) {
		super();
		this.doctor = doctor;
		this.doctorName = doctor.getLastName();
		this.radiologist = radiologist;
		this.radioName = radiologist.getLastName(); 
		this.techs = techs;
		this.patients = patients;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Radiologist getRadiologist() {
		return radiologist;
	}

	public void setRadiologist(Radiologist radiologist) {
		this.radiologist = radiologist;
	}

	public String getRadioName() {
		return radioName;
	}

	public void setRadioName(String radioName) {
		this.radioName = radioName;
	}

	public ArrayList<Technician> getTechs() {
		return techs;
	}

	public void setTechs(ArrayList<Technician> techs) {
		this.techs = techs;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", doctor=" + doctor + ", doctorName=" + doctorName + ", radiologist=" + radiologist
				+ ", radioName=" + radioName + ", techs=" + techs + ", patients=" + patients + ", orders=" + orders
				+ "]";
	}
	
	

}
