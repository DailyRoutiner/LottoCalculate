<%@page import="sub.controller.UnitPatternController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">
	
	<title>로또 예측 프로그램</title>

	<link rel="shortcut icon" href="assets/images/gt_favicon.png">
	
	<!-- Bootstrap itself -->
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" type="text/css">

	<!-- Custom styles -->
	<link rel="stylesheet" href="assets/css/magister.css">

	<!-- Fonts -->
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href='http://fonts.googleapis.com/css?family=Wire+One' rel='stylesheet' type='text/css'>
</head>

<!-- use "theme-invert" class on bright backgrounds, also try "text-shadows" class -->
<body class="theme-invert">

<nav class="mainmenu">
	<div class="container">
		<div class="dropdown">
			<button type="button" class="navbar-toggle" data-toggle="dropdown"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
			<!-- <a data-toggle="dropdown" href="#">Dropdown trigger</a> -->
			<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
				<li><a href="#head" class="active">로또 예측시스템</a></li>
				<li><a href="#about">프로그램 소개</a></li>
				<li><a href="#themes">개발자들</a></li>
				<li><a href="#contact">Get in touch</a></li>
			</ul>
		</div>
	</div>
</nav>


<!-- Main (Home) section -->
<section class="section" id="head">
	<div class="container">

		<div class="row">
			<div class="col-md-10 col-lg-10 col-md-offset-1 col-lg-offset-1 text-center">	

				<!-- Site Title, your name, HELLO msg, etc. -->
				<h1 class="title">Lotto Predict System</h1>
				<h2 class="subtitle">Try to push button!</h2>
				<form action="endNumber.do">
					<!-- Short introductory (optional) -->
					<h3 class="tagline">
						${lottoList}						

					</h3>

					<!-- Nice place to describe your site in a sentence or two -->
					<p>
						
						<a href="endNumber.do" class="btn btn-default btn-lg">로또 번호 받기</a>
					</p>
				</form>
			</div> <!-- /col -->
		</div> <!-- /row -->
	
	</div>
</section>

<!-- Second (About) section -->
<section class="section" id="about">
	<div class="container">
	
		<h2 class="text-center title">프로젝트 소개</h2>
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/images/p1.png" alt="">
				</div>
			</div>
			<div class="col-sm-8 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/images/p2.png" alt="">
				</div>
			</div>
			<div class="col-sm-8 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/images/p3.png" alt="">
				</div>
			</div>
			<div class="col-sm-8 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/images/p4.png" alt="">
				</div>
			</div>
		</div>
	</div>
</section>

<!-- Third (Works) section -->
<section class="section" id="themes">
	<div class="container">
	
		<h2 class="text-center title">4G 멤버들</h2>
		<p class="lead text-center">
			자랑 스러운 개발자들을 소개합니다 !<br>
		</p>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/screenshots/sshoots.jpg" alt="">
					<div class="caption">
						<h3>최성준</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque doloribus enim vitae nam cupiditate eius at explicabo eaque facere iste.</p>
						
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="thumbnail">
					<img src="assets/screenshots/show1.jpg" alt="">
					<div class="caption">
						<h3>한해준</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque doloribus enim vitae nam cupiditate eius at explicabo eaque facere iste.</p>
					
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-sm-offset-2">
				<div class="thumbnail">
					<img src="assets/screenshots/show2.jpg" alt="">
					<div class="caption">
						<h3>이진희</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque doloribus enim vitae nam cupiditate eius at explicabo eaque facere iste.</p>
						
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="thumbnail">
					<img src="assets/screenshots/IMG_6690.JPG" alt="">
					<div class="caption">
						<h3>멘토님</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Neque doloribus enim vitae nam cupiditate eius at explicabo eaque facere iste.</p>
						
					</div>
				</div>
			</div>

		</div>

	</div>
</section>

<!-- Fourth (Contact) section -->
<section class="section" id="contact">
	<div class="container">
	
		<h2 class="text-center title">Get in touch</h2>

		<div class="row">
			<div class="col-sm-8 col-sm-offset-2 text-center">
				<p class="lead">좀 더 궁금하시다구요? 아래로 연락 주세요!</p>
				<p>Feel free to email me, or drop me a line in Twitter!</p>
				<p><b>ponmons@gmail.com</b><br><br></p>
				<ul class="list-inline list-social">
					<li><a href="https://twitter.com/ponmons" class="btn btn-link"><i class="fa fa-twitter fa-fw"></i> Twitter</a></li>
					<li><a href="https://github.com/ponmons" class="btn btn-link"><i class="fa fa-github fa-fw"></i> Github</a></li>
				</ul>
			</div>
		</div>

	</div>
</section>


<!-- Load js libs only when the page is loaded. -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="assets/js/modernizr.custom.72241.js"></script>
<!-- Custom template scripts -->
<script src="assets/js/magister.js"></script>
</body>
</html>