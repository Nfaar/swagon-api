package com.swagon.swagon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.swagon.swagon.Model.Offer;

public class OfferTests {
	
	@Test
	public void CreateOffer() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		
		assertEquals(1,offer.getCarOwnerId());
	}
	
	
	@Test
	public void GetMake() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		
		assertEquals("BMW",offer.getMake());
	}
	
	@Test
	public void SetMake() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		offer.setMake("VW");
		
		assertEquals("VW",offer.getMake());
	}
	
	@Test
	public void GetModel() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		
		assertEquals("335",offer.getModel());
	}
	
	@Test
	public void SetModel() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		offer.setModel("318");
		
		assertEquals("318",offer.getModel());
	}
	
	@Test
	public void GetMileage() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		
		assertEquals(129353,offer.getMileage());
	}
	
	@Test
	public void SetMileage() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		offer.setMileage(300);
		
		assertEquals(300,offer.getMileage());
	}
	
	@Test
	public void GetYearOfConstruction() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		
		assertEquals(2005,offer.getYearOfConstruction());
	}
	
	@Test
	public void SetYearOfConstruction() {
		Offer offer = new Offer(1, "BMW", "335", 129353, 2005);
		offer.setYearOfConstruction(2013);
		
		assertEquals(2013,offer.getYearOfConstruction());
	}
	

}
