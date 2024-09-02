package city.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.LegalInfo;
import city.example.demo.repos.LegalInfoRepo;


@Service
public class LegalService {
	@Autowired
	private LegalInfoRepo repo;
	
	public LegalInfo saveInfo(LegalInfo info)
	{
		return repo.save(info);
	}
	
	public List<LegalInfo> getInfo()
	{
		return repo.findAll();
	}
}
