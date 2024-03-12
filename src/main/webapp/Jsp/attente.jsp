<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "s" %>
<%@page import = "baseDeDonnees.*" import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attente</title>
</head>
<body>
	<c:set var = "commander" value = "${requestScope.commande}"></c:set>
	<c:choose>
	  <c:when test="${commander == true}">
	  		<img alt="" src ='<c:out value="${requestScope.image}"></c:out>'>
			<p>
				Nous procedons votre commande, patiente vous le recevrez dans quelque instant.
			</p>
			<button onclick ='<jsp:forward page="/Jsp/annuler.jsp"></jsp:forward>'>Annuler votre Commande</button>
	  </c:when>
	  <c:otherwise>
	  		<p>Nous ne pouvons pas proceder votre commande, reesaye</p>
	  		<button onclick ='<jsp:forward page="/Jsp/menu.jsp"></jsp:forward>'>Reesayer</button>
	  </c:otherwise>
	</c:choose>
	
</body>
</html>