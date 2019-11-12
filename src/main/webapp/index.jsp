<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<title>ユーザー新規登録画面</title>
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
<body>
	<div class="ui fixed inverted menu">
		<div class="ui container">


			<div class="right menu">
			</div>
		</div>
	</div>
	<div class="ui main text container">

		<div class="ui segment">
			<form:form modelAttribute="signupForm" class="ui form">
				<form:errors path="*" class="ui error message" />

				<div class="seven wide field">
					<form:label path="login_id">ログインID</form:label>
					<form:input path="login_id" />
				</div>

				<div class="five wide field">
					<form:label path="name">名前</form:label>
					<form:input path="name" />
				</div>

				<div class="seven wide field">
					<form:label path="password">パスワード</form:label>
					<form:password path="password" />
				</div>
				<div class="seven wide field">
					<form:label path="confirmPassword">パスワード(確認)</form:label>
					<form:password path="confirmPassword" />
				</div>

				<button type="submit" class="ui primary button">登録</button>
				<a href="./management" class="ui button">キャンセル</a>
			</form:form>
		</div>
	</div>
</body>
</html>