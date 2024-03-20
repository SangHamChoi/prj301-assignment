<%-- 
    Document   : login
    Created on : 18-03-2024, 23:23:12
    Author     : sang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>
    <head>
        <meta charset="utf-8">
        <title>Login</title>
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
        <h3> <%= error%> </h3>
        <% }%>
        <form action="./login" method="post">
            <h2>Login </h2>
            <label for="username">Username:</label>
            <input type="text" id="username" name="user"> <!-- Thay đổi name thành "user" -->
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
            <input type="submit" value="Login">
            <h4>Doesn't have an account?</h4><a href="signup.jsp">Sign up</a>
        </form>

        <div class="row lefooter"> <!--content footer-->

            <div>
                <h3>Contact us</h3>
                <p>Email : duy...@gmail.com</p>
                <p>Phone Number: 0938888888</p>
                <h5>District 5</h5>
            </div>

        </div><!--Finish footer-->
    </body>
</html>
