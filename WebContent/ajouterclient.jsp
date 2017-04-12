<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,metier.Client"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/style.css" />
<title>Ajouter client</title>
</head>
<body>
<h1>ajouter client</h1>
<form method="post" action="GestionClients"> 
	<!-- <fieldset id="section-1">
				<legend>Informations personnelles</legend>
				<label for="nom">Saisir votre nom :</label>
				<input type="text" name="nom" id="nom"/><br/>
				<label for="prenom">Saisir votre prénom :</label>
				<input type="text" name="prenom" id="prenom"/><br/>
				<label for="mdp">Saisir votre Adresse :</label>
				<input type="text" name="adresse" id="adresse"/><br/>			
				<label for="">Saisir Code Postal :</label>
				<input type="text" name="codePostal" id="codePostal"/><br/>
				<label for="age">Saisir votre ville :</label>
				<input type="text" name="ville" id="ville"/><br/>		
				<label for="age">Saisir votre téléphone :</label>
				<input type="text" name="telephone" id="telephone"/><br/>
				</fieldset>
	<c:set target="${client}" property="nom" value="${client.nom}" />
 	<c:set target="${client}" property="prenom" value="${client.prenom}" />
	<c:set target="${client}" property="adresse" value="${client.ville}" />
	<c:set target="${client}" property="codePostal" value="${client.codepostal}" />
	<c:set target="${client}" property="ville" value="${client.ville}" />
	<c:set target="${client}" property="telephone" value="${client.telephone}" />
	 <input type="submit" value="valider"/> -->
	
</body>
</html>