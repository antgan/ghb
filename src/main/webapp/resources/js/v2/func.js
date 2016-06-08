/**
 * 事件
 */
//导航栏tab事件
function tab_func(){
	$(".tab").bind("click",function(){
        var clickTab = $(this).children("a").attr("href");
        if(clickTab!="#about"){
            //显示logo
            $("#logo").slideDown();
            if(clickTab=="#resume"){
                cleanDisplay();
                $("#resume").slideDown("slow");
            }
            if(clickTab=="#timeline"){
                cleanDisplay();
                $("#timeline").slideDown("slow");
            }
            if(clickTab=="#contact"){
                cleanDisplay();
                $("#contact").slideDown("slow");
            }
        }else{
            $("#logo").slideUp("slow");
            cleanDisplay();
            $("#about").slideDown("slow");
        }
    })
}

//侧栏按钮事件
function li_func(){
	$("#li-resume").bind("click",function(){
		$("#logo").slideDown();
		cleanDisplay();
        $("#resume").slideDown("slow");
	})
	$("#li-timeline").bind("click",function(){
		$("#logo").slideDown();
		cleanDisplay();
        $("#timeline").slideDown("slow");
	})
	$("#li-contact").bind("click",function(){
		$("#logo").slideDown();
		cleanDisplay();
        $("#contact").slideDown("slow");
	})
}

//隐藏
function cleanDisplay(){
    $("#about").css("display","none");
    $("#resume").css("display","none");
    $("#timeline").css("display","none");
    $("#contact").css("display","none");
}