package backet.lottery.backend.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backet.lottery.backend.repos.AccountRepository;
import backet.lottery.backend.services.AccountService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/account")
public class AccountController {
    
	@Autowired
	private AccountService accountService;
	
	@Autowired
    private AccountRepository accountRepository;
    
    @PostMapping("/createAccount")
	public void createAccount(@RequestBody String message) {
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	
    	System.out.println("Message was: " + message);
    	System.out.println("Message was: " + message);
//    	String message = "Connected to backend!";
//    	return message;
    }
}