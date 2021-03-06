package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int userId;
	private String userName;
	private String userDetails;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(String userDetails) {
		this.userDetails = userDetails;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String userDetails) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDetails = userDetails;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userDetails=" + userDetails + "]";
	}
	
}
