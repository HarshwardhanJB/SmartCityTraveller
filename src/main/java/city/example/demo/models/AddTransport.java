package city.example.demo.models;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "transport")
public class AddTransport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String type;
	private int VIN;
	private String vehiModel;
	private String licePlateNo;
	private Blob images;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVIN() {
		return VIN;
	}
	public void setVIN(int vIN) {
		VIN = vIN;
	}
	public String getVehiModel() {
		return vehiModel;
	}
	public void setVehiModel(String vehiModel) {
		this.vehiModel = vehiModel;
	}
	public String getLicePlateNo() {
		return licePlateNo;
	}
	public void setLicePlateNo(String licePlateNo) {
		this.licePlateNo = licePlateNo;
	}
	public Blob getImages() {
		return images;
	}
	public void setImages(Blob images) {
		this.images = images;
	}
	public AddTransport(String type, int vIN, String vehiModel, String licePlateNo, Blob images) {
		super();
		this.type = type;
		VIN = vIN;
		this.vehiModel = vehiModel;
		this.licePlateNo = licePlateNo;
		this.images = images;
	}
	public AddTransport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
