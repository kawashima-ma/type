<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
		<title>Welcome</title>
	</head>
	<body>
<div class="cp_navi">
<div id="cp_sidenav" class="sidenav">
	<a href="#" id="home">Home</a>
	<a href="#" id="news">News</a>
	<a href="#" id="contact">Contact</a>
	<a href="#" id="about">About</a>
	<a href="./logout" >ログアウト</a>
</div>
</div>



		<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a>
	</body>
</html>