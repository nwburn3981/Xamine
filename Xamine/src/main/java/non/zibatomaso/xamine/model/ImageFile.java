//package non.zibatomaso.xamine.model;
//
//import java.awt.Image;
//import java.io.Serializable;
//import java.security.Timestamp;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Transient;
//
////TODO VerifyImage method for .jpg or .png, probably put in service
//
////Make entity to hold all images and assign to orders by ID
//@Entity
//public class ImageFile implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id // One-to-Many Report
//	private Long id;
//
//	@Column
//	private Image image;
//
//	@Column
//	private String description;
//
//	@Transient
//	private Timestamp timestamp;
//
//	@Column
//	private Date dateCreated;
//
//	public ImageFile(Image image, String description, Date dateCreated) {
//		this.id = -1L;
//		this.image = image;
//		this.description = description;
//		this.dateCreated = timestamp.getTimestamp();
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public Image getImage() {
//		return image;
//	}
//
//	public void setImage(Image image) {
//		this.image = image;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Timestamp getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(Timestamp timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public Date getDateCreated() {
//		return dateCreated;
//	}
//
//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
//
//	@Override
//	public String toString() {
//		return "ImageFile [id=" + id + ", image=" + image + ", description=" + description + ", timestamp=" + timestamp
//				+ ", dateCreated=" + dateCreated + "]";
//	}
//
//}
