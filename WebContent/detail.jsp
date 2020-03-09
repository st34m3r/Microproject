<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>detail de l'article</title>
<%@ include file="style.jsp" %>

</head>
<body>
<center><h1>detail de l'article</h1>

<table style="width:100%">

  <tr>
    <td><img src=""/></td>
    <td><input type="text" name="year" /></td>
  </tr>
  <tr>
 	<td> <label>référence :</label>
    <input type="text" name="year" /></td>
    <td><label>titre :</label>
  	<input type="text" name="year" />
  	</td>
  </tr>
  <tr>
 	<td> <label>auteur :</label>
    <input type="text" name="auteur" /></td>
    <td><label>editeur :</label>
  	<input type="text" name="editeur" />
  	</td>
  </tr>
    <tr>
 	<td> <label>quantité en stock :</label>
    <input type="text" name="quantite" /></td>
    <td><label>pour le prix modique de  :</label>
  	<input type="text" name="prix" />
  	</td>
  </tr>
   </tr>
  <tr>
 	<td><a href="catalogue.jsp">retour</a> 
 	 </td>
 	 <td>
 	  <a href="panier">ajouter au panier</a>
 	 </td>
  </tr>
 
  
</table>
<br/>


</center>

</body>
</html>