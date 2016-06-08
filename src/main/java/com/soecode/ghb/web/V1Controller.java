package com.soecode.ghb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.ghb.service.AdviseService;
import com.soecode.ghb.service.FocusService;
import com.soecode.ghb.service.SiteVisitService;

/**
 * V1版本
 * @author 甘海彬
 *
 */
@Controller
@RequestMapping("/v1")
public class V1Controller {
	@Autowired
	private AdviseService adviseService;
	@Autowired
	private FocusService focusService;
	@Autowired
	private SiteVisitService siteVisitService;
	
	@RequestMapping("/site")
	public String pageV1(Model model){
		return "v1";
	}
	
	@RequestMapping("visit")
	public @ResponseBody Long visitNum(){
		return siteVisitService.queryVisit();
	}
	
	@RequestMapping("advise")
	public void focusMe(@RequestParam("advise") String advise, @RequestParam("name") String name , @RequestParam("email") String email,
			HttpServletRequest request, HttpServletResponse response){
		try {
			PrintWriter out = response.getWriter();
			String ip = request.getRemoteAddr();
			adviseService.save(advise, name, email, ip);
			out.print("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("focus")
	public void focusMe(@RequestParam("name") String name , @RequestParam("email") String email,
			HttpServletRequest request, HttpServletResponse response){
		try {
			PrintWriter out = response.getWriter();
			String ip = request.getRemoteAddr();
			focusService.save(name, email, ip);
			out.print("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
