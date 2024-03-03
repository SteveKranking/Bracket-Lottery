package backet.lottery.backend.models;

import java.util.Date;

import jakarta.persistence.Column;

public class Result {
	//@Column private Contest contest;
	//@Column private User winner;	  
	
	@Column private Date createdDateTime;
	@Column private Date updatedDateTime;
}