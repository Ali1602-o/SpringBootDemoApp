package org.ensias.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.ensias.modele.*;

public interface VoitureRepo extends MongoRepository<Voiture,Integer>{
	
}
