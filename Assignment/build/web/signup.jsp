<%-- 
    Document   : signup.jsp
    Created on : 19-03-2024, 00:38:45
    Author     : sang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>
<head>
    <meta charset="utf-8">
    <title>Sign Up</title>
    <link rel="stylesheet" href="css/login.css">
</head>    
<body>
<div id="flex-sa">
    <!-- content header-->
    <!-- content logo -->
    <div id="logo">
        <a href="home.jsp"><img class="img-full-width" src="img/logo.png"></a>
    </div>
    <!-- Kết thúc content logo -->
    <!-- content search -->
    <div id="search">
        <form>
            <input type="text" placeholder="Search in website">
            <button type="submit">Search</button>
        </form>
    </div>
    <!-- Kết thúc content search -->
</div>
<!-- Kết thúc content header -->

<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) {%>
    <span class="error-message"> <%= error%> </span>
<% }%>

<form action="./signup" method="post" class="signup-form">
    <h2>Sign Up</h2>
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">
    <label for="email">Email:</label>
    <input type="text" id="email" name="email">
    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
    <label for="phone">Phone Number:</label>
    <input type="text" id="phone" name="phone">
    <input type="submit" value="Sign Up">
    <h4>Already have an account?</h4><a href="login.jsp">Log in</a>
</form>

<div class="row lefooter">
    <!--content footer-->
    <div>
        <h3>Contact us</h3>
        <p>Email : duy...@gmail.com</p>
        <p>Phone Number: 0938888888</p>
        <h5>District 5</h5>
    </div>
</div><!--Finish footer-->
</body>
</html>

