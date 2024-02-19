package com.example.bracketlotterybackend;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Match {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	  private Integer maxNumberOfPlayers;
	  //will eventually be joined with Users
	  //private User usersInMatch;
	  private String sport; //maybe add a sports enum?
	  private Double entryFee;
	  private Double grandPrize;
	  //private Tournament tournament;
}
