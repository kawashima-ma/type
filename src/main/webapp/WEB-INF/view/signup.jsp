<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/signup.css" />" rel="stylesheet">
<title>ユーザー登録</title>
</head>
<body>

		<form:form modelAttribute="signupForm" class="form" action="${pageContext.request.contextPath}/signup" method="post">
		<div id="signup">
			<p class="form-title">ユーザー登録</p>
			<div class="error"><form:errors path="*"  /></div>
				<form:label type="login_id"  path="login_id">ログインID</form:label>
				<p class="loginId"><form:input type="login_id" path="login_id" /></p>

				<form:label type="name"  path="name">名前</form:label>
		        <p class="name"><form:input type="name" path="name" /></p>

		        <form:label type="password" path="password">パスワード</form:label>
		        <p class="password"><form:password  path="password" /></p>

		        <p class="submit"><input type="submit" value="登録"></p>

		        <a href="login">戻る</a>
		</div>
		</form:form>
</body>
</html>




