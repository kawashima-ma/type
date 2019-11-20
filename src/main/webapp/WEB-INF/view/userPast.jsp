<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.js"></script>
<title>診断結果の履歴</title>
</head>
<body>

	<c:forEach items="${userpastResults}" var="userpastResult">

	<c:out value="${userpastResult.name}"/>さん<br>

	<fmt:formatDate value="${userpastResult.createdAt}" pattern="yyyy年MM月dd日"/> の診断結果

	<div class="canvas">
    	<canvas id="${userpastResult.result_id}"></canvas>   <!-- ここがグラフの場所 -->
    </div>

<script>
    var ctx = document.getElementById("${userpastResult.result_id}").getContext("2d");
    var chart = new Chart(ctx, {
    type: "bar",
    data:{
    	labels:["ドライブ","ボランティア","アナライズ","クリエイト"],
    	datasets:[{
    		data:["${userpastResult.drivescore}","${userpastResult.volunteerscore}","${userpastResult.analyzescore}","${userpastResult.createscore}"],
    		backgroundColor: ['rgba(255, 80, 80, .5)', 'rgba(196, 255, 74, .5)', 'rgba(128, 128, 255, .5)', 'rgba(255, 255, 30, .5)']
    	}]
    },
    options: {                             //◆オプション
    	responsive: true,                  //グラフ自動設定
        legend: {                          //凡例設定
            display: false                 //表示設定
            },
        scales: {                          //軸設定
            yAxes: [{            //表示設定
                ticks: {                      //最大値最小値設定
                    min: 0,                   //最小値
                    max: 20,                  //最大値
                    fontSize: 12,             //フォントサイズ
                    stepSize: 2               //軸間隔
                    },
                }],
            }
       }
    });
    </script>

	</c:forEach>
</body>
</html>




