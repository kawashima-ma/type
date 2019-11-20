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
	<li><a href="./question" id="question">診断</a></li>
	<li><a href="./total" id="total">全ユーザー結果一覧</a></li>
	<li><a href="./update" id="update">ユーザー編集</a></li>
	<li><a href="./logout"  id="logout">ログアウト</a></li>
</ul>
</header>



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
		<form:radiobuttons  path="point2lists[${question.id}]" items="${ListA}" value="A"  onChange="changeDisabled2(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point2lists[${question.id}]" items="${ListB}" value="B" onChange="changeDisabled2(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point2lists[${question.id}]" items="${ListC}" value="C" onChange="changeDisabled2(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point2lists[${question.id}]" items="${ListD}" value="D"  onChange="changeDisabled2(${question.id})" disabled="false"/>
	</div>
	<div class="point1"><div class="answer-title">２番目に当てはまるもの</div>
		<form:radiobuttons  path="point1lists[${question.id}]" items="${ListA}" value="A" onChange="changeDisabled(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point1lists[${question.id}]" items="${ListB}" value="B" onChange="changeDisabled(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point1lists[${question.id}]" items="${ListC}" value="C" onChange="changeDisabled(${question.id})" disabled="false"/>
		<form:radiobuttons  path="point1lists[${question.id}]" items="${ListD}" value="D" onChange="changeDisabled(${question.id})" disabled="false"/>
	</div>

<script type="text/javascript">

function changeDisabled2(num){
	check2A = document.getElementById("point2lists" + num + "1");
	check2B = document.getElementById("point2lists" + num + "2");
	check2C = document.getElementById("point2lists" + num + "3");
	check2D = document.getElementById("point2lists" + num + "4");

	if(check2A.checked == true){
		document.getElementById("point1lists" + num + "1").disabled = true;
	}else{document.getElementById("point1lists" + num + "1").disabled = false;
	}
	if(check2B.checked == true){
		document.getElementById("point1lists" + num + "2").disabled = true;
	}else{document.getElementById("point1lists" + num + "2").disabled = false;
	}
	if(check2C.checked == true){
		document.getElementById("point1lists" + num + "3").disabled = true;
	}else{document.getElementById("point1lists" + num + "3").disabled = false;
	}
	if(check2D.checked == true){
		document.getElementById("point1lists" + num + "4").disabled = true;
	}else{document.getElementById("point1lists" + num + "4").disabled = false;
	}

}

function changeDisabled(num){
	check1A = document.getElementById("point1lists" + num + "1");
	check1B = document.getElementById("point1lists" + num + "2");
	check1C = document.getElementById("point1lists" + num + "3");
	check1D = document.getElementById("point1lists" + num + "4");

	if(check1A.checked == true){
		document.getElementById("point2lists" + num + "1").disabled = true;
	}else{document.getElementById("point2lists" + num + "1").disabled = false;
	}
	if(check1B.checked == true){
		document.getElementById("point2lists" + num + "2").disabled = true;
	}else{document.getElementById("point2lists" + num + "2").disabled = false;
	}
	if(check1C.checked == true){
		document.getElementById("point2lists" + num + "3").disabled = true;
	}else{document.getElementById("point2lists" + num + "3").disabled = false;
	}
	if(check1D.checked == true){
		document.getElementById("point2lists" + num + "4").disabled = true;
	}else{document.getElementById("point2lists" + num + "4").disabled = false;
	}

}
</script>
</div>
</c:forEach>
		<input type="hidden" value="point2lists[]">
		<input type="hidden" value="point1lists[]">
		<p class="button"><input type="submit" value="回答結果"></p>
</form:form>



</body>
</html>