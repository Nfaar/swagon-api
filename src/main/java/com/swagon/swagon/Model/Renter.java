package com.swagon.swagon.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Renter {
	@Id private String id;
	private static int counter = 1;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public Renter() {
		
	}
	
	
	public Renter(String firstName, String lastName, String email) {
		this.id = "00" + String.valueOf(counter);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
		Renter.counter++;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "Renter [id=" + id + ", firstName=" + firstName + ", email=" + email + "]";
	}
	
	

	
	
}
