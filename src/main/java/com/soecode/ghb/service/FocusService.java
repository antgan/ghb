package com.soecode.ghb.service;

/**
 * 关注 业务
 * @author 甘海彬
 *
 */
public interface FocusService {
	/**
	 * 保存关注
	 * @param name
	 * @param email
	 * @param visit_ip
	 * @return
	 */
	public int save(String name,String email,String visit_ip);
}
