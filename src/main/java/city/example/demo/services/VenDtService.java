package city.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.AddMoreDetails;
import city.example.demo.repos.VendorDtRepo;


@Service
public class VenDtService {
	@Autowired
	private VendorDtRepo repo;
	
	public AddMoreDetails savedetails(AddMoreDetails details)
	{
		return repo.save(details);
	}
	
	public List<AddMoreDetails> allDetails()
	{
		return repo.findAll();
	}
}
