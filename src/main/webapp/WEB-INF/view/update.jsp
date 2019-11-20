<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/update.css" />" rel="stylesheet">
<title>ユーザー情報変更</title>
</head>
<body>
		<form:form modelAttribute="updateForm" class="form" action="${pageContext.request.contextPath}/update" method="post">
		<div id="update">
			<p class="form-title">ユーザー編集</p>


			<div class="error"><form:errors path="login_id"  />
			<div><form:errors path="name"/></div>
			<div><form:errors path="password"/></div>
			<div><form:errors path="confirm_password"/></div>

			<c:if test="${not empty errorMessage}">
				<c:out value="${errorMessage}" />
				<c:remove var="errorMessage" scope="session" />
			</c:if>
			</div><br/>

				<form:label type="login_id"  path="login_id">ログインID</form:label>
				<p class="loginId"><form:input type="login_id" path="login_id"  value="${user.login_id}"/></p>

				<form:label type="name"  path="name">名前</form:label>
		        <p class="name"><form:input type="name" path="name"  value="${user.name}"/></p>

		        <form:label type="password" path="password">パスワード</form:label>
		        <p class="password"><form:password  path="password" /></p>


		        <form:label type="confirm_password" path="confirm_password">パスワード(確認)</form:label>
		        <p class="confirm_password"><form:password  path="confirm_password" /></p>


		        <p class="submit"><input type="submit" value="登録"></p>

		        <a href="question">戻る</a>
		</div>
		</form:form>

</body>
</html>