package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.AddTransport;
import city.example.demo.services.AddTransportService;



@RestController
public class AddTransportController {
	@Autowired
	private AddTransportService transportService;
	
	@PostMapping("/api/Tsave")
	public AddTransport saveUser(@RequestBody AddTransport transport){
		return transportService.saveTransport(transport);
	}
	
	@GetMapping("/api/getall")
	public List<AddTransport> loginUser() {
		return transportService.getall();
	}
}
