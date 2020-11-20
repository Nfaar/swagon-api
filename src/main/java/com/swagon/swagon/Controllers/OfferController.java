package com.swagon.swagon.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.swagon.swagon.OfferRepository;
import com.swagon.swagon.Model.Offer;
import com.swagon.swagon.Model.Renter;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class OfferController {

	private OfferRepository repository;

	OfferController(OfferRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/offers")
	@CrossOrigin
	List<Offer> all() {
		return repository.findAll();
	}

	@GetMapping("/offers/{id}")
	Optional<Offer> one(@PathVariable int id) {
		return repository.findById(id);
	}

	@CrossOrigin
	@PostMapping("/offers")
	Offer newOffer(@RequestBody Offer newOffer) {
		Offer test = repository.save(newOffer);
		return test;
	}
	@CrossOrigin
	@DeleteMapping("/offers/{id}")
	void deleteOffer(@PathVariable int id) {
		repository.deleteById(id);

	}
	
	@CrossOrigin
	@PutMapping("offers/{id}")
	Offer updateOffer(@RequestBody Offer newOffer, @PathVariable Integer id) {
		return repository.findById(id).map(Offer -> {
			Offer.setCarOwnerId(id);
			Offer.setModel(newOffer.getModel());
			Offer.setMileage(newOffer.getMileage());
			Offer.setMake(newOffer.getMake());
			Offer.setYearOfConstruction(newOffer.getYearOfConstruction());
			return repository.save(Offer);
		}).orElseGet(() -> {
			newOffer.setId(id);
			return repository.save(newOffer);
		});
	}
	


}
