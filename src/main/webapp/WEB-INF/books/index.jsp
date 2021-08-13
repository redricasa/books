<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	
</head>
<body>
	<div class="container">
		<h1>All Books</h1>
		<table>
			<thead>
				<tr>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="b">
				<tr>
					<td><c:out value="${b.title}" /></td>
					<td><c:out value="${b.description}" /></td>
					<td><c:out value="${b.language}" /></td>
					<td><c:out value="${b.numberOfPages}" /></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/books/new">New Book</a>
	</div>
</body>
</html>