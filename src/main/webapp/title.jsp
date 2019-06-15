<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<%response.setHeader("Pragma","No-cache"); 
	response.setHeader("Cache-Control","no-cache"); 
	response.setDateHeader("Expires", 0); 
	response.flushBuffer();%>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
	<div aria-live="polite" aria-atomic="true" style="position: absolute; top: 15%; left: 85%; z-index:9999; min-height: 200px;" >
  	<!-- Position it -->
	  <div style="position: absolute; top: 0; right: 0;" id="toastSection">
	  
	  
	  </div>
  </div>
	
	<div class="toast" role="alert" aria-live="assertive"
		aria-atomic="true" style="position: absolute; top: 60%; left: 300px; z-index:9999" data-delay="2000">
		<div class="toast-header">
			<img src="" class="rounded mr-2" id="broadcastImage" width="30">
			<strong
				class="mr-auto" id="broadcastMember">Bootstrap</strong> 
<!-- 				<small class="text-muted">11 mins ago</small> -->
					<small class="text-muted" id="sendTime"></small>
			<button type="button" class="ml-2 mb-1 close" data-dismiss="toast"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="toast-body" id="broadcastMessage">Hello, world! This is a toast message.</div>
	</div>
	
	<!-- 頂部選單 -->
	<header id="header">
		<div class="logo"><a href="main.jsp">Whiloud</a></div>
		<div class="username">${LoginOK.nickname}</div>
		<div class="rec"><a href="EnterRecListServlet"><img src="images/mic.png">錄音</a></div>
		<div class="videoimg"><a href="EnterPostListServlet"><img src="images/videoimg.png">作品</a></div>
		<div class="cooperation"><a href="EnterCooperationListServlet"><img src="images/cooperation.png">合作</a></div>
		<a href="#menu" class="toggle"><span>Menu</span></a>
		
	</header>
	<!-- 漢堡Menu -->
	<nav id="menu">
		<ul class="links">
			<li><img src="${pageContext.servletContext.contextPath}${LoginOK.picturePath}" alt=""></li>
			<li><a href="myVideo.html">我的影片</a></li>
			<li><a href="recList.html">範本集</a></li>
			<li><a href="videoList.html">影片集</a></li>
			<li><a href="cooperationList.html">合作</a></li>
			<li><a href="titleSet.html">設定</a></li>
			<li><a href="index.html">登出</a></li>
		</ul>
	</nav>
</body>


</html>