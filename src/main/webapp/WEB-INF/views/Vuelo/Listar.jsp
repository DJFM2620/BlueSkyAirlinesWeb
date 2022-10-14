<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value='/CSS/Vuelos/Listar.css'/>">
<link rel="stylesheet" href="<c:url value='/CSS/Dashboard.css'/>">

<title>Lista de Vuelos</title>
</head>
<body>

	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>

	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>		
			<div class="options">
				<div class="card-destinos" onclick="ToDestinosConcurridos()">
				<div>
					<h1>Destinos Concurridos</h1>
				</div>
				<div>
					<span class="las la-users"></span>
				</div>
		</div>
			</div>
			<div class="grid">
				<div class="vuelo">
					<div class="vuelo-header">
						<h3>Vuelos</h3>
					</div>
					<div class="vuelo-body">
						<div class="table">
							<table class="table table-striped table-hover">
								<thead>
									<tr>
										<th>Vuelo ID</th>
										<th>Fecha Ida</th>
										<th>Hora Ida</th>
										<th>Hora Llegada</th>
										<th>Aeropuerto</th>
										<th>Avion ID</th>
										<th>Estado</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="card" items="${Vuelos}">
										<tr>
											<td>${card.vueloid}</td>
											<td>${card.fechaida}</td>
											<td>${card.horaida}</td>
											<td>${card.horallegada}</td>
											<td>${card.aeropuerto.nombre}</td>
											<td>${card.avion.avionid}</td>
											<td>${card.estado.nombre}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="filter">
					<div class="from_to">
						<h4>Options</h4>
						<button>From</button><button>To</button>
						<button>Today</button><input type="date">
					</div>
					<div class="cities">
						<div>
							<input type="text" onkeyup="search_ciudad()" placeholder="Ingresa la ciudad a buscar" class="search_city" id="search_city">
						</div>
						<div>
							<c:forEach var="card" items="${Ciudades}">
								<button class="ciudad" onclick="VuelosCiudad(${card.ciudadid})" id="${card.ciudadid}">${card.nombre}</button><br>
							</c:forEach>
						</div>
					</div>
					<div class="search_advanced">
						<div class="search_by_id">
							<input type="text" placeholder="Ingresa el Codigo del Vuelo" id="flightId">
							<button onclick="VueloPorId(flightId.value)">Buscar</button>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>
	
	<script type="text/javascript" src="<c:url value='CSS/Vuelos/Listar.js'/>"></script>
	<script type="text/javascript">
		function VuelosCiudad(CiudadId){
	
			<c:url var="path" value="/Vuelos"/>
			location.href="${path}/Ciudad/"+CiudadId;			
		}
		
		function VueloPorId(VueloId){
			
			<c:url var="path" value="/Vuelos"/>
			location.href="${path}/Id/"+VueloId;
		}
		
		function ToDestinosConcurridos(){
			
			<c:url var="path" value="/Vuelos"/>
			location.href="${path}/DestinosConcurridos";
		}
	</script>
</body>
</html>