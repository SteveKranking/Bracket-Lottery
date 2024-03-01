package com.example.bracketlotterybackend;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Contest {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	  private String contestName;
	  private Integer maxNumberOfPlayers;
	  private Integer currentPlayersInMatch; //can just do usersInMatch.size?
	  //will eventually be joined with Users
	  //private User usersInMatch;
	  private String sport; //maybe add a sports enum?
	  private Double entryFee;
	  private Double grandPrize;
	  private Date startTime;
	  //private User winner;
	  //private GameStatusEnum gameStatus;
	  private Date createdDateTime;
	  private Date updatedDateTime;
}