<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@include file="common/taglib.jsp" %>
<%@include file="common/head.jsp" %>
<!DOCTYPE html>
<html class="no-js" lang="zh">
<head>
<title>甘海彬</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path %>/resources/css/v2/main.css">
<link rel="stylesheet" href="<%=path %>/resources/css/v2/timeline.css" />
<script src="<%=path %>/resources/js/v2/func.js"></script>

</head>
<body class="bg-fixed bg-1">
	<input id="path" type="hidden" value="<%=path %>">
	<div class="main-container">
		<div class="main wrapper clearfix">
			<header id="header">
				<div id="logo" style="display: none;">
					<h2>${myinfo.realName}</h2>
					<h4>${myinfo.slogan}</h4>
				</div>
			</header>
			<div id="tab-container" class="tab-container">
				<!-- Tab List -->
				<ul class='etabs'>
					<li class='tab' id="tab-about"><a href="#about"><span>关于我</span></a>
					</li>
					<li class='tab'><a href="#resume"><span>履历</span></a></li>
					<li class='tab'><a href="#timeline"><span>时间轴</span></a></li>
					<li class='tab'><a href="#contact"><span>联系我</span></a></li>
				</ul>
				<div id="tab-data-wrap">
					<div id="about">
						<section class="clearfix">
							<div class="g2">
								<div class="photo">
									<img src="${myinfo.imgUrl}" width="200px"
										height="200px" alt="甘海彬">
								</div>
								<div class="info">
									<h2>${myinfo.realName}</h2>
									<h4>${myinfo.school} | ${myinfo.grade} | ${myinfo.major}</h4>
									<p>
										${myinfo.introduce}
									</p>
								</div>
							</div>
							<div class="g1">
								<div class="main-links sidebar">
									<ul>
										<li><a id="li-resume" href="#resume">查看我的履历</a></li>
										<li><a id="li-timeline" href="#timeline">我最近在做什么</a></li>
										<li><a id="li-contact" href="#contact">联系我</a></li>
									</ul>
								</div>
							</div>
							<div class="break"></div>
							<div class="contact-info">
								<div class="g1">
									<div class="item-box clearfix">
										<div class="item-data">
											<h3>
												<a href="<%=path %>/v1/site">V1 版本</a>
											</h3>
											<p>个人主页V1版本，因为简单，所以快乐！</p>
										</div>
									</div>
								</div>
								<div class="g1">
									<div class="item-box clearfix">
										<div class="item-data">
											<h3>
												<a href="http://blog.csdn.net/antgan">CSDN博客</a>
											</h3>
											<p>阅读。分享。专研。收获</p>
										</div>
									</div>
								</div>
								<div class="g1">
									<div class="item-box clearfix">
										<div class="item-data">
											<h3>
												<a href="http://github.com/antgan">GitHub</a>
											</h3>
											<p>学习。进步。记录。快乐</p>
										</div>
									</div>
								</div>
							</div>
						</section>
					</div>
					<div id="resume" style="display: none;">
						<section class="clearfix">
							<div id="resume_area" class="g2">
							</div>
							<div class="g1">
								<div id="skill_area" class="sidebar">
								</div>
							</div>
						</section>
					</div>
					<div id="timeline" style="display: none;">
						<section class="clearfix">
							<section id="cd-timeline" class="cd-container">
								
							</section>
						</section>
					</div>
					<div id="contact" style="display: none;">
						<section class="clearfix">
							<div class="g1">
								<div class="sny-icon-box">
									<div class="sny-icon">
										<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
									</div>
									<div class="sny-icon-content">
										<h4>电子邮箱</h4>
										<h4>${myinfo.email}</h4>
									</div>
								</div>
							</div>
							<div class="g1">
								<div class="sny-icon-box">
									<div class="sny-icon">
										<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
									</div>
									<div class="sny-icon-content">
										<h4>QQ</h4>
										<h4>${myinfo.qq }</h4>
									</div>
								</div>
							</div>
							<div class="g1">
								<div class="sny-icon-box">
									<div class="sny-icon">
										<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
									</div>
									<div class="sny-icon-content">
										<h4>梦想</h4>
										<h4>${myinfo.dream } </h4>
									</div>
								</div>
							</div>
							<div class="break"></div>

						</section>
					</div>
				</div>
			</div>
		</div>
		<!-- #main -->
	</div>
	<!-- #main-container -->
</body>
<script src="<%=path %>/resources/js/v2/v2.js"></script>
<script src="<%=path %>/resources/js/v2/main.js"></script>
</html>
