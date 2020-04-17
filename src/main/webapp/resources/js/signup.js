$(document).ready(function() {

	
	$("#formsignup").submit(function(e){
		e.preventDefault();
		var params = {
				id :	 	$("#first-name").val(),
				email :		$("#email").val(),
				pwd :		$("#pwd").val()
		};
		console.log(params);
		$.ajax({
			type:"POST",
			url:"/signup",
			data: params
		}).done(function(d){
			console.log(d);
			if(d) {
				alert("회원가입 성공!");
				location.href = "/login";
			} else {
				alert("회원가입 실패");
			}
		});
	});
	
	
	
	
	
});

