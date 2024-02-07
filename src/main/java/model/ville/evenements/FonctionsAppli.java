//package model.ville.evenements;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author ouziri
// * @version 0.1
// *
// */
//
//@WebServlet("/do")
//public class FonctionsAppli extends HttpServlet {
//	
//	private static Ville ville = new Ville("Paris");
//       
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	
//    	String fonctionDemandee = request.getParameter("fonction");    	
//    	
//    	switch (fonctionDemandee) {
//		case "RechercheParType":
//			String typeRecherche = request.getParameter("typeEvt");
//			List<Evenement> evts = FonctionsAppli.rechercheByType(typeRecherche);
//			request.setAttribute("evtsTrouves", evts);
//			RequestDispatcher d = request.getRequestDispatcher("./Vue/RechercheEvenementsParTypeReponse.jsp");
//			d.forward(request, response);
//			break;
//			
//		case "AjouterEvenement":
//			String nom = request.getParameter("nomEvt");
//			String desc = request.getParameter("descEvt");
//			String type = request.getParameter("typeEvt");
//			if(!type.equalsIgnoreCase("Conference") && !type.equalsIgnoreCase("Sport") && !type.equalsIgnoreCase("Spectacle"))
//				request.setAttribute("ErreurAjoutEvenement", true);
//			else {
//				Evenement evt = new Evenement(nom, desc, type);
//				FonctionsAppli.ville.ajouterEvenement(evt);
//				request.setAttribute("EvenementAjoute", evt);
//				request.setAttribute("ErreurAjoutEvenement", false);
//			}
//			d = request.getRequestDispatcher("./Vue/AjoutEvenementsReponse.jsp");
//			d.forward(request, response);
//			break;
//
//		default:
//			response.getWriter().println("Demande incorrecte...");			
//			break;
//		}
//	}
//    
//    public static List<Evenement> rechercheByType(String type) {
//		List<Evenement> evts = new ArrayList<>();
//		for(Evenement e : FonctionsAppli.ville.getEvenements())
//			if (e.getType().equalsIgnoreCase(type))
//				evts.add(e);
//		return evts;
//	}
//
//}
