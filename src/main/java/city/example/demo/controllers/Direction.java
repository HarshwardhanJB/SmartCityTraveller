package city.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Direction {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/addDetails")
	public String addDetails() {
		return "AddMoreDetails";
	}
	
	@GetMapping("/updateDetails")
	public String updateDetails() {
		return "UpdateDetails";
	}
	
	@GetMapping("/addHotel")
	public String addhotels() {
		return "addhotel";
	}
	
	@GetMapping("/addLegal")
	public String addLegal() {
		return "LegalInformation";
	}

	@GetMapping("/userIndex")
	public String userIndex() {
		return "Userindex";
	}
}
