package backet.lottery.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/account")
public class AccountController {
    
    @PostMapping("/createAccount")
	public void createAccount(@RequestBody String message) {
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	
    	System.out.println("Message was: " + message);
    	System.out.println("Message was: " + message);
    }
}