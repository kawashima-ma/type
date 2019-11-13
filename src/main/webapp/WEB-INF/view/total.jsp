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
	<c:forEach items="${users}" var="user" >
		<div>
		<form action="/userPast" class="person">
		<span class="user-elements">名前：
		<c:out value="${user.name}" /></span>
		<span class="user-elements">タイプ：</span>
		<c:forEach items="${type_names }" var="type">
        	<c:if test="${type.id == user.result_type}">
        		<c:out value="${type.type_name}"/>
        	</c:if>
        </c:forEach>
        <input type="hidden" name="user_id" value="${user.id }">
        <input type="submit" value="詳細">
        </form>
        </div>
	</c:forEach>
</body>
</html>