package com.soecode.ghb.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.soecode.ghb.service.SiteVisitService;
import com.soecode.ghb.util.SpringContextUtil;

public class ApplicationFilter implements HandlerInterceptor {
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {
	}
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mav)
			throws Exception {
	}
	/**
	 * 过滤器：
	 * 在所有方法调用之前接受请求进行判断
	 * 返回值有true 不拦截请求  false ：拦截请求
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		HttpSession session = request.getSession();
		//如果session不为空，放行
		if(session.getAttribute("visit_ip")!=null){
			return true;
		}else{//如果session空，访问量+1
			String ip = request.getRemoteAddr();
			SiteVisitService siteVisitService = (SiteVisitService) SpringContextUtil.getBean("siteVisitService");
			long visit = siteVisitService.queryVisitByIp(ip);
			if(visit!=-1){
				siteVisitService.updateVisit(ip);
			}else{
				siteVisitService.insertVisit(ip);
			}
			session.setAttribute("visit_ip", request.getRemoteAddr());
			return true;
		}
	}

}