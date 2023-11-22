<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="asserts_navbar/navbar.css">
</head>
<body>
	<nav class="navbar">
		<div class="navbar-logo">
			<img src="your-logo.png" alt="Logo">
		</div>
		<nav class="navbar">
		<div class="navbar-logo">
			<img src="./images/logo.png" height = 50px alt="Logo">
		</div>
		<div class="navbar-menu">
			<a href="seller_account_home.jsp">Home</a>
			<a href="AddService.jsp">Add Service</a>
            <a href="ActivatedServices.jsp">Activated Services</a>
			<div class="navbar-dropdown">
				<a href="#">Orders</a>
				<div class="navbar-dropdown-content">
					<a href="#">Complete Orders</a>
					<a href="#">Pending Orders</a>
					<a href="#">Cancel Orders</a>
				</div>
			</div>
		</div>
		<div class="navbar-buttons">
			<button onclick="location.href='seller_profile.jsp';">Profile</button>
			<button onclick="location.href='loginS.jsp';">Log out</button>
		</div>
	</nav>
	</nav>
</body>
</html>