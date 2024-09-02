package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.LegalInfo;
import city.example.demo.services.LegalService;



@RestController
public class LegalController {
	@Autowired
	private LegalService legalService;
	
	@PostMapping("/api/Infosave")
	public LegalInfo saveInfo(@RequestBody LegalInfo info){
		return legalService.saveInfo(info);
	}
	
	@GetMapping("/api/getInfo")
	public List<LegalInfo> loginUser() {
		return legalService.getInfo();
	}
}
