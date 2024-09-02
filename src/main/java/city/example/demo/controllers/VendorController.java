package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.Vendor;
import city.example.demo.services.VendorService;

@RestController
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@PostMapping("/api/Vsave")
	public Vendor saveVendor(@RequestBody Vendor vendor){
		return vendorService.saveVendor(vendor);
	}
	
	@GetMapping("/api/getAllVendors")
	public List<Vendor> getVens() {
		return vendorService.getAllVendors();
	}
}
