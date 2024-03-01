package com.example.bracketlotterybackend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/account")
public class AccountController {

    // standard constructors
    
	@Autowired
	private AccountService accountService;
	
    private final AccountRepository accountRepository;
    
    @GetMapping("/createAccount")
    @ResponseStatus(value = HttpStatus.OK)
    public void createAccount() {
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
//    	String message = "Connected to backend!";
//    	return message;
    }
}