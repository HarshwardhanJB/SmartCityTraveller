package city.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.AddHotel;
import city.example.demo.repos.HotelRepository;



@Service
public class HotelService {
	@Autowired
	private HotelRepository repo;
	
	public AddHotel saveHotels(AddHotel hotel)
	{
		return repo.save(hotel);
	}
	
	public List<AddHotel> getAllHotels()
	{
		return repo.findAll();
	}
}
