<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>診断結果</title>
 	<meta http-equiv="CONTENT-TYPE" content="text/html; charset=utf-8" />
 	<link href="<c:url value="/resources/css/result.css" />" rel="stylesheet">
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.js"></script>
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

	<div id="results">
		<p class="result-title">診断結果</p>

		<div class="resultType">
			<c:out value="${userResult.getType_name()}" />型
		</div>

		<div class="canvas">
	    	<canvas id="ChartId"></canvas>   <!-- ここがグラフの場所 -->
	    </div>
	</div>

	<div id="result-table">
		<p class="table-title">モチベーションタイプ考察</p>
		<div class="table">
	    <table border="3">
		    <tr>
			    <td>タイプ</td>
			    <td>欲求</td>
			    <td>KEY</td>
			    <td>初対面</td>
			    <td>Happy Word</td>
			    <td>趣向</td>
			    <td>ストレス</td>
			    <td>強み</td>
			    <td>課題</td>
		    </tr>
		    <tr>
			    <td>ドライブ</td>
			    <td>達成支配欲求</td>
			    <td>
			    勝ち負け<br>
			    敵味方<br>
			    損得
			    </td>
			    <td>なんぼのもんだ</td>
			    <td>すごい</td>
			    <td>
			    自力本願で強くありたい<br>
			    周囲に影響を与えたい<br>
			    意志薄弱状態や他社依存を避けたい<br>
			    プロセスより結果<br>
			    目的や目標達成を追求<br>
			    他社との競争を勝ち抜く
			    </td>
			    <td>
			    結果の数値化があいまい<br>
			    競争の原理があいまい
			    </td>
			    <td>
			    牽引力<br>
			    主張力<br>
			    主体性<br>
			    達成意欲
			    </td>
			    <td>
			    受容力<br>
			    傾聴力<br>
			    中立性<br>
			    自制心
			    </td>
		    </tr>
		    <tr>
			    <td>ボランティア</td>
			    <td>貢献調停欲求</td>
			    <td>
			    善悪<br>
			    正邪<br>
			    愛憎
			    </td>
			    <td>いい人なのかどうか</td>
			    <td>ありがとう</td>
			    <td>
			    人から愛されたい<br>
			    平和を保ち葛藤を避けたい<br>
			    中立的な立場でいたい<br>
			    他社との戦いより協調を大切にしたい<br>
			    周囲の期待に応えたい<br>
			    人からの支持、感謝されたい<br>
			    結果よりプロセス
			    </td>
			    <td>激しい競争</td>
			    <td>
			    調停力<br>
			    受容力<br>
			    中立性<br>
			    自制心
			    </td>
			    <td>
			    牽引力<br>
			    主張力<br>
			    主体性<br>
			    達成意欲
			    </td>
		    </tr>
		    <tr>
			    <td>アナライズ</td>
			    <td>論理探求欲求</td>
			    <td>
			    真偽<br>
			    因果<br>
			    優劣
			    </td>
			    <td>言ってることは正しいのか</td>
			    <td>
			    確かに<br>
			    正しい
			    </td>
			    <td>
			    様々な知識を吸収したい<br>
			    複雑な物事を究明して自信を持ちたい<br>
			    勢いだけで走ることを避けたい<br>
			    無計画な状態を避けたい<br>
			    合理的な答えを導き出したい<br>
			    客観的な視点を軽視しない
			    </td>
			    <td>
			    大雑把な物事<br>
			    合理的な意味づけのない仕事
			    </td>
			    <td>
			    分析力<br>
			    計画力<br>
			    探究心<br>
			    起立性
			    </td>
			    <td>
			    発想力<br>
			    直感力<br>
			    柔軟性<br>
			    変化志向
			    </td>
		    </tr>
		    <tr>
			    <td>クリエイト</td>
			    <td>感性発散欲求</td>
			    <td>好き嫌い<br>
			    苦楽<br>
			    美醜</td>
			    <td>面白い人なのか</td>
			    <td>新しい<br>
			    おもしろい</td>
			    <td>新しいものを生み出したい<br>
			    楽しいことを計画したい<br>
			    自分の個性を理解されたい<br>
			    平凡であることを避けたい<br>
			    同じことの繰り返しを避けたい<br>
			    変化感や変革を実現したい<br>
			    自由な発想、型にはまらないことを望む</td>
			    <td>マニュアル化の域を出ない<br>
			    アイディア発揮の余地がない</td>
			    <td>発想力<br>
			    直感力<br>
			    柔軟性<br>
			    変化志向</td>
			    <td>持続力<br>
			    計画力<br>
			    探究心<br>
			    規律性</td>
		    </tr>
	    </table>
	    </div>
    </div>


    <script>
    var ctx = document.getElementById("ChartId").getContext("2d");
    var chart = new Chart(ctx, {
    type: "bar",
    data:{
    	labels:["ドライブ","ボランティア","アナライズ","クリエイト"],
    	datasets:[{
    		data:["${userResult.getDrivescore()}","${userResult.getVolunteerscore()}","${userResult.getAnalyzescore()}","${userResult.getCreatescore()}"],
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


</body>
</html>