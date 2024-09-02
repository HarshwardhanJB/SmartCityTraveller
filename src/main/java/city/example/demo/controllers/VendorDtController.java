package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.AddMoreDetails;
import city.example.demo.services.VenDtService;


@RestController
public class VendorDtController {
	@Autowired
	private VenDtService venService;
	
	@PostMapping("/api/Dtsave")
	public AddMoreDetails saveDetails(@RequestBody AddMoreDetails details){
		return venService.savedetails(details);
	}
	
	@GetMapping("/api/getDetails")
	public List<AddMoreDetails> getDetails() {
		return venService.allDetails();
	}

}
