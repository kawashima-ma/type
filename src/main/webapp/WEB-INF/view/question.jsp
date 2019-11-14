<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>モチベーションタイプ診断</title>
</head>
<body>
<%!int i = 0; %>
<h1>モチベーションタイプ診断（全${questionText.size()}問）</h1>
<form:form modelAttribute="AnswerForm">
	<c:forEach items="${questionText}" var="question">
		<h2>第${question.id}問.${question.question_text}</h2>
		<c:forEach items="${answerText}" var="answer">
			<c:if test="${question.id == answer.question_id }">
				<h3>A.${answer.drive_ans}</h3>
				<h3>B.${answer.analyze_ans}</h3>
				<h3>C.${answer.create_ans}</h3>
				<h3>D.${answer.volunteer_ans}</h3>
			</c:if>
		</c:forEach>

			<form:radiobuttons path="drive_ans[1]" items="${ListA}" value="2" />
			<form:radiobuttons path="analyze_ans[1]" items="${ListB}" value="2" />
			<form:radiobuttons path="create_ans[1]" items="${ListC}" value="2" />
			<form:radiobuttons path="volunteer_ans[1]" items="${ListD}" value="2" />

		<br>
	<% i+=1; %>

	</c:forEach>

</form:form>
</body>
</html>