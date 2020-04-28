<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type = "text/javascript" src = "/resources/js/mainmap.js"></script>	
<title>mainMap</title>



</head>
<body>
	<div class="mainMap_div">
		<div><h1 style="color: #c30000; margin: 0; text-align: center;">cctv 위치 현황</h1></div>
		<div style="width: calc((100% - 200px) / 2); margin: auto;">
			<div id="map" style="width:600px;height:500px;">
			 	<div class="category"></div>
				<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8d4434bfbe65175cba2b3451125d4cc0"></script>
			</div>
		</div>
		<div class="start_but">
			<a href="/gamemap" class="btn btn-5 mainmap-a">GAME START?</a> 
		</div>
	</div>
	
</body>
</html>