<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>login_ui</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets_login/css/Google-Style-Login-.css">
    <link rel="stylesheet" href="assets_login/css/styles.css">
</head>

<body style="margin-top: 0;background: var(--bs-gray-700);">

    <div class="login-card" style="width: 390px;margin-top: 75px;"><img class="profile-img-card" src="assets_login/img/log_in_bg.jpg">
        <p class="profile-name-card"> </p>
        
        
        <form  action="LoginServlet" method="POST"  class="form-signin"><span class="reauth-email"> </span><input class="form-control" type="email" name="email" id="inputEmail" required="" placeholder="Email address" autofocus="">
        <input class="form-control" type="password" name="password" id="inputPassword" required="" placeholder="Password">
            <div class="checkbox">
                <div class="form-check"><input class="form-check-input" type="checkbox" id="formCheck-1"><label class="form-check-label" for="formCheck-1">Remember me</label></div>
            </div><button class="btn btn-primary btn-lg d-block btn-signin w-100" type="submit" onclick="location.href='seller_account_home.jsp';">Sign in</button>
        </form>
        <a class="forgot-password" href="sellerRegister.jsp">Register In here?</a>
    </div>
    
    
    
    
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>