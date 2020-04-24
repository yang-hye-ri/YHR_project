<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<link rel = "stylesheet" href = "/resources/css/message.css">
<link rel = "stylesheet" href = "/resources/css/messageboard.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type = "text/javascript" src = "/resources/js/messageboard.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="messageboard_div">
	<div style="height: 40px; background-color: #1f1f1f;;">
		<div class="li_m_1" id="li_m_1" >제목</div>
		<div class="li_m_2" id="li_m_2">작성자</div>
		<div class="li_m_3" id="li_m_3">날짜</div>
		<div class="li_m_3" id="li_m_4">추천수</div>
	</div>
	<div class="messageboard_Contents">
		
	</div>
	<div class="messageboard_btn_div">
		<button type="button" class="messageboard_btn" id="messageboard_btn"><div class="b_img"></div>추천하기</button>
	</div>
	<div style="text-align: center; padding-bottom: 100px;">
		<button type="button" onclick="location.href = '/messageeditor'" class="messageBoard_startbtn">작성하기</button>
		<button type="button" onclick="location.href = '/messageeditor'" class="messageBoard_startbtn">삭제하기</button>
	</div>
</div>
</body>
</html>