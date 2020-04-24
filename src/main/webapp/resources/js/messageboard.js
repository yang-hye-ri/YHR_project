$(document).ready(function() {

	var getParam = function(){
		var q = document.location.search;
		var params = q.substring(1, q.length);
		var paramArr = params.split("&");
		var param = paramArr[0].split("=");
		var p = {}; 
		p[param[0]] = param[1];
		return p;
	}
	
	console.log(getParam());
	
	
  	$.ajax({
	      type: "post",
	      url: "/messageboard",
	      data: getParam()
	   }).done(function(d){
		   console.log(d)
		   var result = d.result;
		   console.log(result.m_title);
		   $("#li_m_1").text(result.m_title);
		   $("#li_m_2").text(result.id);
		   $("#li_m_3").text(result.m_date);
//		   $("#li_m_4").text(result.m_title); 추천수
		   $(".messageboard_Contents").html(result.m_contents);
	  });
  	
  	$("#messageboard_btn").click(function(e){
  			
  		
  		
//  		alert("추천하셨습니다.");
  		
  	});
  	
});

