package model.ville.evenements;

import java.util.List;

public interface IGestionEvenementVille {
	Evenement ajouterEvenement(String nomEvt, String descEvt, String typeEvt, Long idVille);
	Ville ajoutVille(String nom);
	List<Evenement> rechercheByType(String type);
}
