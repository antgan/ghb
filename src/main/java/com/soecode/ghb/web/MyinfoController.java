package com.soecode.ghb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.soecode.ghb.entity.Myinfo;
import com.soecode.ghb.service.MyinfoService;

@Controller
@RequestMapping("/myinfo")
public class MyinfoController {
	@Autowired
	private MyinfoService myinfoService;
	
	/**
	 * 查询个人信息
	 * @return
	 */
	@RequestMapping("/queryinfo")
	public @ResponseBody Myinfo queryMyinfo(){
		return myinfoService.queryMyinfo();
	}
	
	
}
