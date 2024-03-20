<%-- 
    Document   : bookdetails
    Created on : Mar 19, 2024, 11:26:31 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${book.name}</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/bookdetails.css">
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
            <a href="#about">Most liked</a>
            <a href="#services">Filter</a>
            <a href="#like">Liked</a>
        </div>

        <div class="container">
            <div class="row" id="details">
                <div class="col-md-6" id="info">
                    <h1>Mắt biếc</h1>
                    <div class="row">
                        <div class="col-md-6">
                            <img src="img/1.jpg" class="img-fluid" alt="Book Cover">
                        </div>
                        <div class="col-md-6">
                            <table>
                                <tr><td>Author:</td><td>${requestScope.book.author}</td></tr>
                                <tr><td>Genre:</td><td>${requestScope.book.genre}</td></tr>
                                <tr><td>Status:</td><td>${requestScope.book.status}</td></tr>
                                <tr><td>Like:</td><td>${requestScope.book.like}</td></tr>   
                            </table>
                            <div id="start"><a href=""> Đọc từ đầu</a>
                                <a href=""> Đọc mới nhất</a>
                            </div>


                        </div>
                    </div>
                </div>
                <div class="col-md-6" id="description">
                    <h2>
                        Description
                    </h2>
                    <p>Mat Biec is a product voted by many people as the best by writer Nguyen Nhat Anh. This work was also translated into Japanese by translator Kato Sakae to introduce it to Japanese readers.
                        “I send love to summer, but summer can't keep it. Summer only knows flowers, red poinciana flowers in the school yard and the sound of young poinciana flowers in the leaves. Stupid summer, just like me. It is made of what I deposit. He let the Netherlands burn me, burn me. My heart burned into ashes, scattered on the way home."
                    </p> <!-- thay bằng ${book.description}-->
                    <h2>Chapter list</h2>
                    

                </div>
            </div>
        </div>
    </body>
</html>
