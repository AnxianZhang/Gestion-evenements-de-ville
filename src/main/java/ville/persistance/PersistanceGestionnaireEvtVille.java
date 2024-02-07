package ville.persistance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.ville.evenements.Evenement;
import model.ville.evenements.Ville;

@Service
public class PersistanceGestionnaireEvtVille implements IPersistanceGestionnaireEvtVille{
	@Autowired
	private VilleRepository villeRepository;
	
	@Autowired
	private EvenementRepository evenementRepository;
	
	@Override
	public Ville getVille(Long id) {
		// TODO Auto-generated method stub
		return this.villeRepository.findById(id).orElse(null);
	}
	
	@Override
	public void ajouterEvent(Evenement e) {
		this.evenementRepository.save(e);
	}
	
	@Override
	public void ajoutVille(Ville v) {
		// TODO Auto-generated method stub
		this.villeRepository.save(v);
	}
	
	@Override
	public List<Evenement> getEvenements() {
		return this.evenementRepository.findAll();
	}
}
