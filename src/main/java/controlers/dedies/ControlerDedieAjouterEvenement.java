package controlers.dedies;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.ville.evenements.Evenement;
import model.ville.evenements.IGestionEvenementVille;


@Controller
public class ControlerDedieAjouterEvenement {
	@Autowired
	private IGestionEvenementVille evenementVille;
	
	 @RequestMapping(path="/ajouterEvenement")
	 public String ajouterClient (ModelMap pModel, @RequestParam("nomEvt") String nomEvt, @RequestParam("typeEvt") String typeEvt, @RequestParam("idVille") Long idVille) {
		 try {
			 System.out.println(typeEvt + idVille);
			 Evenement e = this.evenementVille.ajouterEvenement(nomEvt, nomEvt, typeEvt, idVille);
			 pModel.addAttribute("e", e);
			 return "AjoutEvenementsReponse";			 
		 } catch (Exception e) {
			 System.out.println(e.getMessage());
			return "/errors/AjoutEvenementsError";
		}
	 }
}
