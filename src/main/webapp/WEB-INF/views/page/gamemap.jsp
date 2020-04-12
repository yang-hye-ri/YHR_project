<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<title>gameMap</title>
</head>
<body>
	<div class="mainMap_div">
			<div style="width: calc((100% - 200px) / 2); margin: auto;">
				<div id="map" style="width:600px;height:500px;">
					<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8d4434bfbe65175cba2b3451125d4cc0"></script>
					<script>
							var container = document.getElementById('map');
							var options = {
								center: new kakao.maps.LatLng(37.5652894,126.849467),
								level: 3
							};
					
							var map = new kakao.maps.Map(container, options);
					</script>
				</div>
			</div>
	</div>
</body>
</html>