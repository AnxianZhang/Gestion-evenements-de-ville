package model.ville.evenements;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ville.persistance.IPersistanceGestionnaireEvtVille;

@Service
public class GestionEvenementsVille implements IGestionEvenementVille{
	
	@Autowired
	private IPersistanceGestionnaireEvtVille persistanceGestionnaireEvtVille;
	
	@Override
	public Evenement ajouterEvenement(String nomEvt, String descEvt, String typeEvt, Long idVille) {
		if(!typeEvt.equalsIgnoreCase("Conference") && !typeEvt.equalsIgnoreCase("Sport") && !typeEvt.equalsIgnoreCase("Spectacle"))
			throw new UnValideEventException();
		
		Ville v = this.persistanceGestionnaireEvtVille.getVille(idVille);
		System.out.println(v);
		Evenement e = v.saveEvent(nomEvt, descEvt, typeEvt);
		this.persistanceGestionnaireEvtVille.ajouterEvent(e);
		
		return e;
	}
	
	@Override
	public Ville ajoutVille(String nom) {
		Ville v = new Ville(nom);
		this.persistanceGestionnaireEvtVille.ajoutVille(v);
		return null;
	}
	
    public List<Evenement> rechercheByType(String type) {
		List<Evenement> evts = new ArrayList<>();
		for(Evenement e : this.persistanceGestionnaireEvtVille.getEvenements())
			if (e.getType().equalsIgnoreCase(type))
				evts.add(e);
		return evts.isEmpty() ? null : evts;
	}
}
