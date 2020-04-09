<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/login.css">
</head>
<body>
	
<div class="form-box">
	
	<div class="tab-content">
		
		 <div id="login">
			<h1>Welcome Back!</h1>
			
			<form action="/login" method="get">
				
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