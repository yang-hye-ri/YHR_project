$(document).ready(function() {

	
  	$.ajax({
	      type: "post",
	      url: "/message"
	   }).done(function(d){
	      var data = d.result;
	      console.log(d);
	      $("#messagelist").empty();
	      for(var i = 0; i < data.length; i++){
	    	  
	    	  var html = ` 
	                 	<ul class="message_ul" data-num="${data[i].no}">
							<li class="li_m_1">${data[i].m_title}</li>
							<li class="li_m_2">${data[i].id}</li>
							<li class="li_m_3">${data[i].m_date}</li>
							<li class="li_m_3">100</li>
						</ul>
	                  `;
	    	  
			 if(data[i].m_delYN == 'N') {
				 $("#messagelist").append(html);
			 } 
	      }
	      ClickEvent();
	   });
  	
	var ClickEvent = function() {
		$(".message_ul").click(function(){
			var num = $(this).attr("data-num");
			console.log(num);
			location.href = "/messageboard?no=" + num;
		});
	}
	
	
	
});

