$(document).ready(function() {
	
		
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(37.55, 126.97), // 지도의 중심좌표
        level: 8 // 지도의 확대 레벨
    };

	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	 
	
	
	// 마커 이미지의 이미지 주소입니다
	var imageSrc = "/resources/img/cam.png"; 
	
	
		$.ajax({
			type:"POST",
			url:"/mainmap"
		}).done(function(d){
			var result = d.result;
//			console.log(result);
			
			for(var i = 0; i < result.length; i++) {
				// 데이터 변수 넣기
				var Mm_latitude = result[i].Mm_latitude;
				var Mm_longitude = result[i].Mm_longitude;
				var city_name = result[i].city_name;
				
				// 마커 위치 객체 생성
				var point = new kakao.maps.LatLng(Mm_latitude, Mm_longitude);
				
				// 마커 이미지의 이미지 크기 입니다
			    var imageSize = new kakao.maps.Size(24, 24); 
			    
			    // 마커 이미지를 생성합니다    
			    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
			    
			    // 마커를 생성합니다
			    new kakao.maps.Marker({
			        map: map, // 마커를 표시할 지도
			        position: point, // 마커를 표시할 위치
			        title : city_name, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
			        image : markerImage // 마커 이미지 
			    });
				
			}
			
			
			
	});
			
	

});

