<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報変更</title>
</head>
<body>
		<form:form modelAttribute="updateForm" class="form" action="${pageContext.request.contextPath}/update" method="post">
		<div id="update">
			<p class="form-title">ユーザー登録</p>
			<div class="error"><form:errors path="login_id"  />
			<div><form:errors path="name"></form:errors></div>
			<div><form:errors path="password"></form:errors></div>
			<div><form:errors path="ValidPassword"></form:errors></div>
			<div><form:errors path="confirm_password"></form:errors></div>
			</div>
			<c:if test="${not empty errorMessage}">
				<c:out value="${errorMessage}" />
				<c:remove var="errorMessage" scope="session" />
			</c:if>
				<form:label type="login_id"  path="login_id">ログインID</form:label>
				<p class="loginId"><form:input type="login_id" path="login_id" /></p>

				<form:label type="name"  path="name">名前</form:label>
		        <p class="name"><form:input type="name" path="name" /></p>

		        <form:label type="password" path="password">パスワード</form:label>
		        <p class="password"><form:password  path="password" /></p>

		        <form:label type="confirm_password" path="confirm_password">確認用パスワード</form:label>
		        <p class="confirm_password"><form:password  path="confirm_password" /></p>


		        <p class="submit"><input type="submit" value="登録"></p>

		        <a href="login">戻る</a>
		</div>
		</form:form>

</body>
</html>