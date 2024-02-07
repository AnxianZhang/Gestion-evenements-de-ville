<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<h1> Résultat de votre recherche d'évènements </h1>
			<c:forEach var="e" items="${evtsTrouves}">
					<h2>nom : <c:out value="${e.nom}"></c:out></h2>
					<h2>description : <c:out value="${e.description}"></c:out></h2>
					<h2>Type : <c:out value="${e.type}"></c:out></h2>	
			</c:forEach>
					<a href="../vue/index.html">Retour au menu</a>
			
<%-- 	<c:choose>
		<c:when test="${evtsTrouves}">
					<h2> Les évènements suivants correspondent au type ${param.typeEvt} que vous recherchez : </h2> <br/>

		</c:when>
		<c:otherwise>
			<h2> Aucun évènement du type ${param.typeEvt}  n'est enregistré ! </h2>  

		</c:otherwise>
	</c:choose> --%>

</body>
</html>