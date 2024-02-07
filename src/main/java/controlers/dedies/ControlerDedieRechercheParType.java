package controlers.dedies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.ville.evenements.Evenement;
import model.ville.evenements.IGestionEvenementVille;
import model.ville.evenements.Ville;

@Controller
public class ControlerDedieRechercheParType {
	
	@Autowired
	private IGestionEvenementVille evenementVille;
	
	 @RequestMapping(path="/rechercheParType")
	 public String ajouterClient (ModelMap pModel, @RequestParam("typeEvt") String typeEvt) {
		 try {
			 List<Evenement> events = this.evenementVille.rechercheByType(typeEvt);
			 pModel.addAttribute("evtsTrouves", events);
			 return "RechercheEvenementsParTypeReponse";			 
		 } catch (Exception e) {
			return "/errors/rechercheEvenementError";
		}
	 }
}
