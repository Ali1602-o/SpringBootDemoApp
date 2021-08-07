package org.ensias;

import static org.assertj.core.api.Assertions.assertThat;

import org.ensias.controller.VoitureController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Autowired
	VoitureController voitureController;
	

	@Test
	void contextLoads() {
		assertThat(voitureController).isNotNull();
	}

}
