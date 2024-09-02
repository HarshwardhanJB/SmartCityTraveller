package city.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddMoreDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String fname;
	private String lname;
	private int aadhaarNo;
	private String addr;
	private String contNo;
	private String busiemail;
	private String busiAdd;
	private String busiContNo;
	private int busiyear;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(int aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getContNo() {
		return contNo;
	}
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}
	public String getBusiemail() {
		return busiemail;
	}
	public void setBusiemail(String busiemail) {
		this.busiemail = busiemail;
	}
	public String getBusiAdd() {
		return busiAdd;
	}
	public void setBusiAdd(String busiAdd) {
		this.busiAdd = busiAdd;
	}
	public String getBusiContNo() {
		return busiContNo;
	}
	public void setBusiContNo(String busiContNo) {
		this.busiContNo = busiContNo;
	}
	public int getBusiyear() {
		return busiyear;
	}
	public void setBusiyear(int busiyear) {
		this.busiyear = busiyear;
	}
	public AddMoreDetails(String fname, String lname, int aadhaarNo, String addr, String contNo, String busiemail,
			String busiAdd, String busiContNo, int busiyear) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.aadhaarNo = aadhaarNo;
		this.addr = addr;
		this.contNo = contNo;
		this.busiemail = busiemail;
		this.busiAdd = busiAdd;
		this.busiContNo = busiContNo;
		this.busiyear = busiyear;
	}
	public AddMoreDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
