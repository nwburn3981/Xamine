package non.zibatomaso.xamine.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id // One-to-Many Image
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column //One-to-One Order
	private Long order_id;
	
	@Column
	private String radioSummary;
	
	@Column //One-to-One Team
	private Long team_id;
	
	public Report() {
		
	}

	public Report(Long order_id, String radioSummary, Long team_id) {

		this.id = -1L;
		this.order_id = order_id;
		this.radioSummary = radioSummary;
		this.team_id = team_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public String getRadioSummary() {
		return radioSummary;
	}

	public void setRadioSummary(String radioSummary) {
		this.radioSummary = radioSummary;
	}

	public Long getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Long team_id) {
		this.team_id = team_id;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", order_id=" + order_id + ", radioSummary=" + radioSummary + ", team_id=" + team_id
				+ "]";
	}
	
	
	
	
	

}
