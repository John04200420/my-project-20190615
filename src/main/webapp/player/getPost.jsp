<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
  	<% 
		response.setHeader("Pragma","no-cache"); 
		response.setHeader("Cache-Control","no-cache"); 
		response.setDateHeader("Expires", 0); 
	%>
    <title>影片播放</title>
    <link href="${pageContext.servletContext.contextPath}/player/css/video.css" rel="stylesheet" type="text/css">
<%--     <script src="${pageContext.servletContext.contextPath}/player/js/video.js"></script> --%>
    <script src="${pageContext.servletContext.contextPath}/player/js/jquery.min.js"></script>
    <script src="${pageContext.servletContext.contextPath}/player/js/tab.js"></script>    
    <style type="text/css">
      .vjs-default-skin { color: rgba(171,208,102,1); }
      .vjs-default-skin .vjs-play-progress,
      .vjs-default-skin .vjs-volume-level { background-color: rgba(214,232,181,0.7) }
      .vjs-default-skin .vjs-control-bar,
      .vjs-default-skin .vjs-big-play-button { background: rgba(40,124,134,0.8) }
      .vjs-default-skin .vjs-slider { background: rgba(0,9,219,0.23) }
      .vjs-default-skin .vjs-control-bar { font-size: 110% }
    </style>
  </head>

  <body>
    <div class="leftFixed">
<!--       <video id="MY_VIDEO_1" class="video-js vjs-default-skin"  -->
<!--         controls preload="auto" width="480" height="360" poster="" -->
<!--         data-setup="{}" id="clip"> -->
<%--         <source src="${pageContext.servletContext.contextPath}${postDetailBean.cb.clipPath}" type='video/mp4' > --%>
<!--       </video> -->
      		<video src="${pageContext.servletContext.contextPath}${postDetailBean.cb.clipPath}"
				width="480" height="300"
				
				id = "clip"
			>
				please use Chrome
			</video>
			<div style="width:100px; float:left;">
				&nbsp;
			</div>
			<button id="playRecord" style="width:50px;float: left;">Play </button>
				<button id="pauseButton" style="width:50px;float: left;">Pause </button>
				<button id="stopButton" style="width:50px;float: left;">Stop </button>
			<span style="clear: both;"/>
			
			<div style="left:200px; width:200px;height:20px; border:1px solid DarkTurquoise ; padding:2px;float: left;" id="defaultBar">
				<footer id="progressBar" style="width: 0px; height: 20px;background: DarkTurquoise ;float: left;"></footer>
			</div>
			
			<span style="clear: both;"/>
	
      <div style="position: relative; left:20px; top:-350px;">
        <div class="member">
          <a href=""><img src="${pageContext.servletContext.contextPath}${postDetailBean.mb1.picturePath}" alt="放影片的人" class="videoer"></a>
          <h1><br>作者:${postDetailBean.mb1.nickname}<br>合作者： ${postDetailBean.mb2.nickname}</h1>
          <br>
          
        </div>

        <div class="work">     
        <br>
        <br>   
          <h5>片名：  ${postDetailBean.postTitle}<br></h5>
          <br>
          <h5>創作日期： ${postDetailBean.creationDateTime}<br></h5>
          <br>
          <h5>作者留言：</h5> <h6>${postDetailBean.postText}<br><h6>
          <button class="likeWork">喜歡此作品</button>
        </div>
        
      </div>
    </div>

    <div class="rightFloat">
      <div id="tab-demo">
        <ul class="tab-title">
          <li><a class="tabBtn" href="#tab01">台詞</a></li>
          <li><a class="tabBtn" href="#tab02">留言</a></li>
        </ul>
	       <div class="tab-inner" id="tab01">
	        <c:forEach var="entry" items="${recordList}">
	        	<div class="text section">
		        	<span class="startTime" style="display:none;">${entry.sb.startTime}</span>
		        	<span class="endTime" style="display:none;">${entry.sb.endTime}</span>
		        	<span class="script">
		            <h2>${entry.sb.englishScript}</h2>
		            <br>
		            <h3>${entry.sb.chineseScript}</h3>
		            <br>
		            </span>
	            	<span style="font-size:13px">影片腳色: ${entry.sb.roleName}, 錄音者: ${entry.mb.nickname}<br></span>
	            	<audio
								src="${pageContext.servletContext.contextPath}${entry.recordPath}"
								controls="controls"
								class="record" 
								style="display:none;"
							>
					</audio>
		            <div class="allSoundBtm">
		              <button class="Original playIntervalClip" id="playIntervalClip">聽原音</button>
		              <button class="listenRec playIntervalRecord" id="playIntervalRecord">聽錄音</button>
		              <button class="likeScript">錄音讚</button>
		            </div>
	          </div>
	        </c:forEach> 
       </div>

        <div class="tab-inner" id="tab02">
          <form>
            <textarea class="inputMessage" type="text" placeholder="在此輸入留言內容"></textarea>
            <input type="submit" class="sendMessage" value="發送">
          </form>  
          <div class="message">
            <a href=""><img src="images/8.jpg" alt="留言的人" class="messager"></a>
            <h4>留言留言留言留言留言留言留言留言留言留言留言留言留言留言留言留言留言</h4>
          </div>  
          <div class="message">  
            <a href=""><img src="images/8.jpg" alt="留言的人" class="messager"></a>
            <h4>留</h4>
          </div>  
          <div class="message">
            <a href=""><img src="images/8.jpg" alt="留言的人" class="messager"></a>
            <h4>灌水</h4>
          </div>  
          <div class="message">
            <a href=""><img src="images/8.jpg" alt="留言的人" class="messager"></a>
            <h4>6666666666</h4>
          </div>  
          <div class="message">
            <a href=""><img src="images/8.jpg" alt="留言的人" class="messager"></a>
            <h4>7777777777777</h4>
          </div>
        </div>
        
      </div>
    </div>  

    
  </body>
<script>

function doFirst(){
	clip = document.getElementById('clip');

	playRecord = document.getElementById('playRecord');
	pauseButton = document.getElementById('pauseButton');
	stopButton = document.getElementById('stopButton');
	
	defalutBar = document.getElementById('defalutBar');
	progressBar = document.getElementById('progressBar');
	defaultBar.addEventListener('click',clickedBar);
	
	
	
	record = document.getElementsByClassName('record');
	script = document.getElementsByClassName('script');
	startTime = document.getElementsByClassName('startTime');
	endTime = document.getElementsByClassName('endTime');
	playIntervalRecord = document.getElementsByClassName('playIntervalRecord');
	playIntervalClip = document.getElementsByClassName('playIntervalClip');
	section = document.getElementsByClassName('section');
	
	barsize = parseInt(window.getComputedStyle(defaultBar).width);
	playRecord.addEventListener('click',playRecordClick);
	pauseButton.addEventListener('click', function(){
		clip.pause();
		for(i=0; i<script.length; i++){
			record[i].currentTime = 0;
			record[i].pause();
			recordHasToPlay = false;
		}
	});
	stopButton.addEventListener('click', function(){
		clip.currentTime = 0;
		clip.pause();
		for(i=0; i<script.length; i++){
			record[i].currentTime = 0;
			record[i].pause();
		}
		
	})
	
	timeoutFunction = null;	//之後用來控制setTimeout要不要執行
	recordHasToPlay = null;
	
	//利用迴圈全部加上click listener
	//總台詞數 == script.length == record.length == playIntervalClip.length
	for(var i=0; i<playIntervalClip.length; i++){	
		playIntervalClip[i].addEventListener('click',playIntervalClipClick);
		playIntervalRecord[i].addEventListener('click',playIntervalRecordClick);
	}
	
	clip.addEventListener('timeupdate',update);	//當影片時間改變就會觸發此listener，也就是影片在播放時就一直會被執行

}

function clickedBar(e){	
	if (timeoutFunction != null){
		clearTimeout(timeoutFunction);
	}
	if(clip.paused){
		recordHasToPlay = false;
	}
	
 	var mouseX = e.pageX - progressBar.offsetLeft;
 	progressBar.style.width = mouseX +'px';	

 	var newTime = mouseX / (barsize / clip.duration);
 	
 	clip.currentTime = newTime;
 	for(i=0; i<script.length; i++){
		record[i].currentTime = 0;
		record[i].pause();
	}
}

//當'播全部錄音'被點擊
function playRecordClick(){
	
	if (timeoutFunction != null){
		clearTimeout(timeoutFunction);
	}
	
	recordHasToPlay = true;	//之後必須播錄音(會有這項是因為，如果之後按'只播原聲'，必須把此項設為false)
	
	//clip.currentTime = 0;	//歸零
	clip.volume = 0;		//影片聲音最小聲
	clip.play();			//播影片
	
	//處理錄音檔和字幕顏色
	for(var i=0; i<script.length; i++){
		script[i].style.color = "#000";	//先把所有字幕顏色變黑色
		record[i].currentTime = 0;		//所有錄音處於預備狀態
		record[i].pause();				//若之前有播到一半的錄音也先暫停
	}
	
}

//當影片時間改變就會觸發此listener，也就是影片在播放時就一直會被執行
function update(){
	
	//更新progressBar
	if(!clip.ended){
 		var size = 	barsize / clip.duration * clip.currentTime;
 		progressBar.style.width = size +'px';
 	}else{	
 		progressBar.style.width = '0px';
 	}
	
	clipVolumeHasToPlay = true;
	for(var i=0; i < script.length; i++){	//每次執行都把所有的台詞時間判斷一次
		//先判斷當影片時間是否坐落在某段台詞的時間內
		if(parseFloat(startTime[i].innerText)<= parseFloat(clip.currentTime)
			&&  parseFloat(clip.currentTime) <parseFloat(endTime[i].innerText)){
			
			for(var j=0; j<script.length; j++){	//如果影片時間在某段台詞的時間內
				if(j!=i){	//除了當前時間的台詞外，其他都變為黑色
					script[j].style.color="#000";
				}
			}
			script[i].style.color="red";	//當前台詞變紅色
			section[i].scrollIntoView({behavior: "smooth", block: "start", inline: "nearest"});
			if(!record[i].ended && recordHasToPlay == true){
				//如果錄音必須被播，而且台詞之前沒被播到完過，就撥放錄音
				clip.volume = 0;
				record[i].play();
				clipVolumeHasToPlay  = false;
			}
		}else{
			script[i].style.color="#000";	//如果影片當前時間不坐落在任何台詞時間內，則全部台詞為黑色
			if(clipVolumeHasToPlay){
				clip.volume = 1;
			}
		}
		
		
	}
}

//按下播原聲的按鈕後
function playIntervalClipClick(){
	if (timeoutFunction != null){
		clearTimeout(timeoutFunction);
	}
	recordHasToPlay = false;	//之後不能播錄音檔，此項設為false
	// 	disableButtons();
	var startTime = parseFloat(this.parentNode.parentNode.getElementsByClassName('startTime')[0].innerText);
	var endTime = parseFloat(this.parentNode.parentNode.getElementsByClassName('endTime')[0].innerText);
	var duration = endTime - startTime;
	
	//準備撥放影片
	clip.volume = 1;
	clip.currentTime = startTime;
	clip.play();
	
	//把錄音檔全部歸零並暫停，
	for(i=0; i<script.length; i++){
		record[i].currentTime = 0;
		record[i].pause();
	}
	
	//設定在duration時間後，把影片暫停，並重新讓使用者可以按按鈕
	timeoutFunction = setTimeout(function(){
			clip.pause(); 
// 			enableButtons();
	}, duration*1000);
	


}

//按下'播此段錄音'的按鈕後
function playIntervalRecordClick(){
	
	if (timeoutFunction != null){
		clearTimeout(timeoutFunction);
	}
	
	recordHasToPlay = true;	//準備播錄音檔

// 	disableButtons();	
	var startTime = parseFloat(this.parentNode.parentNode.getElementsByClassName('startTime')[0].innerText);
	var endTime = parseFloat(this.parentNode.parentNode.getElementsByClassName('endTime')[0].innerText);
	var duration = endTime - startTime;
	
	//準備撥放影片，錄音的部分交由recordHasToPlay和update的函數控制
	clip.volume = 0;
	clip.currentTime = startTime;
	clip.play();
	
	//把錄音檔全部歸零並暫停，之後交由update來控制聲音
	for(i=0; i<script.length; i++){
		record[i].currentTime = 0;
		record[i].pause();
	}
	
	//設定在duration時間後，把影片暫停，並重新讓使用者可以按按鈕
	timeoutFunction = setTimeout(function(){
			clip.pause(); 
// 			enableButtons();
	}, duration*1000);
}

// function disableButtons(){
// 	var buttons = document.querySelectorAll("button");
// 	for(var i=0; i<buttons.length;i++){
// 		buttons[i].disabled= true;
// 	}
// }

// function enableButtons(){
// 	var buttons = document.querySelectorAll("button");
// 	for(var i=0; i<buttons.length;i++){
// 		buttons[i].disabled= false;
// 	}
// }


window.addEventListener('load',doFirst);
</script>
</html>