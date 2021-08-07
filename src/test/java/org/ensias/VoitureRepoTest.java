package org.ensias;

import static org.assertj.core.api.Assertions.assertThat;

import org.ensias.modele.Voiture;
import org.ensias.repository.VoitureRepo;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataMongoTest
public class VoitureRepoTest {
	
	

	@Autowired
	VoitureRepo voitureRepo;
	
	int testId;
		
		
	@Test
	public void ajoutVoiture() {
		Voiture voiture=new Voiture ("Tesla","Test","Blanche","M-2020",2021,800000);
		testId = voiture.getId();
		voitureRepo.insert(voiture);
		assertThat(voitureRepo.findById(testId)).isNotEmpty();
	}
	
	@Test
	public void supprimerVoiture() {
		voitureRepo.deleteById(testId);
		assertThat(voitureRepo.findById(testId)).isEmpty();
	}
	
	
}
