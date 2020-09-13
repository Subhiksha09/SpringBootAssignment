<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addBook" method="post">
  
  Library Id:
  <input type="text" name="libraryId">
  <br>
  Library Name:
  <input type="text" name="libraryName">
  <br>
  Book Id:
  <input type="text" name="bookId">
  <br>
  Book Name:
  <input type="text" name="bookName">
  <br>
  Author:
  <input type="text" name="author">
  <br>
  Publisher:
  <input type="text" name="publisher">
  <br>
  
  <input type="submit" value="Add">
  
  </form>
		
</body>
</html>