<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/mainMap.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src = "/ckeditor/ckeditor.js"></script>
<title>messageEditor</title>
</head>
<body>
	<div class="mainMap_div">
	<textarea id="editor1" name="editor1"></textarea>
	<button type="button" onclick="getText()">가져오기</button>
	<button type="button" onclick="setText()">수정</button>
	<div id="txt" style="color: #fff">희희</div>
		<script type="text/javascript">
		var config = { 
						resize_enabled : false,
						height: 600
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
		</script>
		
		
		
	</div>
</body>
</html>