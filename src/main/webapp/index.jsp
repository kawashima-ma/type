<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">
<title>404</title>

<style type="text/css">
.fade-in.shown {
    opacity: 1;
    -webkit-transform: scale(1) translateY(0);
    transform: scale(1) translateY(0);
}

.fade-in {
    opacity: 0;
    -webkit-transform: scale(1.02) translateY(0);
    transform: scale(1.02) translateY(0);
    -webkit-transition: all .5s linear;
    transition: all .5s linear;
}

.media_coming_soon {
  width: 100%;
  min-width: 1064px;
  padding: 98px 0;
  background: url(/bg-1.png) center center no-repeat;
  background-size: 82.5% auto;
}

.media_coming_soon .media-inner {
    width: 100%;
    margin: 0 auto;
    min-width: 320px;
    padding: 0 20px;
}

.media_coming_soon .media-body {
    position: absolute;
    margin: auto;
    top: 50%;
    -webkit-transform: translateY(-70%);
    transform: translateY(-70%);
    left: 0;
    right: 0;
}

.media_coming_soon .media-header {
    margin: 0 0 30px;
}

.media_coming_soon .media-text {
    width: 74.44444%;
    margin: 0 auto;
}

.media_coming_soon .media-text {
    width: 93.95556%;
    margin: 0 auto;
    text-align: center;
}

.media_coming_soon .media-heading .-text {
    font-size: 2.66667rem;
}

.media_coming_soon .media-heading .-text {
    font-size: 2.16667rem;
    display: block;
}

.media_coming_soon .media-heading {
    text-align: center;
}

</style>

</head>

<body>
  <div class="main fade-in-elem" id="js-main">
    <section class="media_coming_soon fade-in shown" id="js-coming-soon" style="height: 401px;">
      <div class="media-inner">
        <div class="media-body">
          <div class="media-header">
            <h1 class="media-heading"><span class="-text">404 NOT FOUND</span></h1>
          </div>
          <div class="media-text">
            <p>ページが見つかりませんでした<br>
              <a href="/type/question">トップページへ戻る</a></p>
          </div>
        </div>
      </div>
    </section>
  </div>
</body>

</html>