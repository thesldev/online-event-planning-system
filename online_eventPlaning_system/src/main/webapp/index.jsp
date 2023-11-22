<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Dreamy Events</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/Style.css" />
	<link rel="preconnect" href="https://fonts.googleapis.com">
  	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  	<link href="https://fonts.googleapis.com/css2?family=Cormorant+Garamond:ital,wght@1,700&family=Lobster+Two&family=Oswald:wght@300&display=swap" rel="stylesheet">
  	<link rel="shortcut icon" href="images/favicon.ico" />
</head>
  
  <body>
    <header>
      <img src="${pageContext.request.contextPath}/images/logo2.png" alt="description of your image" width="100px" height="100px">
      <h1>Dreamy Events</h1>
      <ul class="nav-menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="loggingPage.jsp">Login</a></li>
        <li><a href="#">Feedback</a></li>
      </ul>
    </header>
    

    <img src="${pageContext.request.contextPath}/images/bac11.png" alt="background  image" width="100%" height="800px">
    
   


    <section class = "s1">
    
    <h1 class="h">Transforming <br>your ideas into reality<br> with our expertise.</h1>
    
   	<form action="homeServlet" method="post">
	<button class="add-button1" type="submit" name="bookbutton">Book Now</button>
	
	
    <button class="add-button2">Contact Us</button>
    </form>

    <h3 class="h31">Events we are planning</h3>

    </section>

    <section class="section2">
      <section class="section3">
          <img class="im1" src="images/typ1.png" alt="description of your image" width="100%" height="200px">
          <h2 class="hh4">Weddings</h2>
      </section>

      <section class="section4">
        <img class="im2" src="images/typ4.png" alt="description of your image" width="85%" height="170px">
        <h2 class="hh7">Sports events</h2>
      </section>

        <section class="section5">
          <img class="im3" src="images/typ5.png" alt="description of your image" width="60%" height="140px">
          <h2 class="hh6">Educational events</h2>
        </section>

        <section class="section6">
          <img class="im2" src="images/typ2.png" alt="description of your image" width="60%" height="150px">
          <h2 class="hh4">Social events</h2>
      </section>

      <section class="section7">
        <img class="im2" src="images/typ6.png" alt="description of your image" width="60%" height="150px">
        <h2 class="hh5">Political events</h2>
      </section>

        <section class="section8">
          <img class="im2" src="images/typ3.png" alt="description of your image" width="60%" height="150px">
          <h2 class="hh6">Cultural events</h2>
        </section>
      </section>


  </body>
</html>