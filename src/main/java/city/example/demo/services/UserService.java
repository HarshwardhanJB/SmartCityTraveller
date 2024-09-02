package city.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import city.example.demo.models.User;
import city.example.demo.repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	
	public User saveUsers(User user)
	{
		return repo.save(user);
	}
	
	public boolean authenticate(String email, String password)
	{
		Optional<User> user = repo.findByEmail(email);
	    if (user.isPresent()) 
	    {
	    	return password.equals(user.get().getPass());
	    }
	    return false;
	}

}
