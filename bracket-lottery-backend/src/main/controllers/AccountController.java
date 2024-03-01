package com.example.bracketlotterybackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

    // standard constructors
    
    private final AccountRepository accountRepository;
    
    @PostMapping("/account/createAccount")
    public void createAccount() {
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
    	System.out.println("Connecting to backend!!");
//    	accountRepository.save(account);
    }
}