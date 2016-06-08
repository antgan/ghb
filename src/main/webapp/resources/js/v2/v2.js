/**
 * v2版主页 对象
 */
var v2 = {
	base : $("#path").val(),
	URL : {
		resume : function(){
			return v2.base+"/v2/queryResume";
		},
		skill : function(){
			return v2.base + "/v2/querySkill";
		},
		timeline : function(){
			return v2.base + "/v2/queryTimeline";
		}
		
	},
	//初始化简历主体
	initResume : function(offset, limit){
		$.get(v2.URL.resume(),{"offset":offset,"limit":limit},function(data){
			var titles = new Array();
			for(var i = 0; i < data.length; i++)
				titles.push(data[i].subtitle);
			titles.sort();//排序
			$.unique(titles);//去重
			//结构结构
			$("#resume_area").html(function(){
				var str = "";
				for(var i = 0; i < titles.length;i++){
					str+="<h3>"+titles[i]+"</h3><ul class='no-list work' title='"+titles[i]+"'></ul>";
				}
				return str;
			});
			//写入内容
			for(var i = 0; i < data.length; i++){
				$(".work[title='"+data[i].subtitle+"']").append(function(){
					var str = "<li><h5>"+data[i].title+"</h5>"+
					"<span class='label "+v2.color("label", data[i].duringColor)+"'>"+data[i].during+"</span>"+
					"<p>"+data[i].description+"</p></li>";
					return str;
				});
			}
		});
	},
	//初始化技能
	initSkill : function(offset, limit){
		$.get(v2.URL.skill(),{"offset":offset,"limit":limit},function(data){
			var titles = new Array();
			for(var i = 0; i < data.length; i++)
				titles.push(data[i].subtitle);
			titles.sort();//排序
			$.unique(titles);//去重
			//结构结构
			$("#skill_area").html(function(){
				var str = "<h3>技能</h3>";
				for(var i = 0; i < titles.length;i++){
					str+="<h5>"+titles[i]+"</h5><div class='skill_percent' title='"+titles[i]+"'></div>";
				}
				return str;
			});
			//写入内容
			for(var i = 0; i < data.length; i++){
				$(".skill_percent[title='"+data[i].subtitle+"']").append(function(){
					var str = "<div class='meter "+data[i].color+"'>"+
							"<span style='width: "+data[i].percent+"%'><span>"+data[i].skillName+"</span></span>"+
						"</div>";
					return str;
				});
			}
		});
	},
	//初始化时间轴
	initTimeline : function(offset, limit){
		$.get(v2.URL.timeline(),{"offset":offset,"limit":limit},function(data){
			$("#cd-timeline").append(function(){
				var str = "";
				for(var i = 0; i < data.length;i++){
					str+= "<div class='cd-timeline-block'>"+
					"<div class='cd-timeline-img "+v2.color("timeline",data[i].color)+"'></div>"+
					"<div class='cd-timeline-content'>"+
					"<h2>"+data[i].title+"</h2><hr>"+
					"<p>"+data[i].content+"</p><hr>";
					if(data[i].hasLink == 1){
						str+= "<a href='"+data[i].link+"' class='cd-read-more' target='_blank'>"+data[i].linkText+"</a>";
					}
					str+="<span class='cd-date'>"+new Date(data[i].time).toLocaleString()+"</span></div></div>";
				}
				return str;
			});
		});
	},
	//数据字典
	color : function(type, str){
		if(type=="label"){
			if(str=="blue")
				return "label-info";
			else if(str == "red")
				return "label-danger";
			else if(str == "green"){
				return "label-success";
			}else if(str == "orange"){
				return "label-warning";
			}else if(str == "gray"){
				return "label-default";
			}
		}else if(type=="timeline"){
			if(str=="green")
				return "cd-green";
			else if(str == "red")
				return "cd-red";
			else if(str == "orange"){
				return "cd-orange";
			}
		}
	}
}