<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/question.css" />" rel="stylesheet">
<title>モチベーションタイプ診断</title>
</head>
<body>
<header>
<ul>
	<li><a href="./question" id="question">アンケート</a></li>
	<li><a href="./total" id="total">全ユーザー結果一覧</a></li>
	<li><a href="./setting" id="setting">ユーザー編集</a></li>
	<li><a href="./logout"  id="logout">ログアウト</a></li>
</ul>
</header>


<%!int i = 0; %>
<h1>モチベーションタイプ診断（全${questionText.size()}問）</h1>
			<div class="error">
				<c:if test="${not empty errorMessage}">
					<c:out value="${errorMessage}" />
				</c:if>
			</div>

<form:form modelAttribute="AnswerForm"  action="${pageContext.request.contextPath}/question" method="post">


<c:forEach items="${questionText}" var="question">
<div id="questionAll">
	<p class="question-title">第${question.id}問<br/>${question.question_text}</p>

<div id="question">
	<c:forEach items="${answerText}" var="answer">
		<c:if test="${question.id == answer.question_id }">
			<div class="question1">
			<div class="qestion-border"><span class="title">A</span>${answer.drive_ans}</div>
			<div class="qestion-border"><span class="title">C</span>${answer.create_ans}</div>
			</div>
			<div class="question2">
			<div class="qestion-border"><span class="title">B</span>${answer.analyze_ans}</div>
			<div class="qestion-border"><span class="title">D</span>${answer.volunteer_ans}</div>
			</div>
		</c:if>
	</c:forEach>
</div>

	<div class="point2"><div class="answer-title">１番目に当てはまるもの</div>
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListA}" value="A" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListB}" value="B" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListC}" value="C" />
		<form:radiobuttons path="point2lists[${question.id}]" items="${ListD}" value="D" />
	</div>
	<div class="point1"><div class="answer-title">２番目に当てはまるもの</div>
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListA}" value="A" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListB}" value="B" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListC}" value="C" />
		<form:radiobuttons path="point1lists[${question.id}]" items="${ListD}" value="D" />
	</div>

</div>
</c:forEach>
		<input type="hidden" value="point2lists[]">
		<input type="hidden" value="point1lists[]">
		<p class="button"><input type="submit" value="回答結果"></p>
</form:form>

</body>
</html>