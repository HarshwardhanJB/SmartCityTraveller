package city.example.demo.models;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AddHotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	
	private String name;
	private String address;
	private String descp;
	private int rate;
	private Blob photos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Blob getPhotos() {
		return photos;
	}
	public void setPhotos(Blob photos) {
		this.photos = photos;
	}
	
	
	public AddHotel(String name, String address, String descp, int rate, Blob photos) {
		super();
		this.name = name;
		this.address = address;
		this.descp = descp;
		this.rate = rate;
		this.photos = photos;
	}
	public AddHotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
