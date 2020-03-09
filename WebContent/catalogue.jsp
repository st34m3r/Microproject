<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalogue</title>
<%@ include file="style.jsp" %>

</head>
<body>
<center>
<h1><label>Choisissez le genre : </label></h1>
<br/>
<select id="catalogue" name="catalogue" form="catalogue">
  <option value="firstvalue">value1</option>  
</select>
<br/>
<br/>

<table style="width:100%">
  <tr>
    <th>Reference</th>
    <th>titre</th> 
    <th>auteur</th>
    <th>photo</th>
    <th>prix</th>
  </tr>
  <tr>
    <td>value</td>
	<td>value</td>
	<td>value</td>
	<td>value</td>
	<td>value</td>
  </tr>
</table>
</center>
</body>
</html>