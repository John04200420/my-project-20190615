<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>


<html lang="en">

<head>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	response.flushBuffer();
%>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>募集版 -Whiloud</title>
<link href="css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/cooperationList.css">
</head>

<body>

	<jsp:include page="title.jsp" />

	<section class="category">
		<p>
			排序 :&nbsp;&nbsp; <input type="button" value="依關聯性">&nbsp;&nbsp;
			<input type="button" value="依發布時間">&nbsp;&nbsp; <input
				type="button" value="依讚數">&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 影片長度 :&nbsp; <input
				type="button" value="不限">&nbsp;&nbsp; <input type="button"
				value="5分以內">&nbsp;&nbsp; <input type="button"
				value="5-10分鐘">&nbsp;&nbsp; <input type="button"
				value="10分鐘以上">&nbsp;&nbsp;
		</p>

	</section>
	<section class="videoboxs">
		<c:forEach var="i" begin="0" end="11" step="1">
			<c:choose>
				<c:when test="${not empty cooperationList[i]}">
					<div class="videobox">

						<img
							src="${pageContext.servletContext.contextPath}${cooperationList[i].cb.picturePath}"
							alt="" class="video">
						<p>${cooperationList[i].postTitle}</p>
						<a href=""><img
							src="${pageContext.servletContext.contextPath}${cooperationList[i].mb1.picturePath}"
							alt="放影片的人" class="videoer"></a>
						<div id="author">
							<p>${cooperationList[i].mb1.nickname}</p>
						</div>
					</div>
				</c:when>
				<c:otherwise>

				</c:otherwise>
			</c:choose>

				<div class="videobox">
					<img src="images/video.png" alt="" class="video">
					<p>我是片名</p>
					<a href=""><img src="images/2.jpg" alt="放影片的人" class="videoer"></a>
					<div id="author">
						<p>作者名子</p>
					</div>
				</div>

		</c:forEach>


	</section>
</body>


<script src="js/jquery.min.js"></script>
<script src="js/cooperationList.js"></script>
<script src="js/skel.min.js"></script>
<script src="js/util.js"></script>
<script src="js/jquery.flexslider.js"></script>
<script type="text/javascript" src="js/thickbox.js"></script>

</html>