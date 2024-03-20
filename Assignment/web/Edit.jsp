<%-- 
    Document   : Edit
    Created on : 20-03-2024, 01:08:16
    Author     : sang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Book</title>
</head>
<body>
    <jsp:include page="/menu.jsp" flush="true" /> 
    <h1>Edit Book</h1>
 
   
    
    <form action="AdminController" method="POST">
        <table>
            <tr>
                <td>Book ID</td>
                <td><input name="id" value="${requestScope.book.bookID}" ></td>
            </tr>
            <tr>
                <td>Title</td>
                <td><input name="title" value="${requestScope.book.title}"></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input name="author" value="${requestScope.book.author}"></td>
            </tr>
            <tr>
                <td>Cover Image</td>
                <td><input name="coverImage" value="${requestScope.book.coverImage}"></td>
            </tr>
            <tr>
                <td>Genre</td>
                <td><input name="genre" value="${requestScope.book.genre}"></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input name="description" value="${requestScope.book.descriptions}"></td>
            </tr>
            <tr>
                <td>Chapter</td>
                <td><input name="chapter" value="${requestScope.book.chapter}"></td>
            </tr>
            <tr>
                <td>Liked</td>
                <td><input name="liked" value="${requestScope.book.liked}"></td>
            </tr>
            <tr>
                <td>Status</td>
                <td><input name="status" value="${requestScope.book.status}"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="hidden" name="action" value="${requestScope.nextAction}">
                    <input type="submit" value="Save">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>

