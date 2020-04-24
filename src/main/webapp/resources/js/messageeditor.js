$(document).ready(function() {
	
	
	var config = { 
			resize_enabled : false,
			height: 450
		 };

	CKEDITOR.replace( 'editor1', config);
	function getText(){
	var txt = CKEDITOR.instances.editor1.getData();
	document.getElementById("txt").innerHTML = txt;
	}
	function setText(){
	var txt = document.getElementById("txt").innerText;
	CKEDITOR.instances.editor1.setData();
	}
	CKEDITOR.editorConfig = function(config) {
	config.language = 'ko';
	config.skin = 'moono-dark';
	};
	
	
	$("#messageeditor_form").submit(function(e){
		e.preventDefault();
		
		var data = CKEDITOR.instances["editor1"].getData();
		if (data == "") {
			alert("내용을 입력해 주세요.");
			return;
		}
		
		data = data.replace("&nbsp;", " ");
		
		var params = {
						m_title:     $("#title").val(),
						m_contents:  data 
					 };
		console.log(params);
		
		$.ajax({
			type : "POST",
			url : "/messageeditor",
			data : params
		}).done(function(d) {
//			console.log(d);
			if(d.result > 0 && data != "") {
				alert("작성 완료!");
				location.href = "/message";
			} else {
				alert("입력 실패");
				location.href = "/messageeditor";
			}
			
		});
	});
	
	


});

