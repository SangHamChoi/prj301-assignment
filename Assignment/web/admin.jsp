<%-- 
    Document   : admin.jsp
    Created on : 19-03-2024, 19:55:02
    Author     : sang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #000;
            overflow: hidden;
            text-align: center;
        }

        .navbar a {
            display: inline-block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        .navbar .logout {
            float: right;
            display: inline-block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        .navbar .logout:hover {
            background-color: #ddd;
            color: black;
        }

        .content {
            padding: 20px;
            text-align: center; /* Căn giữa nội dung */
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="AdminController?action=list">Books</a>
        <a href="AdminController?action=listu">Users</a>
        <a href="#">Comments</a>
        <a href="#" class="logout">Logout</a>
    </div>

    <div class="content">
        <!-- Your content here -->
        <h1>Welcome to the Admin Dashboard ${sessionScope.usersession.userName}</h1>

    </div>
</body>
</html>
