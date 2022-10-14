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

</head>

<body>

	<div class="cards">
		<div class="card-single">
			<div>
				<h1>54</h1>
				<span>Customers</span>
			</div>
			<div>
				<span class="las la-users"></span>
			</div>
		</div>

		<div class="card-single">
			<div>
				<h1>79</h1>
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
					<button>
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
								<tr>
									<td>01</td>
									<td>20-06-2022</td>
									<td>10:00</td>
									<td>12:30</td>
									<td>Aeropuerto Internacional Jorge Chavez</td>
									<td>Boeing 777</td>
									<td><span class="status yellow"></span> Programado</td>
								</tr>
								<tr>
									<td>02</td>
									<td>20-06-2022</td>
									<td>06:00</td>
									<td>09:00</td>
									<td>Aeropuerto Internacional Jorge Chavez</td>
									<td>Boeing 777</td>
									<td><span class="status yellow"></span> Programado</td>
								</tr>
								<tr>
									<td>03</td>
									<td>19-06-2022</td>
									<td>19:00</td>
									<td>22:00</td>
									<td>Aeropuerto Internacional Jorge Chavez</td>
									<td>Boeing 777</td>
									<td><span class="status green"></span> Aterrizo</td>
								</tr>
								<tr>
									<td>04</td>
									<td>19-06-2022</td>
									<td>16:00</td>
									<td>18:30</td>
									<td>Aeropuerto Internacional Jorge Chavez</td>
									<td>Boeing 777</td>
									<td><span class="status red"></span> Cancelado</td>
								</tr>
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
					<button>
						See All <span class="las la-arrow-right"></span>
					</button>
				</div>

				<div class="card-body">
					<div class="customer">
						<div class="info">
							<img src="image/GokuleGana.jpg" width="60px" height="60px" alt="">
							<div>
								<h4>Goku le Gana 7u7</h4>
								<small>Ni idea :v</small>
							</div>
						</div>
						<div class="contact">
							<span class="las la-user-circle"></span> <span
								class="las la-comment"></span> <span class="las la-phone"></span>
						</div>
					</div>

					<div class="customer">
						<div class="info">
							<img src="image/GokuDios.jpg" width="60px" height="60px" alt="">
							<div>
								<h4>Goku Sexy</h4>
								<small>Ni idea :v</small>
							</div>
						</div>
						<div class="contact">
							<span class="las la-user-circle"></span> <span
								class="las la-comment"></span> <span class="las la-phone"></span>
						</div>
					</div>

					<div class="customer">
						<div class="info">
							<img src="image/GokuleGana.jpg" width="60px" height="60px" alt="">
							<div>
								<h4>Goku le Gana 7u7</h4>
								<small>Ni idea :v</small>
							</div>
						</div>
						<div class="contact">
							<span class="las la-user-circle"></span> <span
								class="las la-comment"></span> <span class="las la-phone"></span>
						</div>
					</div>

					<div class="customer">
						<div class="info">
							<img src="image/GokuDios.jpg" width="60px" height="60px" alt="">
							<div>
								<h4>Goku le Gana 7u7</h4>
								<small>Ni idea :v</small>
							</div>
						</div>
						<div class="contact">
							<span class="las la-user-circle"></span> <span
								class="las la-comment"></span> <span class="las la-phone"></span>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="Sales">
			<div class="card"></div>
		</div>
	</div>
</body>

</html>