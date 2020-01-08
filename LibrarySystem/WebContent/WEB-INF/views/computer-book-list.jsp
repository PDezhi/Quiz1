<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer Book List</title>
</head>
<body>
	<div align="left">
		Computer book List
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Author</th>
			</tr>

			<c:forEach var="book" items="${computerbookList}">
				<tr>
					<td><c:out value="${book.bookName}"></c:out></td>
					<td><c:out value="${book.bookType}"></c:out></td>
					<td><c:out value="${book.author}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

