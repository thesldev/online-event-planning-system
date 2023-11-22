<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
  <style>
    /* Style for the navigation bar */
    .navbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: #333;
      padding: 10px;
      color: #fff;
    }

    /* Style for the navigation links */
    .navbar a {
      text-decoration: none;
      color: #fff;
      margin-right: 10px;
    }
    
    /* Style for the login container */
    .login-container {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-image: url('path/to/your/image.jpg'); /* Replace with your image path */
      background-size: cover;
      background-position: center;
    }
    
    /* Style for the login form */
    .login-form {
      width: 400px;
      padding: 20px;
      border-radius: 5px;
      background-color: #2c2c2c;
      margin: 0 20px; /* Added margin between the login sections */
    }
    
    /* Style for the login form header */
    .login-header {
      text-align: center;
      margin-bottom: 20px;
      color: #fff;
    }
    
    /* Style for the login form buttons */
    .login-button {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      cursor: pointer;
    }
    
    /* Style for the login form buttons hover effect */
    .login-button:hover {
      background-color: #45a049;
    }
    
    /* Style for the login form divider */
    .login-divider {
      width: 2px;
      height: 100px;
      background-color: #555;
      margin: 0 20px;
    }
    
    /* Style for the login form container */
    .login-form-container {
      display: flex;
      align-items: center;
    }
  </style>
</head>
<body>
  <div class="navbar">
    <div>
      <a href="#">Home</a>
      <a href="#">About Us</a>
      <a href="#">Contact Us</a>
    </div>
    <div>
      <!-- Add any other elements or links to the right side of the navbar if needed -->
    </div>
  </div>

  <div class="login-container">
    <div class="login-form-container">
      <div class="login-form">
        <div class="login-header">
          <h2>User Login</h2>
        </div>
        <button type="submit" class="login-button">Login</button>
      </div>
    
      <div class="login-divider"></div>
    
      <div class="login-form">
        <div class="login-header">
          <h2>Seller Login</h2>
        </div>
        <button type="submit" class="login-button" onclick="location.href='loginS.jsp';">Login</button>
      </div>
    </div>
  </div>
</body>
</html>
