package com.swagon.swagon.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Renter {
	@Id private String id;
	private static int counter = 1;
	private String username;
	private String password;
	private String email;
	
	public Renter() {
		
	}
	
	
	public Renter(String username, String email) {
		this.id = "00" + String.valueOf(counter);
		this.username = username;
		this.email = email;
		
		Renter.counter++;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Renter [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
	

	
	
}
