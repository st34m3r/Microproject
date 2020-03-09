<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="style.jsp" %>

</head>
<body>
<center>

<h1>Identifiez Vous !</h1>
<br/>
<br/>
<form action="Inscription" method="POST">
<label for="nom">nom : </label>
<input type="text" placeholder="nom" name="nom"/></br>
<label for="prenom">prénom : </label>
<input type="text" placeholder="prenom" name="prenom"/></br>
<label for="adresse">adresse : </label>
<input type="text" placeholder="adresse" name="adresse"/></br>
<input type="text" placeholder="code" name="code"/>
<input type="text" placeholder="ville" name="ville"/></br>
<label for="email">tel : </label>
<input type="text" placeholder="tel" name="tel"/></br>
<label for="email">email : </label>
<input type="text" placeholder="email" name="email"/></br>
<label for="pass">mot de passe : </label>
<input type="password" name="pass"/></br>
<input type="submit" value="S'inscrire" name="submit"/>
</form>
</center>

</body>
</html>