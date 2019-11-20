<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Ravi+Prakash" rel="stylesheet">
<link href="https://fonts.googleapis.com/earlyaccess/kokoro.css" rel="stylesheet">
<link href="<c:url value="/resources/css/total.css" />" rel="stylesheet">
<title>結果一覧</title>
</head>
<body>
<header>
<ul>
	<li><a href="./question" id="question">アンケート</a></li>
	<li><a href="./total" id="total1">全ユーザー結果一覧</a></li>
	<li><a href="./update" id="update">ユーザー編集</a></li>
	<li><a href="./logout"  id="logout">ログアウト</a></li>
</ul>
</header>


	<div id="total">
	<p class="form-title">全ユーザー結果一覧</p>
	<c:forEach items="${users}" var="user" >
		<div class="userTypeCard">
			<div class="userTypeCard-inner">
			<form:form action="${pageContext.request.contextPath}/userPast" class="person" method="get">
				<div class="userTypeCard-front">
					<div class="userName">
					<c:out value="${user.name}" /></div>
					<div class="userLoginId">
					@<c:out value="${user.login_id}" /></div>
				</div>
				<c:if test="${user.result_type == 1 }">
				<div class="userTypeCard-back1">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <div class="botton">
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 2 }">
				<div class="userTypeCard-back2">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 3 }">
				<div class="userTypeCard-back3">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 4 }">
				<div class="userTypeCard-back4">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 5 }">
				<div class="userTypeCard-back5">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 6 }">
				<div class="userTypeCard-back6">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 7 }">
				<div class="userTypeCard-back7">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == 8 }">
				<div class="userTypeCard-back8">
				<div class="userType">
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <div class="button">
		        <input type="hidden" name="user_id" value="${user.id }">
		        <p class="submit"><input type="submit" value="結果一覧"></p>
		        </div>
		        </div>
		        </c:if>

		        <c:if test="${user.result_type == null }">
				<div class="userTypeCard-back9">
				<div class="userType">
					診断してください
				</div>
		        </div>
		        </c:if>

			</form:form>
        	</div>
        </div>
	</c:forEach>
	</div>

</body>
</html>