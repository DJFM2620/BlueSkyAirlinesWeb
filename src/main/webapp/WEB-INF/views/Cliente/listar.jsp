<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado Cliente</title>
 <link rel="stylesheet" href="<c:url value='/chart-style.css'/>">

 
 <style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

table.center {
  margin-left: auto; 
  margin-right: auto;
}
</style>
 

</head>
<body>
<%@include file="/WEB-INF/views/Sidebar/onlysidebar.jsp" %>  

<h1 style="
    margin-top: 300px;
    /* align-content: center; */
    text-align: center;
"> Lista de Clientes</h1>

<table class="center" style="
    margin: 120px;
">
	<thead>
	<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Apellido Paterno</th>
				<th>Apellido Materno</th>
				<th>celular</th>
				<th>Email</th>
				<th>Pasaporte</th>
				<th>Opcion</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="card" items="${bCliente}">
	<tr>
	<td>${card.clienteid}</td>
	<td>${card.nombre}</td>
	<td>${card.apellidoP}</td>
	<td>${card.apellidoM}</td>
	<td>${card.celular}</td>
	<td>${card.email}</td>
	<td>${card.pasaporte}</td>
	
	<td>
	<a href="<c:url value='/Detalle/${card.clienteid}'/>">Detalle</a>
	</td>
	</tr>
	</c:forEach>
	
		
	</tbody>
</table>


</body>
</html>