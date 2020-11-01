package com.swagon.swagon.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CarOwner {
	@Id private String id;
	private static int counter = 1;
	private String firstName;
	private String lastName;
	private String city;
	private String password;
	private String email;
	
	public CarOwner()
	{
		
	}
	
	public CarOwner(String firstName, String lastName, String city, String password, String email) {
		
		this.id = "00" + String.valueOf(counter);
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.password = password;
		this.email = email;
		
		
		CarOwner.counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CarOwner.counter = counter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
	
	
}
