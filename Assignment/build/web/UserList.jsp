<%-- 
    Document   : UserList
    Created on : 19-03-2024, 21:51:57
    Author     : sang
--%>

<%@page import="java.util.List"%>
<%@page import="User.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<%@ include file="/menu.jsp" %>
<form action='' method="GET"> 
    <input name="keyword" type="text" value="<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>">
    <input type="submit" value="Search">    
</form><br>
<table>
    <tr>
        <td>User ID</td>
        <td>User Name</td>
        <td>Email</td>
        <td>Phone Number</td>
        <td>Registration Date</td>
        <td>Type</td>
        <td>Account Status</td>
    </tr>
    <%
        List<UserDTO> list = (List<UserDTO>) request.getAttribute("UserList");
        if (list != null) {
            for (UserDTO user : list) {
    %>
    <tr>
        <td><a href="AdminController?action=userDetails&id=<%= user.getUserID()%>"><%= user.getUserID()%></a></td>
        <td><%= user.getUserName()%></td>
        <td><%= user.getEmail()%></td>
        <td><%= user.getPhoneNum()%></td>
        <td><%= user.getRegistrationDate()%></td>
        <td><%= user.getType()%></td>
        <td><%= user.getAccountStatus()%></td>
        <td><a href="AdminController?action=ban&id=<%= user.getUserID()%>">Ban</a></td>

    </tr>
    <% 
            }
        } else {
            // Handle case when UserList is null
            out.println("<tr><td colspan='7'>No users found</td></tr>");
        }
    %>
</table>
</body>
</html>
