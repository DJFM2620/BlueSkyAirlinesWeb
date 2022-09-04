<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	 <link rel="stylesheet" href="<c:url value='/Listado.css'/>">
	<link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">

<title>Insert title here</title>
</head>
<body>
<input type="checkbox" id="nav-toggle">
	<div class="sidebar">
		<div class="sidebar-brand">
			<h2>
				<span class="lab la-accusoft"></span>
				<span>BlueSkyAirlines</span>
			</h2>
		</div>

		<div class="sidebar-menu">
			<ul>
				<li><a href="#" class="active"><span class="las la-igloo"></span><span>Dashboard</span></a>
				</li>
				<li><a onclick="location.href='<c:url value='/Clientes'/>'"><span class="las la-users"></span><span>Customers</span></a>
				</li>
				<li><a href="#"><span class="las la-clipboard-list"></span><span>Flights</span></a>
				</li>
				<li><a href="#"><span class="las la-shopping-bag"></span><span>Sales</span></a>
				</li>
				<li><a href="#"><span class="las la-user-circle"></span><span>User</span></a>
				</li>
				<li><a href="#"><span class="las la-receipt"></span><span>LogOut</span></a>
				</li>
			</ul>
		</div>
	</div>
	<div class="main-content">
		<header>
			<h2>
				<label for="nav-toggle"> <span class="las la-bars"></span>
				</label> Dashboard
			</h2>

			<div class="search-wrapper">
				<span class="las la-search"></span> <input type="search"
					placeholder="Search here" />
			</div>

			<div class="user-wrapper">
				<img src="image/GokuDios.jpg" width="60px" height="60px" alt="" />
				<div>
					<h4>Goku le Gana 7u7</h4>
					<small>Super Admin :v</small>
				</div>
			</div>
		</header>


</body>
</html>