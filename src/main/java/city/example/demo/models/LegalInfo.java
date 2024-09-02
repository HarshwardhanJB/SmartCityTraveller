package city.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "legalinfo")
public class LegalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String entityType;
	private String insured;
	private String pending;
	private String licensed;
	private String lice_no;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	public String getLicensed() {
		return licensed;
	}
	public void setLicensed(String licensed) {
		this.licensed = licensed;
	}
	public String getLice_no() {
		return lice_no;
	}
	public void setLice_no(String lice_no) {
		this.lice_no = lice_no;
	}
	public LegalInfo(String entityType, String insured, String pending, String licensed, String lice_no) {
		super();
		this.entityType = entityType;
		this.insured = insured;
		this.pending = pending;
		this.licensed = licensed;
		this.lice_no = lice_no;
	}
	public LegalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
