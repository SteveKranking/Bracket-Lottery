package domain;

import java.util.Date;

public class Team {
	private String teamName;
	private String school; //where applicable
	private String city;
	private String state;
	private Integer seed;
	//somehow get a photo involved?
	
	//private User owner; //player who has this team
	//maybe for this app we need a User-Match-Team joining table
	private Date createdDateTime;
	private Date updatedDateTime;

}
