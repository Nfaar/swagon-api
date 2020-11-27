package com.swagon.swagon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagon.swagon.Model.Offer;


@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
	
}
