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
	
	var result;
	
	
  	$.ajax({
	      type: "post",
	      url: "/messageboard",
	      data: getParam()
	   }).done(function(d){
		   console.log(d)
		   result = d.result;
		   console.log(result.m_title);
		   $("#li_m_1").text(result.m_title);
		   $("#li_m_2").text(result.id);
		   $("#li_m_3").text(result.m_date);
		   $("#li_m_4").text(result.m_title); 
		   $(".messageboard_Contents").html(result.m_contents);
	  });
  	
  	
  	
  	//게시글 추천
  	$("#messageboard_btn").click(function(e){
  		
  		$.ajax({
  	      type: "post",
  	      url: "/nomination",
  	      data: result
  	   }).done(function(d){
  		   console.log(d);
  		   if(d.state == 0 ) {
  			 alert("추천 취소 하셨습니다.");
  		   } else if(d.state == 1) {
  			 alert("추천하셨습니다.");
  		   } else {
  			 location.href = "/login";
  		   }
  	  });
  		

// 		alert("추천하셨습니다.");
  		
  		
  	});
  	
  	
  	//게시글 삭제
  	$("#messageBoard_del").click(function(){
  		
  		$.ajax({
    	      type: "post",
    	      url: "/messageboard_del",
    	      data: result
    	   }).done(function(d){
    		   console.log(d);
    		   if (d.state == 1) {
    			   alert("삭제완료.");
////    			   location.href = '/message'
    		   } else {
    			   alert(d.msg);
    		   }
    		  
    	  });

  		
  	});
  	
});

