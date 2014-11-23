<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events</title>
<link href="<c:url value="/css/style.css" />" rel="stylesheet">
</head>
<body>
	<form:form commandName="event">
	<form:errors path="*" cssClass="errorblock" element="div"/>
	<label for="textinput1">Enter Minutes:</label>
	<form:input path="name" cssErrorClass="error"/>
	<form:errors path="name" cssClass="error"/>
	<br>
	<input type="submit" class="btn" value="Enter Event"/> 
	</form:form>
</body>
</html>