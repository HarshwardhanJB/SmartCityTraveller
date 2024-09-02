package city.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.AddTransport;
import city.example.demo.repos.AddTransportRepository;


@Service
public class AddTransportService {
	@Autowired
	private AddTransportRepository repo;
	
	public AddTransport saveTransport(AddTransport transport)
	{
		return repo.save(transport);
	}
	
	public List<AddTransport> getall()
	{
		return repo.findAll();
	}
}
