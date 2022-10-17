<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link rel="stylesheet"
	href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">

<title>Inicio</title>

<style type="text/css">
.sidebar-menu a.active_dashboard {
	background: #FFFFFF;
	color: #085DEF;
	padding-top: 1rem;
	padding-bottom: 1rem;
	border-radius: 30px 0px 0px 30px;
}
</style>

</head>

<body>

	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>
	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>
			<div class="cards">
				<div class="card-single">
					<div>
						<h1>${CantidadCli}</h1>
						<span>Customers</span>
					</div>
					<div>
						<span class="las la-users"></span>
					</div>
				</div>

				<div class="card-single">
					<div>
						<h1>${CantidadVue}</h1>
						<span>Flights</span>
					</div>
					<div>
						<span class="las la-clipboard-list"></span>
					</div>
				</div>

				<div class="card-single">
					<div>
						<h1>S/1240.2</h1>
						<span>Sales</span>
					</div>
					<div>
						<span class="lab la-google-wallet"></span>
					</div>
				</div>
			</div>

			<div class="recent-grid">
				<div class="Flights">
					<div class="card">
						<div class="card-header">
							<h3>Recent Flight</h3>
							<button onclick="location.href='/idat/Vuelos';">
								See All <span class="las la-arrow-right"></span>
							</button>
						</div>

						<div class="card-body">
							<div class="table-responsive">
								<table>
									<thead>
										<tr>
											<td>VueloID</td>
											<td>FechaIda</td>
											<td>HoraIda</td>
											<td>HoraLlegada</td>
											<td>Aeropuerto</td>
											<td>Avion</td>
											<td>Estado</td>
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
				</div>

				<div class="Customers">
					<div class="card">
						<div class="card-header">
							<h3>New Customer</h3>
							<button onclick="location.href='/idat/Clientes';">
								See All <span class="las la-arrow-right"></span>
							</button>
						</div>

						<div class="card-body">
							<c:forEach var="cli" items="${Clientes}">
								<div class="customer">
									<div class="info">
										<img src="image/GokuleGana.jpg" width="60px" height="60px"
											alt="">
										<div>
											<h4>${cli.nombre}</h4>
											<small>${cli.apellidoP} ${cli.apellidoM}</small>
										</div>
									</div>
									<div class="contact">
										<span class="las la-user-circle"></span> <span
											class="las la-comment"></span> <span class="las la-phone"></span>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>

				<div class="Sales">
					<div class="card"></div>
				</div>
			</div>
		</main>
	</div>

</body>

</html>