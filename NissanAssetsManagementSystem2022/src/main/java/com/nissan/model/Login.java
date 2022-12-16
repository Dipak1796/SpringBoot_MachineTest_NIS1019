package com.nissan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="tbllogin")
public class Login {
	//Instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer lId;
	private String username;
	private String password;
	private String userType;
	private Boolean isActive;
	//@OneToOne(mappedBy="login",cascade=CascadeType.ALL)
	//private User user;
	
		
	//Getter and Setters
	
	public Integer getlId() {
		return lId;
	}
	public void setlId(Integer lId) {
		this.lId = lId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	/*@JsonBackReference
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	
	
	
	

}
