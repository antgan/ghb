<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="<%=path %>/resources/css/v1/index.css">
	<title>甘海彬</title>
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script type="text/javascript" src="<%=path %>/resources/jquery-2.1.4/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/screen.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/velocity.js"></script>
	<script type="text/javascript" src="<%=path %>/resources/js/v1/v1.js"></script>
</head>
<body>
	<input id="path" type="hidden" value="<%=path %>">
	<div id="warper">
		<div id="header">
			<div id="nav">
				<a href="<%=path %>/v2/site">新版主页</a>
				<a href="http://blog.csdn.net/antgan">博客</a>
				<a href="http://github.com/antgan">GitHub</a>
				<a id="nav_resume" >履历</a>
				<a id="nav_skill" >技能</a>
				<a class="smooth" href="#contact">联系我</a>
			</div>
		</div>
		<div id="detail">
			<div id="mycartoonface">
				<svg id="svg_img" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
		 width="250px" height="300px" viewBox="50 40 110 210" enable-background="new 0 0 214 293" xml:space="preserve">
					<g>
						<!--左脸颊阴影-->
						<g opacity="0.07">
							<polyline points="62.767,148.584 78.139,179.344 82.3,195.516 67.482,184.893 62.767,168.963 	"/>
						</g>
						<!--右脸颊阴影-->
						<g opacity="0.07">
							<polyline points="149.053,150.873 133.682,181.633 129.521,197.805 144.338,187.182 149.053,171.252 	"/>
						</g>
						<!--下巴阴影-->
						<g opacity="0.07">
							<path d="M140.26,189.268c0.008-1.35-0.002-2.699-0.039-4.049c-0.365,0.387-0.732,0.768-1.109,1.143
								c-0.816,0.816-1.662,1.609-2.551,2.35c-0.227,0.191-0.461,0.371-0.691,0.557c-0.262,0.225-0.518,0.453-0.766,0.691
								c-0.354,0.361-0.688,0.742-1.008,1.135c-0.693,0.852-1.355,1.738-2.195,2.453c-0.873,0.74-2.084,1.184-3.133,1.615
								c-1.219,0.498-2.422,0.945-3.477,1.754c-0.859,0.656-1.658,1.385-2.488,2.074c-0.645,0.537-1.307,1.014-2.004,1.412
								c-0.088,0.053-0.172,0.107-0.262,0.158c-0.387,0.213-0.787,0.391-1.197,0.539c-0.615,0.234-1.26,0.412-1.947,0.52
								c-4.99,0.773-10.073-0.125-15.075-0.309c-0.91-0.033-1.818-0.053-2.723-0.08c-0.564-0.008-1.129-0.02-1.693-0.049
								c-0.352-0.018-0.705-0.043-1.057-0.07c-0.79-0.051-1.582-0.119-2.373-0.223c-2.104-0.271-4.321-0.516-6.289-1.363
								c-1.503-0.646-2.766-1.66-4.014-2.701c-1.836-1.531-3.688-3.031-5.447-4.652c-2.949-2.719-5.777-5.582-8.85-8.16v9.975
								l18.519,17.611h34.003l17.781-16.912C140.211,192.879,140.25,191.074,140.26,189.268z"/>
						</g>
						<!--头发-->
						<g>
							<polyline fill="#333333" points="147.339,148.732 147.339,101.652 135.212,91.665 135.212,97.372 135.212,106.645 85.278,91.665 
							85.278,84.532 85.278,100.225 72.438,88.812 63.165,101.652 63.165,146.592 51.752,103.792 59.599,73.119 69.585,78.112 
							69.585,65.985 81.712,70.265 81.712,51.005 95.979,61.705 113.812,48.865 117.379,60.279 117.379,44.585 134.499,68.838 
							134.499,54.572 160.179,90.952 147.339,149.445 "/>
						</g>
						<!--眼镜-->
						<g>
							<rect x="73.151" y="130.898" fill="none" stroke="#333333" stroke-width="3" width="28.534" height="19.975"/>
							<rect x="110.245" y="130.898" fill="none" stroke="#333333" stroke-width="3" width="28.533" height="19.975"/>
							<rect x="101.686" y="138.032" fill="#333333" width="9.986" height="3.567"/>
							<rect x="63.879" y="138.032" fill="#333333" width="9.986" height="3.567"/>
							<rect x="138.778" y="138.032" fill="#333333" width="9.987" height="3.567"/>
						</g>
						<!--左肩-->
						<g>
							<rect x="52.469" y="200.788" transform="matrix(-0.5234 -0.8521 0.8521 -0.5234 -104.0122 383.7964)" fill="#333333" width="5.73" height="40.4"/>
						</g>
						<!--左脖子-->
						<g>
							<rect x="49.446" y="205.744" transform="matrix(-0.1079 -0.9942 0.9942 -0.1079 -127.0333 303.2246)" fill="#333333" width="46.176" height="5.731"/>
						</g>
						<!--右肩-->
						<g>
							<rect x="136.294" y="218.136" transform="matrix(-0.8522 -0.5233 0.5233 -0.8522 174.2068 491.2188)" fill="#333333" width="40.403" height="5.729"/>
						</g>
						<!--右脖子-->
						<g>
							<rect x="136.422" y="185.534" transform="matrix(-0.9941 -0.1081 0.1081 -0.9941 255.215 431.0714)" fill="#333333" width="5.73" height="46.174"/>
						</g>
						<!--左眉毛-->
						<g>
							<rect id="lefteyebrow" x="77.269" y="121.366" fill="#333333" width="20.081" height="5.73"/>
						</g>
						<!--右眉毛-->
						<g>
							<rect id="righteyebrow" x="113.565" y="121.366" fill="#333333" width="21.08" height="5.73"/>
						</g>
						<g>
							<g id="lefteye-normal" style="opacity:1;">
								<!--左眼睫毛-->
								<rect x="80" y="136" fill="#333333" width="14.267" height="3.566"/>
								<!--左眼珠-->
								<circle id="lefteye" fill="#333333" cx="88" cy="139.832" r="4"/>
							</g>
							<g id="lefteye-smile" style="opacity:0;" transform="translate(20,45) scale(0.7)">
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="86.33" y1="127.5" x2="110.834" y2="137.572"/>
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="86.33" y1="146.5" x2="110.834" y2="137.572"/>
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="110.834" y1="137.572" x2="86.33" y2="137.572"/>
							</g>
						</g>
						<g>
							<g id="righteye-normal" style="opacity:1;">
								<!--右眼睫毛-->
								<rect x="117" y="136" fill="#333333" width="14.268" height="3.566"/>
								<!--右眼珠-->
								<circle id="righteye" fill="#333333" cx="124" cy="139.832" r="4" />
							</g>
							<g id="righteye-smile" style="opacity:0;" transform="translate(17,45) scale(0.7)">
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="160.786" y1="127.072" x2="138.139" y2="137.145"/>
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="161.776" y1="146.072" x2="138.139" y2="137.145"/>
								<line fill="none" stroke="#000000" stroke-miterlimit="10" x1="138.139" y1="137.145" x2="160.786" y2="137.145"/>
							</g>
						</g>
						
						
						<!--脸-->
						<g>
							<path fill="#333333" d="M124.179,205.613H87.887L60.222,181.52V83.668l45.718-10.839l45.903,8.075V181.52L124.179,205.613z
								 M90.177,200.365h31.713l24.224-21.098V85.239l-39.987-7.034l-40.174,9.524v91.538L90.177,200.365z"/>
						</g>
						<!--右耳朵-->
						<g>
							<path fill="#333333" d="M146.113,179.004v-38.982h16.778v28.09L146.113,179.004z M151.843,145.751v22.7l5.318-3.453v-19.247
								H151.843z"/>
						</g>
						<!--左耳朵-->
						<g>
							<path fill="#333333" d="M65.952,179.004l-16.777-10.893v-28.091h16.777V179.004z M54.905,165l5.316,3.453v-22.702h-5.316V165z"/>
						</g>
						<!--衣服领子-->
						<g>
							<path fill="#333333" d="M106.056,238.838c-13.895,0-25.041-1.572-33.137-4.674c-9.389-3.598-14.875-9.277-16.307-16.883
								l5.631-1.061c2.63,13.959,25.277,16.889,43.813,16.889c26.315,0,41.005-5.451,43.664-16.201l5.563,1.375
								c-1.814,7.334-7.429,12.771-16.688,16.166C130.644,237.361,119.696,238.838,106.056,238.838z"/>
						</g>
						<!--嘴角-->
						<g>
							<g id="mouth-normal" style="opacity:1">
								<path fill="none" stroke="#333333" stroke-width="2" stroke-miterlimit="10" d="M89.347,174.497c0.451,6.55,15.575,12.46,29.441,11.505"/>
							</g>
							<g id="mouth-smile" transform="translate(17,62) scale(0.5)" style="opacity:0" >
								<path fill="none" stroke="#000000" stroke-miterlimit="10" d="M210.113,240.521c0,0.912-6.436,1.649-14.387,1.649"/>
								<path fill="none" stroke="#000000" stroke-width="2" stroke-miterlimit="10" d="M141.77,229.532c0-2.939,16.318-5.319,36.484-5.319"
									/>
								<path fill="none" stroke="#000000" stroke-width="2" stroke-miterlimit="10" d="M213.027,229.532c0-2.939-15.553-5.319-34.773-5.319
									"/>
								<path fill="none" stroke="#000000" stroke-width="2" stroke-miterlimit="10" d="M141.77,229.532
									c0,16.377,17.354,29.629,38.803,29.629"/>
								<path fill="none" stroke="#000000" stroke-width="2" stroke-miterlimit="10" d="M213.027,229.532
									c0,16.377-14.516,29.629-32.455,29.629"/>
								<path fill="none" stroke="#000000" stroke-miterlimit="10" d="M144.596,240.664c0,0.912,19.07,1.649,42.639,1.649"/>
							</g>
							<g id="mouth-unhappy" transform="translate(18,62) scale(0.5)" style="opacity:0">
								<path fill="none" stroke="#333333" stroke-miterlimit="10" stroke-width="2" d="M153.875,248.72c0-12.144,9.491-21.97,21.221-21.97"/>
			 					<path fill="none" stroke="#333333" stroke-miterlimit="10" stroke-width="2" d="M194.697,248.574c0-12.063-8.768-21.824-19.602-21.824"/>
							</g>
						</g>
						<!--害羞-->
						<g id="shy" style="opacity:0"  transform="translate(2,0)">
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="88" y1="158" x2="85" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="95" y1="158" x2="92" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="101" y1="158" x2="98" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="106" y1="158" x2="103" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="111" y1="158" x2="108" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="117" y1="158" x2="113" y2="170"/>
							<line fill="none" stroke="#F97AE7" stroke-width="2" stroke-miterlimit="10" x1="123" y1="158" x2="120" y2="170"/>
						</g>
					</g>
				</svg> 
				<div id="info">
				<!-- <span style="font-weight:bold; display:block; font-size:1.5em; padding:2%;">现实理想主义行动派</span> -->
				<p style="padding:2%;">迄今为止</p>
				<p style="padding:2%;">共有<span id="visitSum"></span>小伙伴路过</p>
				<p>你，是带我走向人生巅峰的那个人吗？</p>
				<p style="font-size:2em; margin:5%;">
					<span id="yes" class="glyphicon glyphicon-ok" aria-hidden="true"></span>
					<span id="no" class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					<div id="advise" style="display:none; opacity:0; ">
						<textarea name="advise" style="background-color: #333333; color:#fff;" class="form-control" rows="4" placeholder="谢谢您！曾经关注过我，如果可以，可以写下您的宝贵建议吗？如人才需求，或者对我的小建议~"></textarea>
						<input name="name" style="background-color: #333333; color:#fff;" type="text" class="form-control" placeholder="您的称呼（选填）">
						<input name="email" style="background-color: #333333; color:#fff;" type="email" class="form-control" placeholder="您的邮箱（选填）">
						<button id="advise_submit" style="width:100%; background-color: #333333; color:#fff;" class="btn btn-default">提交</button>
					</div>
					<div id="callme" style="display:none; opacity:0; " >
						<div style="background-color:#FFB24B; color:#fff;" class="alert" role="alert">wow！阁下很有眼光嗬
						<p id="yes_email"></p></div>
						<input name="name" type="text" class="form-control" placeholder="您的称呼">
						<input name="email" type="email" class="form-control" placeholder="您的邮箱">
						<button id="callme_submit" style="width:100%;background-color:#FFB24B; color:#fff;" class="btn btn-default">提交</button>
					</div>
					<p id="alert" class="bg-danger" style="padding:10px; display:none;"></p>
				</p>
			</div>
			</div>
			<div id="resume" >
				<img src="<%=path %>/resources/img/resume.svg" style="opacity:0; display:none;" />
			</div>
			<div id="skill" >
				<img src="<%=path %>/resources/img/skill.svg" style="opacity:0; display:none;"/>
			</div>
		</div>

		<div id="contact">
			<div id="myinfo">
				<table class="table" style="width:25%; margin:0 auto; text-align:left; font-size:1.7em;">	
					<tr>
						<td><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span></td>
						<td id="myemail"></td>
					</tr>
					<tr>
						<td><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></td>
						<td id="myQQ"></td>
					</tr>
				</table>
				<h4 id="slogan"></h4>
			</div>
		</div>

		<div id="footer">
			<span>UpdateTime 2016-6-7<br>Copyright © 2016 antgan</span>
		</div>
		
		<!--模态框-->
		<div class="modal fade" id="myModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel" style="text-align:center;"></h4>
		      </div>
		      <div class="modal-body">
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		      </div>
		    </div>
		  </div>
		</div>
	</div>
</body>
</html>