<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" >
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>${title}</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	</head>
<body>

	<!-- Header부분 -->
	<c:if test="${page != 'main' && page != 'signup' && page != 'login'}">
		<header>
			<c:import url="/layout/header" />
		</header>
	</c:if>
	
	
	<!-- 본문 -->
	<c:if test="${page != 'main' && page != 'signup' && page != 'login'}">
		<section class="section_div">
			<c:import url="/view/${page}" />
		</section>
	</c:if>
	<c:if test="${page == 'main' || page == 'login' || page == 'signup'}">
		<c:import url="/view/${page}" />
	</c:if>
	
 	<!-- Footer부분 -->
 	<c:if test="${page != 'main' && page != 'signup' && page != 'login'}">
	 	<footer>
			<c:import url="/layout/footer" />
		</footer>
	</c:if>
	
</body>
</html>