<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<link rel = "stylesheet" href = "/resources/css/messageeditor.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src = "/ckeditor/ckeditor.js"></script>
<title>messageEditor</title>
</head>
<body>
	<div class="messageE_div">
	<input type="text" placeholder="제목을 입력하세요.">
	<textarea id="editor1" name="editor1"></textarea>
	<div class="messageE_btn_div">
		<button type="button" onclick="location.href = '/message'" class="messageE_btn">등록</button>
		<!-- <button type="button" onclick="setText()" class="messageE_btn">수정</button> -->
	</div>
	<!-- <div id="txt" style="color: #fff">희희</div> -->
		<script type="text/javascript">
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
	    CKEDITOR.editorConfig = function( config ) {

	        config.language = 'ko';
	        config.skin = 'moono-dark';

	    };
		</script>
		
		
		
	</div>
</body>
</html>