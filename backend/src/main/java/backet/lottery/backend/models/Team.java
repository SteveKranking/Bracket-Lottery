package backet.lottery.backend.models;

import java.util.Date;

import jakarta.persistence.Column;

public class Team {
	@Column private String teamName;
	@Column private String school; //where applicable
	@Column private String city;
	@Column private String state;
	@Column private Integer seed;
	//somehow get a photo involved?
	
	//@Column private User owner; //player who has this team
	//maybe for this app we need a User-Match-Team joining table
	@Column private Date createdDateTime;
	@Column private Date updatedDateTime;

}