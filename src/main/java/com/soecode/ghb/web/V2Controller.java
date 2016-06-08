package com.soecode.ghb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.ghb.entity.Resume;
import com.soecode.ghb.entity.Skill;
import com.soecode.ghb.entity.Timeline;
import com.soecode.ghb.service.MyinfoService;

/**
 * V2
 * @author 甘海彬
 *
 */
@Controller
@RequestMapping("/v2")
public class V2Controller {
	@Autowired 
	private MyinfoService myinfoService;
	
	@RequestMapping("/site")
	public String pageV2(Model model){
		model.addAttribute("myinfo", myinfoService.queryMyinfo());
		return "v2";
	}
	
	/**
	 * 查询简历主体
	 * @param offset
	 * @param limit
	 * @return
	 */
	@RequestMapping("/queryResume")
	public @ResponseBody List<Resume> queryAllResume(@RequestParam("offset") int offset, @RequestParam("limit") int limit){
		return myinfoService.queryAllResume(offset, limit);
	}
	
	/**
	 * 查询技能
	 * @param offset
	 * @param limit
	 * @return
	 */
	@RequestMapping("querySkill")
	public @ResponseBody List<Skill> queryAllSkill(@RequestParam("offset") int offset, @RequestParam("limit") int limit){
		return myinfoService.queryAllSkill(offset, limit);
	}
	
	/**
	 * 查询时间轴
	 * @param offset
	 * @param limit
	 * @return
	 */
	@RequestMapping("queryTimeline")
	public @ResponseBody List<Timeline> queryAllTimeline(@RequestParam("offset") int offset, @RequestParam("limit") int limit){
		return myinfoService.queryAllTimeline(offset, limit);
	}
}
