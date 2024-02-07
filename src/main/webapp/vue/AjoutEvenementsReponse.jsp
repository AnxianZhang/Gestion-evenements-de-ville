<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%-- <%
	Boolean erreurAjoutEvt = (Boolean) request.getAttribute("ErreurAjoutEvenement");
	Evenement evt = (Evenement) request.getAttribute("EvenementAjoute");
%> --%>

<html>
<body>

<%-- <h1> Résultat de votre demande d'ajout d'évènement </h1>

<h2> 
<%	if (!erreurAjoutEvt) { %>
	L'évènement suivant a été ajouté : <%= evt.affichageSimple() %> 
<%}
else {  %>
	<span style="color:red;"> Evènement non ajouté car type incorrect <b> : <%= request.getParameter("typeEvt")%> </b> ! </span>
<%}%>

</h2> --%>

			<h2> L'évènement suivant a été ajouté : ${e.nom} </h2>  
					<a href="../vue/index.html">Retour au menu</a>
			
</body>
</html>