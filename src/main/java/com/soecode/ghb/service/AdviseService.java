package com.soecode.ghb.service;

/**
 * 建议业务
 * @author 甘海彬
 *
 */
public interface AdviseService {
	/**
	 * 保存建议
	 * @param advise
	 * @param name
	 * @param email
	 * @param visit_ip
	 * @return
	 */
	public int save(String advise, String name,String email,String visit_ip);
}
