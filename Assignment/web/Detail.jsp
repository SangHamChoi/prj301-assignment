<%-- 
    Document   : Detail
    Created on : 20-03-2024, 00:00:03
    Author     : sang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Details</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" flush="true" />

        <h1>Book Details</h1>

        <table>
            <tr><td>Book ID</td><td>${requestScope.book.bookID}</td></tr>
            <tr><td>Title</td><td>${requestScope.book.title}</td></tr>
            <tr><td>Author</td><td>${requestScope.book.author}</td></tr>
            <tr><td>Cover Image</td><td><img src="${requestScope.book.coverImage}" alt="Book Cover" width="100" height="150"></td></tr>
            <tr><td>Genre</td><td>${requestScope.book.genre}</td></tr>
            <tr><td>Description</td><td>${requestScope.book.descriptions}</td></tr>
            <tr><td>Chapter</td><td>${requestScope.book.chapter}</td></tr>
            <tr><td>Liked</td><td>${requestScope.book.liked}</td></tr>
            <tr><td>Status</td><td>${requestScope.book.status}</td></tr>
        </table>

        

        <form action="AdminController?action=edit" method="post">
            <input type="hidden" name="id" value="${requestScope.book.bookID}">
            <input type="hidden" name="action" value="edit">
            <input type="submit" value="Edit">
        </form>
    </body>
</html>

