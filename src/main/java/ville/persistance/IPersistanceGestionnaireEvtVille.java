package ville.persistance;

import java.util.List;

import model.ville.evenements.Evenement;
import model.ville.evenements.Ville;

public interface IPersistanceGestionnaireEvtVille {
	Ville getVille(Long id);
	void ajouterEvent(Evenement e);
	void ajoutVille(Ville v);
	List<Evenement> getEvenements();
}
