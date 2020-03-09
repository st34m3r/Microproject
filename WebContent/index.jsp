<%@  page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="beans.Client"%>
<!DOCTYPE html>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="style.jsp" %>

</head>
<body>
<center>

<c:if test="${empty client}">
<h1>Bienvenue chez SBO - veuillez identifier ou se connecter</h1>
<br/>
<br/>
<a href="identifier.jsp">Déja client : Identifiez vous !</a>
<br/>
<br/>
<a href="inscrire.jsp">Nouveau client : inscrivez vous !</a>
</c:if>
<c:if test="${!empty client}">

<h1> bonjour Monsieur ${client.nom}  ${client.prenom} !</h1> 

<a href="catalogue.jsp">Consulter le catalogue</a><br/>
<a href="#">suivre vos commande </a><br/>
<a href="#">visualiser votre panier</a><br/>

</c:if>

</center>
</body>
</html>