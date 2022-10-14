<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
			<%@include file="/WEB-INF/views/Sidebar/MainContent.jsp"%>
		</main>
	</div>

</body>

</html>