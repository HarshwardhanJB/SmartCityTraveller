package city.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import city.example.demo.models.User;
import city.example.demo.services.UserService;

@RestController
public class URegisterController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/api/save")
	public User saveUser(@RequestBody User user){
		return userService.saveUsers(user);
	}
	

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) 
    {
    	if(userService.authenticate(email, password))
    	{
    		return "Login successful";
        } 
    	else 
    	{
    		return "Invalid email or password";
    	}
    }
    	
}
