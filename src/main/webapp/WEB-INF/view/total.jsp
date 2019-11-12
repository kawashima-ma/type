<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果一覧</title>
</head>
<body>
	<c:forEach items="${users}" var="user" >
		<span class="user-elements">名前：<c:out value="${user.name}" /></span><br>
        <span class="user-elements">タイプ：<c:out value="${user.result_type}" /></span>
	</c:forEach>
</body>
</html>