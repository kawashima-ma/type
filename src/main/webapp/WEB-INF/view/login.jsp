<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タイプ診断</title>
</head>
<body>

		<form:form modelAttribute="loginForm" class="form" action="${pageContext.request.contextPath}/login" method="post">
		<div><form:errors path="*"  /></div>
			<form:label path="login_id">ログインID</form:label>
			<div><form:input path="login_id" /></div>
	        <form:label path="password">パスワード</form:label>
	        <div><form:password path="password" /></div>
	        <input type="submit" value="ログイン">
		</form:form>
</body>
</html>