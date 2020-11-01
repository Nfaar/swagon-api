package com.swagon.swagon.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.swagon.swagon.RenterRepository;
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
public class RenterController {
	
	
	private final RenterRepository repository;
	
	RenterController(RenterRepository repository) { this.repository = repository;}
	
	@GetMapping("/renters")
	List<Renter> all() { return repository.findAll();}
	
	@GetMapping("/renters/{id}")
	Optional<Renter> one(@PathVariable String id) {
		return repository.findById(id);
	}
	
	@CrossOrigin
	@PostMapping("/renters")
	public Renter createRenter(@RequestBody Renter newRenter)
	{
		Renter test = repository.save(newRenter);
		return test;
		//repository.save(newRenter);
		//return newRenter;
	}
	
	
	
	
	

}

