$(document).ready(function() {
	
		
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(37.4650051, 126.9052925), // 지도의 중심좌표
        level: 12 // 지도의 확대 레벨
    };

	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	 
	
	
		$.ajax({
			type:"POST",
			url:"/mainmap"
		}).done(function(d){
			var result = d.result;
			console.log(d);
			console.log(result[0].Mm_latitude);

			
			// DB에서 온거 가져와서 
			// 마커를 표시할 위치와 title 객체 배열입니다 
			var positions = [
			    {
			        title: result[0].city_name, 
			        latlng: new kakao.maps.LatLng(result[0].Mm_latitude, result[0].Mm_longitude)
			    },
			];
			
			// 마커 이미지의 이미지 주소입니다
			var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
			    
			for (var i = 0; i < positions.length; i ++) {
			    
			    // 마커 이미지의 이미지 크기 입니다
			    var imageSize = new kakao.maps.Size(24, 35); 
			    
			    // 마커 이미지를 생성합니다    
			    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
			    
			    // 마커를 생성합니다
			    var marker = new kakao.maps.Marker({
			        map: map, // 마커를 표시할 지도
			        position: positions[i].latlng, // 마커를 표시할 위치
			        title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
			        image : markerImage // 마커 이미지 
			    });
			}
			
		
			
	});
	
	
	
	

});

