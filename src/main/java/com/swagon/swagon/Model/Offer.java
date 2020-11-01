package com.swagon.swagon.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Offer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private static int counter = 1;
	private Integer carOwnerId;
	private String model;
	private String make;
	private int yearOfConstruction;
	private int mileage;
	private boolean archieved;
	
	public Offer() {
		
	}
	
	public Offer(String model, int yearOfConstruction) {
		this.id = counter;
		this.carOwnerId = 1;
		this.model = model;
		this.make = null;
		this.mileage = 0;
		this.archieved = false;
		this.yearOfConstruction = yearOfConstruction;
		
		
		
		Offer.counter++;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCarOwnerId() {
		return carOwnerId;
	}

	public void setCarOwnerId(Integer id2) {
		this.carOwnerId = id2;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isArchieved() {
		return archieved;
	}

	public void setArchieved(boolean archieved) {
		this.archieved = archieved;
	}

}
