<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="CSS/Clientes/Listar.css" />

<title>Clientes</title>

</head>
<body>
	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>

	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>
			<div class="grid">
				<div class="cliente">
					<div class="cliente-header">
						<h3>Clientes</h3>
					</div>
					<div class="cliente-body">
						<div class="table">
							<table class="table table-striped table-hover">
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

											<td><a
												href="<c:url value='/Detalle/${card.clienteid}'/>"><span
													class="las la-info-circle"></span> </a> <a
												href="<c:url value='/Detalle/${card.clienteid}'/>"><span
													class="las la-trash-alt"></span> </a> <a
												href="<c:url value='/Detalle/${card.clienteid}'/>"><span
													class="las la-pencil-alt"></span> </a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div>
					<button onclick="location.href='/idat/RegistrarCliente';">Registrar</button>
				</div>
			</div>
		</main>
	</div>
</body>
</html>