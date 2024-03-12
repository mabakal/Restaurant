<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "s" %>
<%@page import = "baseDeDonnees.*" import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
    <jsp:include page="/Jsp/entete.html"></jsp:include>
       
       <h2>Voici nos produit, parcourez et choisiser vos gout</h2>
      	<c:set var = "table" value = "Produit" scope = "request"></c:set>
      	
      	<c:set var = "produit" value = "${BasseDeDonnees.afficher(table)}"  scope = "page"></c:set>  
      	
       <div>
         		<c:forEach var = "produit" items = "${produit.rows}">
                    <div>
                    	<c:set var = "prix" value = "${row.prix_produit}" scope = "request"></c:set>
                    	<c:set var = "designation" value = "${row.nom}" scope = "request"></c:set>
                    	<c:set var = "image" value="${row.image_}" scope = "request" ></c:set>
                    	<img alt="" src ='<c:out value="${row.image_}"></c:out>'>
                    	<p><c:out value="${row.prix_produit}"></c:out></p>
                    	<button onclick ='<jsp:forward page="/Jsp/produit.jsp" ></jsp:forward>'>Commander</button>
                    </div> 
                </c:forEach>
       </div>
                     
</body>
</html>