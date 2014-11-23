<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Attendee</title>
<link href="<c:url value="/css/style.css" />" rel="stylesheet">
</head>
<body>
	<a href="?language=en">English</a>
	<a href="?language=fr">French</a>
	<form:form commandName="attendee">
	<form:errors path="*" cssClass="errorblock" element="div"/>
	<label for="textinput1"><spring:message code="attendee.name"/>:</label>
	<form:input path="name" cssErrorClass="error"/>
	<form:errors path="name" cssClass="error"/>
	<br>
	<label for="textinput2"><spring:message code="attendee.email.address"/>:</label>
	<form:input path="emailAddress" cssErrorClass="error"/>
	<form:errors path="emailAddress" cssClass="error"/>
	<br>
	<label for="textinput3"><spring:message code="attendee.phone"/>:</label>
	<form:input path="phone" cssErrorClass="error"/>
	<form:errors path="phone" cssClass="error"/>
	<br>
	<button type="submit"><spring:message code="attendee.submit"/></button>
	</form:form>
</body>
</html>