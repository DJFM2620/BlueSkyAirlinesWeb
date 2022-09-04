<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle</title>
 
 <link rel="stylesheet" href="<c:url value='/chart-style.css'/>">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
</head>

<body>

<%@include file="/WEB-INF/views/Sidebar/Listar.jsp" %>  
         <div class="piecharts">
            <div class="title"> 
                <h2>Reporte General del cliente </h2>
            </div>
			
            <div class="charts">
                <div class="estudiante">
                    <div class="name">
                        <div class="details">
                            <div class="left-n" style="height: 180px; width: 250px;">
                                <p>Nombre:</p>
                                <p>Apellido:</p>
                                <p>Cantidad de Vuelos:   </p>
                                <p> <td>
								<a style="align-content: center;margin: 11px;/* background-color: white; */color: black;" href="<c:url value='/Detalle/${card.clienteid}'/>">Historial de vuelos</a>
								</td></p>
                                
                            </div>
                            
                            <div class="right-n">
                                <p>${Cliente.nombre}</p>
                                <p>${Cliente.apellidoP}</p>
                                <p>${Vuelos}</p>
                            </div>
                        </div>
                    </div>
                </div>
                    <div id="piechart" style="width: 600px; height: 400px; margin: auto;">
                        <div id="favor" style="display: none;">${Cliente.pasaporte}</div>
                        <div id="contra" style="display: none;">${Cliente.celular}</div>
                    </div>
            </div>
        </div>
        
         <
       <script type="text/javascript" src="<c:url value='/chart-script.js'/>"></script>
</body>
</html>