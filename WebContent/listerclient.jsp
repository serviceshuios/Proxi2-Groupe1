<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,metier.Client"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/style.css" />
<title>Liste des Clients</title>
</head>
<body>

	<div id="content">
	<div class="block">
	<h2>Lister les clients</h2>
	<c:if test="${!empty client }"> 
		<table>
			<tr>
				<th>ID</th>
				<th>NOM</th>
				<th>PRENOM</th>
				<th>ADRESSE</th>
				<th>CODE POSTAL</th>
				<th>TELEPHONE</th>
			</tr>
		<c:forEach var="c" items="${client}">
			<tr>
				<td><c:out value="${c.idclient}"></c:out></td>
				<td><c:out value="${c.nom}"></c:out></td>
				<td><c:out value="${c.prenom}"></c:out></td>
				<td><c:out value="${c.adresse}"></c:out></td>
				<td><c:out value="${c.codePostal}"></c:out></td>
				<td><c:out value="${c.telephone}"></c:out></td>
			</tr>
		</c:forEach>
		</table>
	</c:if>
	</div>
	</div>
</body>
</html>