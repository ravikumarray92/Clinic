<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
	<form:form action="addBook.htm" method="POST">
		<label>Book Number</label>
		<form:input path="bookNumber"></form:input>
		<label>International Code</label><form:input path="code.intlCode"/>
		<label>Book Code</label><form:input path="code.bookCode"/>
		<label>Category</label><form:input path="code.category"/>
			<label>Book Name</label>
		<form:select path="subject" items="${subjectCode}"></form:select>
		<form:input path="bookName"></form:input>
		<input type="submit" value="Add">
	</form:form>
</body>
</html>