var path ;

$(function(){
	path= $("#path").val();
	showModal();//模态框事件
	eyeBlink();//眨眼睛动画
	nav();//导航栏事件
	show();//个人信息事件
	yesOrNo();//Yes or no 事件
	init();//初始化页面
	sumbit();//提交事件
})

function init(){
	$.ajax({
        type: "POST",
        url: path+"/myinfo/queryinfo",
        dataType: "html",
        success: function(data){
        	var obj = eval("("+data+")");
        	initPage(obj);//初始化页面
        },
        error: function(data){
        	console.log("初始化页面失败");
        }
	});
	
	$.ajax({
        type: "POST",
        url: path+"/v1/visit",
        dataType: "html",
        success: function(data){
        	$("#visitSum").html(data);
        },
        error: function(data){
        	console.log("初始化页面失败");
        }
	});
	
	function initPage(obj){
		$("#myemail").html("邮箱："+obj.email);
		$("#myQQ").html("QQ："+obj.qq);
		$("#slogan").html(obj.slogan);
		$("#yes_email").html("我的邮箱："+obj.email);
	}
}

function sumbit(){
	//yes
	$("#callme_submit").click(function(){
		var name = $("#callme").children("input[name='name']").val();
		var email =$("#callme").children("input[name='email']").val();
		if(name=="" || email==""){
			$("#alert").attr("class","bg-danger").css("display","block").html("【您的称呼】和【邮箱】不能空哦~");
		}else if(!CheckMail(email)){
			$("#alert").attr("class","bg-success").css("display","block").html("邮箱格式不正确");
		}else{
			$.ajax({
		        type: "POST",
		        url: path+"/v1/focus",
		        data:{
		        	"name":name,
		        	"email":email
		        },
		        dataType: "html",
		        success: function(data){
		        	if(data=="ok"){
		        		$("#alert").attr("class","bg-success").css("display","block").html("提交成功！你就是我的伯乐么！QAQ");
		        	}
		        },
		        error: function(data){
		        	console.log("callme请求失败");
		        }
			});
		}
	});
	
	//no
	$("#advise_submit").click(function(){
		var name = $("#advise").children("input[name='name']").val();
		var email =$("#advise").children("input[name='email']").val();
		var advise =$("#advise").children("textarea[name='advise']").val();
		if(advise==""){
			$("#alert").attr("class","bg-danger").css("display","block").html("您的建议是我进步的力量源泉！写一点吧！QAQ");
		}else{
			$.ajax({
		        type: "POST",
		        url: path+"/v1/advise",
		        data:{
		        	"advise":advise,
		        	"name":name,
		        	"email":email
		        },
		        dataType: "html",
		        success: function(data){
		        	if(data=="ok"){
		        		$("#alert").attr("class","bg-success").css("display","block").html("提交成功！虚心，聆听，改变！");
		        	}
		        },
		        error: function(data){
		        	console.log("advise请求失败");
		        }
			});
		}
	});
	
	
	function CheckMail(mail) {
		 var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		 if (filter.test(mail)) 
			 return true;
		 else
			 return false;
	}
}

//Yes or no 事件
function yesOrNo(){
	$("#no").click(function(){
		$("#advise").css("display","block").velocity({opacity: 1},{delay:0, duration:300});
		$("#callme").css("display","none").velocity({opacity: 0},{delay:0, duration:0});
	
	})

	$("#yes").click(function(){
		$("#callme").css("display","block").velocity({opacity: 1},{delay:0, duration:300});
		$("#advise").css("display","none").velocity({opacity: 0},{delay:0, duration:0});
	})
}

/*导航栏*/
function nav(){
	//导航栏-简历
	$("#nav_resume").click(function(){
		showResume();
	})
	$("#nav_skill").click(function(){
		showSkill();
	})
	
	$(".smooth").click(function(){
	    var href = $(this).attr("href");
	    var pos = $(href).offset().top;
	    $("html,body").animate({scrollTop: pos}, 1000);
	    return false;
	});
}

/* 绑定模态框事件 */
function showModal(){
	$("#resume").children("img").click(function(){showResume();})
	$("#skill").children("img").click(function(){showSkill();})
}

function showResume(){
	//更改模态框内容
	$("#myModalLabel").html("更新于：2016-4-30");
	$(".modal-body").html("<img src='"+path+"/resources/img/resume.svg'/>");
	$('#myModal').modal('show');
}

function showSkill(){
	//更改模态框内容
	$("#myModalLabel").html("更新于：2016-4-30");
	$(".modal-body").html("<img src='"+path+"/resources/img/skill.svg'/>");
	$('#myModal').modal('show');
}

/* 个人简历与技能显示 */
function show(){
	$("#mycartoonface").bind("mouseenter",function(){
		happyFace(0,300);

		//个人信息
		$("#resume").children("img").css("display","inline-block").velocity({opacity: 1},{delay:0, duration:300});
		$("#skill").children("img").css("display","inline-block").velocity({opacity: 1},{delay:0, duration:300});
	})

	$("#detail").bind("mouseleave",function(){
		//表情
		normalFace(0,300);

		//个人信息
		$("#resume").children("img").css("display","none").velocity({opacity: 0},{delay:0, duration:300});
		$("#skill").children("img").css("display","none").velocity({opacity: 0},{delay:0, duration:300});
	})

	//unhappy
	$("#no").bind("mouseenter",function(){
		normalFace(0,0);
		unhappyFace(0,0);
	})

	$("#no").bind("mouseleave",function(){
		happyFace(0,300);
	})

	function normalFace(del, dur){
		$("#shy").velocity({opacity: 0},{delay:del, duration:dur});
		$("#lefteyebrow").velocity({y: 121.366},{delay:del, duration:dur});
		$("#righteyebrow").velocity({y: 121.366},{delay:del, duration:dur});
		$("#lefteye-normal").velocity({opacity: 1},{delay:del, duration:dur});
		$("#lefteye-smile").velocity({opacity: 0},{delay:del, duration:dur});
		$("#righteye-normal").velocity({opacity: 1},{delay:del, duration:dur});
		$("#righteye-smile").velocity({opacity: 0},{delay:del, duration:dur});
		$("#mouth-normal").velocity({opacity: 1},{delay:del, duration:dur});
		$("#mouth-smile").velocity({opacity: 0},{delay:del, duration:dur});
		$("#mouth-unhappy").velocity({opacity: 0},{delay:del, duration:dur});
	}
	function happyFace(del, dur){
		//含羞
		$("#shy").velocity({opacity: 0.7},{delay:del, duration:dur});
		//眼睛
		$("#lefteye-normal").velocity({opacity: 0},{delay:del, duration:dur});
		$("#lefteye-smile").velocity({opacity: 1},{delay:del, duration:dur});
		$("#righteye-normal").velocity({opacity: 0},{delay:del, duration:dur});
		$("#righteye-smile").velocity({opacity: 1},{delay:del, duration:dur});
		//嘴角
		$("#mouth-normal").velocity({opacity: 0},{delay:del, duration:dur});
		$("#mouth-smile").velocity({opacity: 1},{delay:del, duration:dur});
		$("#mouth-unhappy").velocity({opacity: 0},{delay:del, duration:dur});
		$("#lefteyebrow").velocity({y: 115},{delay:del, duration:dur});
		$("#righteyebrow").velocity({y: 115},{delay:del, duration:dur});
	}
	function unhappyFace(del, dur){
		$("#mouth-normal").velocity({opacity: 0},{delay:del, duration:dur});
		$("#mouth-smile").velocity({opacity: 0},{delay:del, duration:dur});
		$("#mouth-unhappy").velocity({opacity: 1},{delay:del, duration:dur});
	}
}

/* 眨眼动画 */
function eyeBlink(){
		$leftEye = $('#lefteye');
		$rightEye = $('#righteye');
		$rightEyebrow = $('#righteyebrow');
		$leftEyebrow = $('#lefteyebrow');
		$rightEye.css('transform-origin','50% 50%');
		$leftEye.css('transform-origin','50% 50%');
		var delay = Math.floor(Math.random() * 6000) + 1000;
		function blink(){			
			$rightEye.velocity({scaleY : 0.1},{delay:300, duration:0});			
			$leftEye.velocity({scaleY : 0.1},{delay:300, duration:0});
			$rightEye.velocity({scaleY : 1},{delay:100, duration:0});			
			$leftEye.velocity({scaleY : 1},{delay:100, duration:0});

			$rightEye.velocity({scaleY : 0.1},{delay:100, duration:0});			
			$leftEye.velocity({scaleY : 0.1},{delay:100, duration:0});
			$rightEye.velocity({scaleY : 1},{delay:200, duration:0});			
			$leftEye.velocity({scaleY : 1},{delay:200, duration:0});
	
			var blinking = setTimeout(blink,delay);	
			delay = delay + 100;
		}
		blink();
}