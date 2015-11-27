<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="robots" content="index, follow">
        <title>Dlapak - General Listing Template</title>
        <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Open+Sans:regular,700,600&amp;latin" type="text/css" />
        <!-- Essential styles -->
        <link rel="stylesheet" href="${initParam.root}assets/bootstrap/css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="${initParam.root}assets/plugins/font-awesome/css/font-awesome.css" type="text/css"> 

        <!-- Dlapak styles -->
        <link id="theme_style" type="text/css" href="${initParam.root}assets/css/style1.css" rel="stylesheet" media="screen">


        <!-- Favicon -->
        <link href="${initParam.root}assets/img/favicon.png" rel="icon" type="image/png">

        <!-- Assets -->
        <link rel="stylesheet" href="${initParam.root}assets/plugins/owl-carousel/owl.carousel.css">
        <link rel="stylesheet" href="${initParam.root}assets/plugins/owl-carousel/owl.theme.css">

        <!-- JS Library -->
        <script src="${initParam.root}assets/js/jquery.js"></script>

    </head>
<body>
	<div class="wrapper">
		<div id="container">
			<div id="header">
				<tiles:insertAttribute name="header" />
			</div>
			<div id="left">
				<tiles:insertAttribute name="hero" />
			</div>

			<section class="main">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-sm-8">
						<tiles:insertAttribute name="homegroup" />
					</div>

					<div class="col-md-4 col-sm-4">
						<tiles:insertAttribute name="homelogin" />
						 <div class="banner-widget">
                                <img src="http://placehold.it/600x275" alt="banner" class="img-responsive">
						 </div>
					</div>
				</div>
			</div>
			</section>
			<div id="counter">
				<tiles:insertAttribute name="counter" />
			</div>
			<div id="footer">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>
	<!-- Essentials -->
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/plugins/owl-carousel/owl.carousel.js"></script>
	<script src="assets/plugins/counter/jquery.countTo.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {

			// ===========Featured Owl Carousel============
			if ($(".owl-carousel-featured").length > 0) {
				$(".owl-carousel-featured").owlCarousel({
					items : 3,
					lazyLoad : true,
					pagination : true,
					autoPlay : 5000,
					stopOnHover : true
				});
			}

			// ==================Counter====================
			$('.item-count').countTo({
				formatter : function(value, options) {
					return value.toFixed(options.decimals);
				},
				onUpdate : function(value) {
					console.debug(this);
				},
				onComplete : function(value) {
					console.debug(this);
				}
			});
		});
	</script>
</body>
</html>