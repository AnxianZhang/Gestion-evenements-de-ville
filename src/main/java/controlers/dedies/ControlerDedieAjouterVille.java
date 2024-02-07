package controlers.dedies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.ville.evenements.IGestionEvenementVille;
import model.ville.evenements.Ville;

@Controller
public class ControlerDedieAjouterVille {
	@Autowired
	private IGestionEvenementVille evenementVille;
	
	 @RequestMapping(path="/ajoutVille")
	 public String ajouterClient (ModelMap pModel, @RequestParam("ville") String nomVille) {
		 try {
			 Ville v = this.evenementVille.ajoutVille(nomVille);
			 pModel.addAttribute("v", v);
			 return "AjouterVilleSuccess";			 
		 } catch (Exception e) {
			return "/errors/AjouterVilleError";
		}
	 }
}
