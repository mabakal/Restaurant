<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produit</title>

</head>
<body>
  
  	<jsp:include page="/Jsp/entete.html"></jsp:include>
     
     <h2>Entrer les information sur le produit</h2> 
     <div>
     		<img alt="" src='<c:out value="${requestScope.image}"></c:out>'>
     		<span><c:out value="${requestScope.prix}"></c:out></span>
     </div> 
     <form action="/servelet/commande.java" method = "post">
     		<label>Recette</label>
     		<input type = "text" name = "nom" value ='<c:out value="${requestScope.designation}"></c:out>'> <br>
     		<label>Type de Commande</label>
     		<input type = "text" name = "mode"><br>
     		<label>Localisation</label>
     		<select name = "localisation">
     		 	<option value = "Taqqadum">Taqqadum</option>
     		 	<option value = "Atlas">Atlas</option>
     		 	<option value = "Massera 1">Massera 1</option>
     		 	<option value = "Mghila">Mghila</option>	
     		</select>
     
     </form>
       
</body>
</html>