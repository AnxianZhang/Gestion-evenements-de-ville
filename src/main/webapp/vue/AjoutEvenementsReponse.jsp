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

<%-- <h1> R�sultat de votre demande d'ajout d'�v�nement </h1>

<h2> 
<%	if (!erreurAjoutEvt) { %>
	L'�v�nement suivant a �t� ajout� : <%= evt.affichageSimple() %> 
<%}
else {  %>
	<span style="color:red;"> Ev�nement non ajout� car type incorrect <b> : <%= request.getParameter("typeEvt")%> </b> ! </span>
<%}%>

</h2> --%>

			<h2> L'�v�nement suivant a �t� ajout� : ${e.nom} </h2>  
					<a href="../vue/index.html">Retour au menu</a>
			
</body>
</html>