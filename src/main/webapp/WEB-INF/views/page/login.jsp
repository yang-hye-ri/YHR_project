<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/login.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type = "text/javascript" src = "/resources/js/login.js"></script>	
</head>
<body>
	
<div class="form-box">
	
	<div class="tab-content">
		<div class="login_img"></div>
		 <div id="login">
			<h1>Welcome Back!</h1>
			
			<form  method="post" id="formlogin">
				
				<div class="field-wrap">
					<input type="text" id="email2" required autocomplete="off" placeholder="ID">
				</div>
				
				<div class="field-wrap">
					<input type="password" id="pwd2" required autocomplete="off" placeholder="Password">
				</div>
				
				<p class="forgot"><a href="/signup"> sign up?</a></p>
				
				<button type="submit" class="button button-block">Log In</button>
				
			</form>
			
		</div>  
		
	</div>
	
</div>

</body>
</html>