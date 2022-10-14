<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle</title>

<link rel="stylesheet" href="<c:url value='/CSS/Clientes/Detalle.css'/>">
<link rel="stylesheet" href="<c:url value='/CSS/Dashboard.css'/>">


<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>

<script>
	google.charts.load('current', { 'packages': ['corechart'] });
	google.charts.setOnLoadCallback(drawChart);
	
	function drawChart() {

		var data = google.visualization.arrayToDataTable([
			['Titulo', 'Cantidad'],

			<c:forEach items='${dataPieList}' var='entry'> 
			[ '${entry[1]}', ${entry[0]} ], 
			</c:forEach >	
		]);

		var options = {
			pieStartAngle: 100,
			title: 'Destinos recurrentes',
			backgroundColor: "transparent",
			titleTextStyle: {
				color: "#000",
				bold: true
			}
		};
		var chart = new google.visualization.PieChart(document.getElementById('piechart'));

		chart.draw(data, options);
	}
	</script>

</head>

<body>

	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>
	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>
			<div class="piecharts">
				<div class="title">
					<h2>Reporte General del cliente</h2>
				</div>

				<div class="charts">
					<div class="cliente">
						<div class="cliente-card">
							<div class="details">
								<div class="left-n" style="height: 180px; width: 250px;">
									<p>Nombre:</p>
									<p>Apellido:</p>
									<p>Cantidad de Vuelos:</p>
									<p>
										<a style="align-content: center; margin: 11px; color: black;"
											href="<c:url value='/HistorialVuelos/${Cliente.clienteid}'/>">Historial
											de vuelos </a>
									</p>

								</div>

								<div class="right-n">
									<p>${Cliente.nombre}</p>
									<p>${Cliente.apellidoP}</p>
									<p>${Vuelos}</p>
								</div>
							</div>
						</div>
					</div>
					<div id="piechart"
						style="width: 600px; height: 400px; margin: auto;"></div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>