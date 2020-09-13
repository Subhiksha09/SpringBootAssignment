<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p style="color:blue ;" > Add Book </p>

<form action = "addbook" method = "post">

      Library Id: 
      <input type = "text" name = "LibraryId" >
      <br>
      Library Name:
      <input type = "text" name = "LibraryName">
      <br>
      Book Id:
      <input type = "text" name = "BookId">
      <br>
      Book Name:
      <input type = "text" name = "BookName">
      <br>
      Publisher:
      <input type = "text" name = "Publisher">
      <br>

      <input type="submit" value="Add Book">
      
      
      </form>

</body>
</html>