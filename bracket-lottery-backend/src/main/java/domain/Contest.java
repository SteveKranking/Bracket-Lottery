package domain;

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
	  
	  
	  @Override
	  public String toString() {
		return "Contest [id=" + id + ", contestName=" + contestName + ", maxNumberOfPlayers=" + maxNumberOfPlayers
				+ ", currentPlayersInMatch=" + currentPlayersInMatch + ", sport=" + sport + ", entryFee=" + entryFee
				+ ", grandPrize=" + grandPrize + ", startTime=" + startTime + ", createdDateTime=" + createdDateTime
				+ ", updatedDateTime=" + updatedDateTime + "]";
	}
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public Integer getMaxNumberOfPlayers() {
		return maxNumberOfPlayers;
	}
	public void setMaxNumberOfPlayers(Integer maxNumberOfPlayers) {
		this.maxNumberOfPlayers = maxNumberOfPlayers;
	}
	public Integer getCurrentPlayersInMatch() {
		return currentPlayersInMatch;
	}
	public void setCurrentPlayersInMatch(Integer currentPlayersInMatch) {
		this.currentPlayersInMatch = currentPlayersInMatch;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public Double getEntryFee() {
		return entryFee;
	}
	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}
	public Double getGrandPrize() {
		return grandPrize;
	}
	public void setGrandPrize(Double grandPrize) {
		this.grandPrize = grandPrize;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	private Double grandPrize;
	  private Date startTime;
	  //private User winner;
	  //private GameStatusEnum gameStatus;
	  private Date createdDateTime;
	  private Date updatedDateTime;
}
