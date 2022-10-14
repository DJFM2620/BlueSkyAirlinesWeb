<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Historial de Vuelos</title>

<link rel="stylesheet" href="<c:url value='/CSS/Clientes/HistorialVuelo.css'/>">
<link rel="stylesheet" href="<c:url value='/CSS/Dashboard.css'/>">
</head>
<body>
	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>
	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>
			<div class="grid">
				<div class="cliente">
					<div class="cliente-header">
						<h3>Vuelos del Cliente</h3>
					</div>
					<div class="cliente-body">
						<div class="table">
							<table class="table table-striped table-hover">
								<thead>
									<tr>
										<th>Vuelo ID</th>
										<th>Fecha Ida</th>
										<th>Hora Ida</th>
										<th>Hora Llegada</th>
										<th>Reserva ID</th>
										<th>Fecha Reserva</th>
										<th>AeropuertoID</th>
										<th>Destino</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="card" items="${Vuelos}">
										<tr>
											<td>${card[0]}</td>
											<td>${card[1]}</td>
											<td>${card[2]}</td>
											<td>${card[3]}</td>
											<td>${card[4]}</td>
											<td>${card[5]}</td>
											<td>${card[6]}</td>
											<td>${card[7]}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>