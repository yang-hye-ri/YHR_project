<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel = "stylesheet" href = "/resources/css/headernav.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<body>
	<div class="logo"></div>
	<!-- 네비 -->
	<nav class="main-menu">
            <ul>
                <li>
                    <a href="/main">
                        <i class="fa fa-home fa-2x"></i>
                        <span class="nav-text">
                            Home
                        </span>
                    </a>
                  
                </li>
                <li class="has-subnav">
                    <a href="/mainmap">
                        <i class="fa fa-laptop fa-2x"></i>
                        <span class="nav-text">
                            Map
                        </span>
                    </a>
                    
                </li>
                <li class="has-subnav">
                    <a href="/gamemap">
                       <i class="fa fa-list fa-2x"></i>
                        <span class="nav-text">
                            Game?
                        </span>
                    </a>
                    
                </li>
                <li class="has-subnav">
                    <a href="/message">
                       <i class="fa fa-folder-open fa-2x"></i>
                        <span class="nav-text">
                            Notice Board
                        </span>
                    </a>
                   
                </li>
                <li>
                    <a href="#">
                       <i class="fa fa-info fa-2x"></i>
                        <span class="nav-text">
                            Documentation
                        </span>
                    </a>
                </li>
            </ul>

            <ul class="logout">
                <li>
                   <a href="/login">
                         <i class="fa fa-power-off fa-2x"></i>
                        <span class="nav-text">
                            Login
                        </span>
                    </a>
                </li>  
            </ul>
        </nav>
	
	
	
</body>
</html>