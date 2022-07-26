package non.zibatomaso.xamine.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity(name = "Patient_Order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private enum Status {
		OPEN, ASSIGNED, IN_PROGRESS, PENDING, CLOSED
	}

	private enum Procedure {
		XRAY, MRI, ULTRASOUND
	}

	@Column
	private String apptRoom;
	@Column
	private String apptTeam;
	@Column
	private String radioAnalysis;
	@Column
	@NotNull
	private String visitReason;
	@Column
	private String apptTime;

	@Transient
	private Timestamp timestamp;

	@Column
	private LocalDate apptDay;
	@Column
	private Date lastModified;
	@Column
	private Date dateCreated;

	@Column
	private boolean apptScheduled = false;
	@Column
	private boolean patientCheckedIn = false;

	@Transient
	private Patient patient;
	@Column
	@NotNull // One-to-One Patient
	private Long patientId;

	@Column(name = "Order_Status")
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name = "Order_Procedure")
	@Enumerated(EnumType.STRING)
	private Procedure procedure;

	public Order(String apptRoom, String apptTeam, String radioAnalysis, @NotNull String visitReason, String apptTime,
			boolean apptScheduled, boolean patientCheckedIn, Patient patient, @NotNull Long patientId,
			Procedure procedure) {

		this.id = -1L;
		this.apptRoom = apptRoom;
		this.apptTeam = apptTeam;
		this.radioAnalysis = radioAnalysis;
		this.visitReason = visitReason;
		this.apptTime = apptTime;
		this.lastModified = timestamp.getTimestamp();
		this.dateCreated = timestamp.getTimestamp();
		this.apptScheduled = apptScheduled;
		this.patientCheckedIn = patientCheckedIn;
		this.patient = patient;
		this.patientId = patient.getId();
		this.status = Status.OPEN;
		this.procedure = procedure;
	}

	public Long getId() {
		return id;
	}

	public String getApptRoom() {
		return apptRoom;
	}

	public void setApptRoom(String apptRoom) {
		this.apptRoom = apptRoom;
	}

	public String getApptTeam() {
		return apptTeam;
	}

	public void setApptTeam(String apptTeam) {
		this.apptTeam = apptTeam;
	}

	public String getRadioAnalysis() {
		return radioAnalysis;
	}

	public void setRadioAnalysis(String radioAnalysis) {
		this.radioAnalysis = radioAnalysis;
	}

	public String getVisitReason() {
		return visitReason;
	}

	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}

	public String getApptTime() {
		return apptTime;
	}

	public void setApptTime(String apptTime) {
		this.apptTime = apptTime;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public LocalDate getApptDay() {
		return apptDay;
	}

	public void setApptDay(LocalDate apptDay) {
		this.apptDay = apptDay;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isApptScheduled() {
		return apptScheduled;
	}

	public void setApptScheduled(boolean apptScheduled) {
		this.apptScheduled = apptScheduled;
	}

	public boolean isPatientCheckedIn() {
		return patientCheckedIn;
	}

	public void setPatientCheckedIn(boolean patientCheckedIn) {
		this.patientCheckedIn = patientCheckedIn;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Procedure getProcedure() {
		return procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", apptRoom=" + apptRoom + ", apptTeam=" + apptTeam + ", radioAnalysis="
				+ radioAnalysis + ", visitReason=" + visitReason + ", apptTime=" + apptTime + ", timestamp=" + timestamp
				+ ", apptDay=" + apptDay + ", lastModified=" + lastModified + ", dateCreated=" + dateCreated
				+ ", apptScheduled=" + apptScheduled + ", patientCheckedIn=" + patientCheckedIn + ", patient=" + patient
				+ ", patientId=" + patientId + ", status=" + status + ", procedure=" + procedure + "]";
	}
	
	

}
