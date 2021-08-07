package org.ensias.modele;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor

@Document(collection = "voiture")
public class Voiture {
	
	@Id
	private int id;
	
	@NonNull
	private String marque;
	
	@NonNull
	private String modele;
	
	@NonNull
	private String couleur;
	
	@NonNull
	private String immatricule;
	
	@NonNull
	private int annee;
	
	@NonNull
	private int prix;
	
}
