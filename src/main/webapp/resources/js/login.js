$(document).ready(function() {
	
	$("#formlogin").submit(function(e){
		e.preventDefault();
		var params = {
				id: $("#email2").val(),
				pwd: $("#pwd2").val()
		};
		console.log(params);
		$.ajax({
			type:"POST",
			url:"/login",
			data: params
		}).done(function(d){
			console.log(d);
			if(d) {
				alert("로그인 성공!");
				location.href = "/mainmap";
			} else {
				alert("로그인 실패");
			}
		});
	});
	
	
	
});

