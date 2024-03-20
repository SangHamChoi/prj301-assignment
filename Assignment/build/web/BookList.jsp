<%-- 
    Document   : BookList
    Created on : 19-03-2024, 21:51:57
    Author     : sang
--%>

<%@page import="java.util.List"%>
<%@page import="Books.BookDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books List</title>
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
        img {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
    </head>
    <body>
        <%@ include file="/menu.jsp" %>
        <form action='' method="GET"> 
            <input name="keyword" type="text" value="<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>">
            <input type="submit" value="Search">    
        </form><br>
        <form action="AdminController" method="POST">
                        <input name="action" value="add" type="hidden">
                        <input type="submit" value="Add Book">
        </form><br>
        <table>
            <tr>
                <td>Book ID</td>
                <td>Title</td>
                <td>Author</td>
                <td>Cover Image</td>
                <td>Genre</td>
                <td>Descriptions</td>
                <td>Chapter</td>
                <td>Status</td>
                <td>Liked</td>
                
            </tr>
            <%
                List<BookDTO> list = (List<BookDTO>) request.getAttribute("BooksList");
                if (list != null) {
                    for (BookDTO book : list) {
            %>
            <tr>
                <td><a href="AdminController?action=details&id=<%= book.getBookID()%>"><%= book.getBookID()%></a></td>
                <td><%= book.getTitle()%></td>
                <td><%= book.getAuthor()%></td>
                <td><img src="<%= book.getCoverImage()%>" width="100" height="150"></td>
                <td><%= book.getGenre()%></td>
                <td><%= book.getDescriptions()%></td>
                <td><%= book.getChapter()%></td>
                <td><%= book.getStatus()%></td>
                <td><%= book.getLiked()%></td>
            </tr>
            <% 
                    }
                } else {
                    // Handle case when BooksList is null
                    out.println("<tr><td colspan='9'>No books found</td></tr>");
                }
            %>
              
        </table>
    </body>
</html>
