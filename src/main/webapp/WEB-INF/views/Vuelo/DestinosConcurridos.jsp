<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="<c:url value='/CSS/Vuelos/DestinosConcurridos.css'/>">
<link rel="stylesheet" href="<c:url value='/CSS/Dashboard.css'/>">

<title>Destinos mas Concurridos</title>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
	google.charts.load('current', {packages: ['corechart', 'bar']});
	google.charts.setOnLoadCallback(drawChart);

	function VuelosCiudad(CiudadId){

		<c:url var="path" value="/Vuelos"/>
		location.href="${path}/Ciudad/"+CiudadId;			
	}
	
	function VueloPorId(VueloId){
		
		<c:url var="path" value="/Vuelos"/>
		location.href="${path}/Id/"+VueloId;
	}
	
	function drawChart(){
		
		var data = google.visualization.arrayToDataTable([
			['Titulo', 'Cantidad'],
			<c:forEach items='${Destinos}' var='entry'> 
			[ '${entry[1]}', ${entry[0]} ],
			</c:forEach >
		]);
		
		var options = {
			
			title: 'Destinos mas concurridos del mes y año seleccionado',
			hAxis: {
				
				title: 'Destinos'
			},
			vAxis: {
				
				title: 'Cantidad de Vuelos'
			}
		};
		
		var chart = new google.visualization.ColumnChart(document.getElementById('column_chart_id'));
		chart.draw(data, options);
	}
	
	function FiltrarMesAño(){
		
		var Mes = document.getElementById("options_mes").value;
		var Año = document.getElementById("options_año").value;
		
		<c:url var="path" value="/Vuelos"/>
			location.href="${path}/DestinosConcurridos/"+Año+"/"+Mes;	
	}
</script>

</head>
<body>

	<%@include file="/WEB-INF/views/Sidebar/Sidebar.jsp"%>

	<div class="main-content">
		<%@include file="/WEB-INF/views/Sidebar/Header.jsp"%>
		<main>
			<div class="grid">
				<div class="column_chart" id="column_chart_id"></div>
				<div class="options">
					<select id="options_mes">
						<option id="1" value="1">Enero</option>
						<option id="2" value="2">Febrero</option>
						<option id="3" value="3">Marzo</option>
						<option id="4" value="4">Abril</option>
						<option id="5" value="5">Mayo</option>
						<option id="6" value="6">Junio</option>
						<option id="7" value="7">Julio</option>
						<option id="8" value="8">Agosto</option>
						<option id="9" value="9">Setiembre</option>
						<option id="10" value="10">Octubre</option>
						<option id="11" value="11">Noviembre</option>
						<option id="12" value="12">Diciembre</option>	
					</select>
					<select id="options_año">
						<c:forEach items='${Años}' var='año'>
							<option id="${año}" value="${año}">${año}</option>
						</c:forEach>
					</select>
					<button onclick="FiltrarMesAño()">Buscar</button>
				</div>
			</div>
		</main>
	</div>

	<script type="text/javascript"
		src="<c:url value='CSS/Vuelos/Listar.js'/>"></script>
</body>
</html>









