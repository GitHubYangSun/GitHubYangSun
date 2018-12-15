<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/context/begin-tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/context/css-tags.jsp" />
<title>Alias Colorlib &mdash; One Page Template for Personal/CV
	Website</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
<link rel="stylesheet" href="<%=basePath%>/static/css/music/animate.css">
<link rel="stylesheet"
	href="<%=basePath%>/static/css/music/flexslider.css">
<link rel="stylesheet" href="fonts/icomoon/style.css">

<link rel="stylesheet"
	href="<%=basePath%>/static/css/music/bootstrap.css">
<link rel="stylesheet" href="<%=basePath%>/static/css/music/style.css">

<link
	href="https://fonts.googleapis.com/css?family=Nunito+Sans:200,300,400,700"
	rel="stylesheet">
<style type="text/css">
.waveform {
    max-width: 800px;
    height: 150px;
    width:80%;
    margin: auto;   

}
.thumb .waveform{
	 font-style: italic;
    font-weight: lighter;
     visibility:hidden;
     position: absolute;
    margin-top: 63%;
    display: inline-block;
}
.thumb:hover .waveform{
	visibility:visible;
}

</style>

</head>


<body data-spy="scroll" data-target="#pb-navbar" data-offset="200">



	<nav class="navbar navbar-expand-lg site-navbar navbar-light bg-light"
		id="pb-navbar">

		<div class="container">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarsExample09" aria-controls="navbarsExample09"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>


			<div class="collapse navbar-collapse justify-content-md-center"
				id="navbarsExample09">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="#section-home">首页</a></li>
					<li class="nav-item"><a class="nav-link" href="#section-about">关于我们</a></li>

					<li class="nav-item"><a class="nav-link"
						href="#section-portfolio">作品试听</a></li>

					<li class="nav-item"><a class="nav-link" href="#section-blog">消费指南</a></li>
					<li class="nav-item"><a class="nav-link"
						href="#section-contact">联系我们</a></li>
				</ul>
			</div>
		</div>
	</nav>




	<section class="site-hero"
		style="background-image: url(/lorchard-api/static/images/15.jpg);"
		id="section-home" data-stellar-background-ratio="0.5">
		<div class="container">
			<div class="row intro-text align-items-center justify-content-center">
				<div class="col-md-10 text-center">
					<h1 class="site-heading site-animate">
						杭州畅悦 <strong>为专注而生</strong>
					</h1>
					<p class="lead site-subheading mb-4 site-animate">这里能给你最专业的录制，音乐单曲定制，企业歌，翻唱，情侣纪念...</p>
					<p>
						<a href="#section-about"
							class="smoothscroll btn btn-primary px-4 py-3">关于我们</a>
					</p>
				</div>
			</div>
		</div>
	</section>
	<!-- section -->


	<section class="site-section" id="section-about">
		<div class="container">
			<div class="row mb-5 align-items-center">
				<div class="col-lg-7 pr-lg-5 mb-5 mb-lg-0">
					<img src="/lorchard-api/static/images/02.jpg"
						alt="Image placeholder" class="img-fluid">
				</div>
				<div class="col-lg-5 pl-lg-5">
					<div class="section-heading">
						<h2>
							关于 <strong>我</strong>
						</h2>
					</div>
					<p class="lead">公司简介XXX</p>
					<p class="mb-5  ">主营XXX</p>

					<p>
						<a href="#section-contact"
							class="btn btn-primary px-4 py-2 btn-sm smoothscroll">预约录制</a>

					</p>
				</div>
			</div>

			<div class="row pt-5">
				<div class="col-md-3 mb-3">
					<div class="section-heading">
						<h2>
							您的 <strong>专属录制服务</strong>
						</h2>
					</div>
				</div>
				<div class="col-md-9">
					<div class="skill">
						<h3>单曲定制</h3>
						<div class="progress">
							<div class="progress-bar" role="progressbar" style="width: 95%"
								aria-valuenow="95" aria-valuemin="0" aria-valuemax="100">
								<span>95%</span>
							</div>
						</div>
					</div>

					<div class="skill">
						<h3>企业歌曲定制</h3>
						<div class="progress">
							<div class="progress-bar" role="progressbar" style="width: 98%"
								aria-valuenow="98" aria-valuemin="0" aria-valuemax="100">
								<span>98%</span>
							</div>
						</div>
					</div>

					<div class="skill">
						<h3>录制翻唱</h3>
						<div class="progress">
							<div class="progress-bar" role="progressbar" style="width: 97%"
								aria-valuenow="97" aria-valuemin="0" aria-valuemax="100">
								<span>97%</span>
							</div>
						</div>
					</div>

					<div class="skill">
						<h3>音频工程</h3>
						<div class="progress">
							<div class="progress-bar" role="progressbar" style="width: 88%"
								aria-valuenow="88" aria-valuemin="0" aria-valuemax="100">
								<span>88%</span>
							</div>
						</div>
					</div>

					<div class="skill">
						<h3>配音</h3>
						<div class="progress">
							<div class="progress-bar" role="progressbar" style="width: 92%"
								aria-valuenow="92" aria-valuemin="0" aria-valuemax="100">
								<span>92%</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="site-section bg-light">
		<div class="container">
			<div class="row mb-5">
				<div class="col-md-12">
					<div class="section-heading text-center">
						<h2>
							录音 <strong>环境</strong>
						</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">

					<div class="block-47 d-flex mb-5">
						<div class="section-heading text-center">
							<h2>
								<strong>标准</strong>棚
							</h2>
						</div>
						<blockquote class="block-47-quote">
							<img src="/lorchard-api/static/images/08.jpg"
								alt="Image placeholder" class="img-fluid">
						</blockquote>
					</div>

				</div>
				<div class="col-md-6">

					<div class="block-47 d-flex mb-5">
						<div class="section-heading text-center">
							<h2>
								<strong>专业</strong>棚
							</h2>
						</div>
						<blockquote class="block-47-quote">
							<img src="/lorchard-api/static/images/06.jpg"
								alt="Image placeholder" class="img-fluid">
						</blockquote>
					</div>

				</div>

				<div class="col-md-6">

					<div class="block-47 d-flex mb-5">
						<div class="section-heading text-center">
							<h2>
								<strong>休息</strong>区
							</h2>
						</div>
						<blockquote class="block-47-quote">
							<img src="/lorchard-api/static/images/04.jpg"
								alt="Image placeholder" class="img-fluid">
						</blockquote>
					</div>

				</div>
				<div class="col-md-6">

					<div class="block-47 d-flex mb-5">
						<div class="section-heading text-center">
							<h2>
								<strong>工作</strong>区
							</h2>
						</div>
						<blockquote class="block-47-quote">
							<img src="/lorchard-api/static/images/07.jpg"
								alt="Image placeholder" class="img-fluid">
						</blockquote>
					</div>

				</div>

			</div>
		</div>
	</section>







	<section class="site-section" id="section-portfolio">
		<div class="container">
			<div class="row">
				<div class="section-heading text-center col-md-12">
					<h2>
						作品 <strong>试听</strong>
					</h2>
				</div>
			</div>
			<div class="filters">
				<ul>
					<li class="active" data-filter="*">翻唱精品</li>
					<!-- <li data-filter=".packaging">女生翻唱</li>
                            <li data-filter=".mockup">定制单曲</li>
                            <li data-filter=".typography">企业歌</li>
                            <li data-filter=".photography">唯美对唱</li> -->
				</ul>
			</div>

			<div class="filters-content">
				<div class="row grid">
					<div class="single-portfolio col-sm-4 all mockup">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								<!-- 音乐播放器 -->
								<div id="waveform" class="waveform"></div>

								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!--  <a href="images/p1.jpg" class="img-pop-up">  
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="/lorchard-api/static/images/01.jpg" alt="">
									</div>
								</div>
							</a>-->
						</div>
						<div class="p-inner">
							<h4>夏天的风</h4>
							<div class="cat">精修</div>
						</div>
					</div>
					<div class="single-portfolio col-sm-4 all mockup">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								
								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!--  <a href="images/p2.jpg" class="img-pop-up">
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="images/preview.png" alt="">
									</div>
								</div>
							</a>-->
						</div>
						<div class="p-inner">
							<h4>逆战</h4>
							<div class="cat">精修</div>
						</div>
					</div>
					<div class="single-portfolio col-sm-4 all packaging">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!--  		<a href="images/p3.jpg" class="img-pop-up">
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="images/preview.png" alt="">
									</div>
								</div>
							</a>-->

						</div>
						<div class="p-inner">
							<h4>念诗之王</h4>
							<div class="cat">精修</div>
						</div>
					</div>
					<div class="single-portfolio col-sm-4 all packaging">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!-- <a href="images/p4.jpg" class="img-pop-up">
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="images/preview.png" alt="">
									</div>
								</div>
							</a>-->
						</div>
						<div class="p-inner">
							<h4>年少有为</h4>
							<div class="cat">精修</div>
						</div>
					</div>
					<div class="single-portfolio col-sm-4 all typography">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!--  	<a href="images/p5.jpg" class="img-pop-up">
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="images/preview.png" alt="">
									</div>
								</div>
							</a>-->
						</div>
						<div class="p-inner">
							<h4>王妃</h4>
							<div class="cat">精修</div>
						</div>
					</div>
					<div class="single-portfolio col-sm-4 all photography">
						<div class="relative">
							<div class="thumb">
								<div class="overlay overlay-bg"></div>
								<img class="image img-fluid"
									src="/lorchard-api/static/images/01.jpg" alt="">
							</div>
							<!--  	<a href="images/p6.jpg" class="img-pop-up">
								<div class="middle">
									<div class="text align-self-center d-flex">
										<img src="images/preview.png" alt="">
									</div>
								</div>
							</a>-->
						</div>
						<div class="p-inner">
							<h4>彩虹</h4>
							<div class="cat">精修</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- .section -->

	<!-- .section -->

	<section class="site-section" id="section-blog">
		<div class="container">
			<div class="row">
				<div class="col-md-12 mb-5">
					<div class="section-heading text-center">
						<h2>
							<strong>消费</strong>指南
						</h2>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-6 col-lg-4 mb-4">
					<div class="blog-entry">
						<a href="#"><img src="/lorchard-api/static/images/11.jpg"
							alt="Image placeholder" class="img-fluid"></a>
						<div class="blog-entry-text">
							<h3>
								<a href="#">翻唱精修</a>
							</h3>
							<p class="mb-4">给自己做一个纪念，放在朋友圈提升逼格</p>

							<!--   <div class="meta">
                  <a href="#"><span class="icon-calendar"></span></a>
                  <a href="#"><span class="icon-bubble"></span></a>
                </div>-->
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-lg-4 mb-4">
					<div class="blog-entry">
						<a href="#"><img src="/lorchard-api/static/images/11.jpg"
							alt="Image placeholder" class="img-fluid"></a>
						<div class="blog-entry-text">
							<h3>
								<a href="#">单曲定制</a>
							</h3>
							<p class="mb-4">成为广为人知的歌手的第一步</p>

							<!--  <div class="meta">
                  <a href="#"><span class="icon-calendar"></span></a>
                  <a href="#"><span class="icon-bubble"></span></a>
                </div> -->
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-lg-4 mb-4">
					<div class="blog-entry">
						<a href="#"><img src="/lorchard-api/static/images/10.jpg"
							alt="Image placeholder" class="img-fluid"></a>
						<div class="blog-entry-text">
							<h3>
								<a href="#">企业歌曲定制</a>
							</h3>
							<p class="mb-4">打造自己的企业文化的第一步</p>

							<!--  <div class="meta">
                  <a href="#"><span class="icon-calendar"></span></a>
                  <a href="#"><span class="icon-bubble"></span></a>
                </div>-->
						</div>
					</div>
				</div>

			</div>
		</div>
	</section>

	<section class="site-section bg-light" id="section-contact">
		<div class="container">
			<div class="row">
				<div class="col-md-12 mb-5">
					<div class="section-heading text-center">
						<h2>
							<strong>联系</strong> 我们
						</h2>
					</div>
				</div>

				<div class="col-md-7 mb-5 mb-md-0">
					<form action="<%=basePath%>/message" method="post"  class="site-form">
						<h3 class="mb-5">您的联系方式</h3>
						<div class="form-group">
							<input type="text" name="name" class="form-control px-3 py-4"
								placeholder="姓名">
						</div>
						<div class="form-group">
							<input type="email" name="email" class="form-control px-3 py-4"
								placeholder="邮箱">
						</div>
						<div class="form-group">
							<input type="tel" name="mobile" class="form-control px-3 py-4"
								placeholder="电话">
						</div>
						<div class="form-group mb-5">
							<textarea class="form-control px-3 py-4" name="content" cols="30" rows="10"
								placeholder="您要对我们说的..."></textarea>
						</div>
						<div class="form-group">
							<input type="submit" class="btn btn-primary  px-4 py-3"
								value="发信息">
						</div>
					</form>
				</div>
				<div class="col-md-5 pl-md-5">
					<h3 class="mb-5">联系方式</h3>
					<ul class="site-contact-details">
						<li><span class="text-uppercase">邮箱</span> site@gmail.com</li>
						<li><span class="text-uppercase">联系电话</span> +30 976 1382
							9921</li>
						<!--  <li>
                <span class="text-uppercase">Fax</span>
                +30 976 1382 9922
              </li>-->
						<li><span class="text-uppercase">地址</span> 浙江省 <br> 杭州市
							<br> XX大厦XX楼XX号</li>
					</ul>
				</div>
			</div>
		</div>
	</section>







	<script src="<%=basePath%>/static/js/music/jquery.min.js"></script>
	<script src="<%=basePath%>/static/js/music/popper.min.js"></script>
	<script src="<%=basePath%>/static/js/music/bootstrap.min.js"></script>

	<script src="<%=basePath%>/static/js/music/jquery.easing.1.3.js"></script>
	<script src="<%=basePath%>/static/js/music/jquery.stellar.min.js"></script>
	<script src="<%=basePath%>/static/js/music/jquery.waypoints.min.js"></script>

	<script
		src="https://unpkg.com/isotope-layout@3/dist/isotope.pkgd.min.js"></script>
	<script src="https://unpkg.com/imagesloaded@4/imagesloaded.pkgd.min.js"></script>
	<script src="<%=basePath%>/static/js/music/custom.js"></script>
	<script src="https://unpkg.com/wavesurfer.js"></script>
	
	<script type="text/javascript" src="<%=basePath%>/static/js/yushu/index.js"></script>


</body>
</html>