package org.ensias.controller;

import java.util.List;
import java.util.Optional;

import org.ensias.modele.Voiture;
import org.ensias.repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoitureController {
	
	@Autowired
	private VoitureRepo voitureRepository;
	
	
	@PostMapping("/Car")
	public void addCar(@RequestBody Voiture voiture) {
		voitureRepository.save(voiture);
	}

	@GetMapping("/Cars")
	public List<Voiture> getCars() {
		return voitureRepository.findAll();
	}

	@GetMapping("/Car/{id}")
	public Optional<Voiture> getCar(@PathVariable int id) {
		return voitureRepository.findById(id);
	}

	@DeleteMapping("/Car/{id}")
	public void deleteCar(@PathVariable int id) {
		voitureRepository.deleteById(id);
	}

}
