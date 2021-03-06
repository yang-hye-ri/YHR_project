<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "/resources/css/signup.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type = "text/javascript" src = "/resources/js/signup.js"></script>
</head>
<body>
<!-- form -->
<div class="form-box">
	
	<div class="tab-content">
		<div class="signup_img"></div>
		<div id="signup">
			<h1>Sign Up</h1>
			
			<form action="/signup" method="post" id="formsignup"> 
				
				<div class="top-row">
					<div class="field-wrap">
						<input type="text" id="first-name" required autocomplete="off" placeholder="ID">
					</div>
					
					<div class="field-wrap">
						
					</div>
				</div>
				
				<div class="field-wrap">
					<input type="email" id="email" required autocomplete="off" placeholder="Email Address">
				</div>
				
				<div class="field-wrap">
					<input type="password" id="pwd" required autocomplete="off" placeholder="Set A Password">
				</div>
				
				<button type="submit" class="button button-block">Get Started</button>
				
			</form> 
			
		</div>
		
	</div>
	
</div>
</body>
</html>