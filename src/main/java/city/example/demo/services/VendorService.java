package city.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.Vendor;
import city.example.demo.repos.VendorRepository;



@Service
public class VendorService {
	@Autowired
	private VendorRepository repo;
	
	public Vendor saveVendor(Vendor vendor)
	{
		return repo.save(vendor);
	}
	
	public List<Vendor> getAllVendors()
	{
		return repo.findAll();
	}
}
