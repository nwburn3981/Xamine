//package non.zibatomaso.xamine.model;
//
//import java.io.File;
//import java.security.Timestamp;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Transient;
//
//@Entity
//public class Report {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	
//	@Column
//	private File report;
//	
//	@Transient
//	private Timestamp timestamp;
//	
//	@Column
//	private Date dateCreated;
//	@Column
//	private Date dateModified;
//	
//	@Transient
//	private Team team;
//	
//	@Column(name = "Team")
//	private Long teamId;
//	
//	@Transient
//	private
//
//}
