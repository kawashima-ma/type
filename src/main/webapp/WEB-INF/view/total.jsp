<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/total.css" />" rel="stylesheet">
<title>結果一覧</title>
</head>
<body>
	<div id="total">
	<form action="/userPast" class="person">
	<c:forEach items="${users}" var="user" >
		<div class="userTypeCard">
			<div class="userTypeCard-inner">
				<div class="userTypeCard-front">
					<div class="userName">
					<c:out value="${user.name}" /></div>
				</div>
				<div class="userTypeCard-back">
				<div class="userType">タイプ：
				<c:forEach items="${type_names }" var="type">
		        	<c:if test="${type.id == user.result_type}">
		        		<c:out value="${type.type_name}"/>
		        	</c:if>
		        </c:forEach></div>
		        <input type="hidden" name="user_id" value="${user.id }">
		        <input type="submit" value="結果一覧">
		        </div>
        	</div>
        </div>
	</c:forEach>
	</form>
	</div>
</body>
</html>