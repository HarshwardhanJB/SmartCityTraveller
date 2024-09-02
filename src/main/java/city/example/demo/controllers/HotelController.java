package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.AddHotel;
import city.example.demo.services.HotelService;


@RestController
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/api/Hsave")
	public AddHotel saveHotel(@RequestBody AddHotel hotel){
		return hotelService.saveHotels(hotel);
	}
	
	@GetMapping("/api/getAllHotels")
	public List<AddHotel> getVens() {
		return hotelService.getAllHotels();
	}
}
