package backet.lottery.backend.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="ACCOUNT")
public class Account {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column private Integer id;
  @Column private String username;
  @Column private String email;
  @Column private String password;
  @Column private String firstname;
  @Column private String lastname;
  @Column private Date dateOfBirth;
  @Column private String phoneNumber;
  //Address?
  @Column private String street;
  @Column private String aptNumber;
  @Column private String city;
  @Column private String state;
  @Column private String country;
  @Column private String zipcode;
  
  @Column private Double balance;
  @Column private Double moneyAdded;
  @Column private Double moneyWon;
  
  @Column private Date createdDateTime;
  @Column private Date updatedDateTime;
  
  @Override
  
public String toString() {
	return "Account [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
			+ ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth=" + dateOfBirth + ", phoneNumber="
			+ phoneNumber + ", street=" + street + ", aptNumber=" + aptNumber + ", city=" + city + ", state=" + state
			+ ", country=" + country + ", zipcode=" + zipcode + ", balance=" + balance + ", moneyAdded=" + moneyAdded
			+ ", moneyWon=" + moneyWon + ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime
			+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getMoneyAdded() {
		return moneyAdded;
	}
	public void setMoneyAdded(Double moneyAdded) {
		this.moneyAdded = moneyAdded;
	}
	public Double getMoneyWon() {
		return moneyWon;
	}
	public void setMoneyWon(Double moneyWon) {
		this.moneyWon = moneyWon;
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
  
}