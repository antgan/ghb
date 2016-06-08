package com.soecode.ghb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 万能编码过滤器
 * @author 甘海彬
 *
 */
public class SetCharacterEncodingFilter implements Filter{
	private String encode=null;
	
	/*
	 * 初始化参数，从配置文件中取出设置的编码格式
	 */
	public void init(FilterConfig config) throws ServletException {
		this.encode = config.getInitParameter("encode");
	}
	
	/*
	 * 处理业务--改成配置文件内的编码格式
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(this.encode!=null && !this.encode.equals("")){
			request.setCharacterEncoding(encode);
			response.setCharacterEncoding(encode);
		}else{
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		}
		chain.doFilter(request, response);
		
	}
	
	/**
	 * 销毁
	 */
	public void destroy() {
		
	}
}
