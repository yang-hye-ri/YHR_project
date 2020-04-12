<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		<div style="height: 50px; background-color: #2e2e2e;">
				<div class="li_m_1">제목</div>
				<div class="li_m_2">작성자</div>
				<div class="li_m_3">날짜</div>
				<div class="li_m_3">추천수</div>
		</div>
		<form action="/messageboard">
			<ul class="message_ul">
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
			</ul>
		</form>
	</div>
	<div class="message_btn_div">
		<button type="button" onclick="location.href = '/messageeditor'" class="message_btn">글쓰기</button>
	</div>
</div>	


</body>
</html>