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
	<!-- YOUR own local CSS -->
	<!-- 	<link rel="stylesheet" href="/css/my_style.css"/> -->
	<!-- For any Bootstrap that uses JS or jQuery-->
	<!-- 	<script src="/webjars/jquery/jquery.min.js"></script> -->
	<!-- 	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script> -->
	<!-- YOUR own local JS -->
	<!-- 	<script src="/js/my_script.js"></script> -->
	
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${book.title}"/>
		</h1>
		<p>Description: 
			<c:out value="${book.description}"></c:out>
		</p>
		<p>Language: 
			<c:out value="${book.language}"></c:out>
		</p>
		<p># of pages: 
			<c:out value="${book.numberOfPages}"></c:out>
		</p>
		
		<a href="/books/${book.id}/edit">Edit</a>
		
		<form action="/books/${book.id}" method="post">
			<input type="hidden" name="_method" value="delete">
			<input type="submit" value="Delete">
		</form>
	</div>
	 
</body>
</html>