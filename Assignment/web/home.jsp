<%-- 
    Document   : home
    Created on : Mar 19, 2024, 7:19:36 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>23H59P Comic website</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/home.css">
    </head>
    <body>
        <!-- content header-->
        <div id="flex-sa" class="row">

            <!-- content logo -->
            <div id="logo" class="col-md-3">
                <a href="home.jsp"><img class="img-full-width" src="img/logo.png"></a>
            </div>
            <!-- Kết thúc content logo -->

            <!-- content search -->
            <div id="search" class="col-md-6">
                
                <form>
                    
                    <input type="text" placeholder="Search in website">
                    <button type="submit">Search</button>
                </form>
            </div>
            <!-- content login/signup -->
            <div id="login" class="col-md-3">
                <form>
                    <% if (session.getAttribute("loggedIn") != null && (boolean) session.getAttribute("loggedIn")) { %>
                    <a href="LogoutServlet">Logout</a>
                    <% } else { %>
                    <a href="login.jsp">Login</a> 
                    <a href="signup.jsp">Signup</a>
                    <% }%>
                </form>
            </div>

        </div>

        <div class="navbar">
            <a href="home.jsp">Home</a>
            <a href="#about">Hot</a>
            <a href="#services">Filter</a>
            <a href="#like">Liked</a>
        </div>

        <div class="container">

            <div class="row" id="new1">
                <div>
                    <h1> NEW COMICS</h1>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 1</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 2</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 3</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 4</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
            </div>
            <div class="row" id="new2">

                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 5</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 6</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 7</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
                <div class="col-md-3">
                    <img src="img/1.jpg"  alt="Truyen 1">
                    <a href="BookController?action=details&id=${book.id}"><h3>Tên truyện 8</h3></a>
                    <p>Liked: ${book.like}</p>
                </div>
            </div>

        </div>
        <div class="row lefooter"> <!--content footer-->

            <div>
                <h3>Contact us</h3>
                <p>Email : duy...@gmail.com</p>
                <p>Phone Number: 0938888888</p>
                <h5>District 5</h5>
            </div>

        </div>
    </body>
</html>
