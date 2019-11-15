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
<form:form modelAttribute="AnswerForm"  action="${pageContext.request.contextPath}/a" method="post">
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



		<form:radiobuttons path="point2lists[${question.id}]" items="${ListA}" value="A" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListB}" value="B" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListC}" value="C" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListD}" value="D" />

		<form:radiobuttons path="point1lists[${question.id}]" items="${ListA}" value="A" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListB}" value="B" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListC}" value="C" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListD}" value="D" />




	<br>


</c:forEach>
		<input type="hidden" value="point2lists[]">
		<input type="hidden" value="point1lists[]">
		<input type="submit" value="登録">
</form:form>

</body>
</html>