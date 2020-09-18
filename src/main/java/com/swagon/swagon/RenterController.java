package com.swagon.swagon;

import org.springframework.web.bind.annotation.RestController;

import com.swagon.swagon.Model.Renter;

import java.util.List;

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
	Renter one(@PathVariable String id) {
		return repository.findById(id).orElseThrow(() -> new RenterNotFoundException(id));
	}

}

