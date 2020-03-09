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

<form action="Authentification" method="POST">

<label for="email">email : </label>
<input type="text" placeholder="email" name="email"/>
<br/>
<br/>
<br/>
<label for="pass">mot de passe : </label>
<input type="password" name="pass"/>
<input type="submit" value="OK" name="submit"/>

</form>


</center>

</body>
</html>