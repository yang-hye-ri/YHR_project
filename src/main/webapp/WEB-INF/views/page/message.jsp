<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type = "text/javascript" src = "/resources/js/message.js"></script>	
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<link rel = "stylesheet" href = "/resources/css/message.css">
<title>Insert title here</title>
</head>
<body>
<div class="message_div">
	<h1 style="color: #fff; text-align: center;">Best 게시물 TOP 3</h1>
	<div class="best_m">
		<ul>
			<li class="li_best">
				<div class="p_m_img"></div>
				<p style="color: #fff; text-align: center;">제목</p>
			</li>
			<li class="li_best">
				<div class="p_m_img"></div>
				<p style="color: #fff; text-align: center;">제목</p>
			</li>
			<li class="li_best">
				<div class="p_m_img"></div>
				<p style="color: #fff; text-align: center;">제목</p>
			</li>
		</ul>
	</div>
	
	<div class="message_div2">
		<h3 style="color: #fff;">전체 게시글 보기</h3>
		
		
		<div style="height: 40px; background-color: #1f1f1f;border-bottom: solid 1px #c30000;border-top: solid 1px #c30000;">
				<div class="li_m_1">제목</div>
				<div class="li_m_2">작성자</div>
				<div class="li_m_3">날짜</div>
				<div class="li_m_3">추천수</div>
		</div>
		<form action="/messageboard" id="messagelist">
			<div id="list">
				<!-- <ul class="message_ul">
					<li class="li_m_1">제목입니다</li>
					<li class="li_m_2">작성자1</li>
					<li class="li_m_3">04.28</li>
					<li class="li_m_3">100</li>
				</ul>
				<ul class="message_ul">
					<li class="li_m_1">제목입니다</li>
					<li class="li_m_2">작성자2</li>
					<li class="li_m_3">04.28</li>
					<li class="li_m_3">100</li>
				</ul>
				<ul class="message_ul">
					<li class="li_m_1">제목입니다</li>
					<li class="li_m_2">작성자2</li>
					<li class="li_m_3">04.28</li>
					<li class="li_m_3">100</li>
				</ul> -->
			</div>
		</form> 
	</div>
	<div class="paging">
		<a href="#" class="direction fisrt"><span>처음</span></a>
		<a href="#" class="direction prev"><span>이전</span></a>
		<a href="#">1</a>
		<a href="#">2</a>
		<a href="#">3</a>
		<a href="#">4</a>
		<strong>5</strong>
		<a href="#">6</a>
		<a href="#">7</a>
		<a href="#">8</a>
		<a href="#">9</a>
		<a href="#" class="direction next"><span>다음</span></a>
		<a href="#" class="direction last"><span>끝</span></a>
	</div><!-- //paging -->
	<div class="message_btn_div">
		<button type="button" onclick="location.href = '/messageeditor'" class="message_btn">작성하기</button>
	</div>
</div>	


</body>
</html>