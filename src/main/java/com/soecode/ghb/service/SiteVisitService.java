package com.soecode.ghb.service;

/**
 * 站长访问统计
 * @author 甘海彬
 *
 */
public interface SiteVisitService {
	/**
	 * 插入访问记录
	 * @param visit_ip
	 * @return
	 */
	public int insertVisit(String visit_ip);
	/**
	 * 更新访问记录
	 * @param visit_ip
	 * @return
	 */
	public int updateVisit(String visit_ip);
	
	/**
	 * 查询访问量
	 * @param visit_ip
	 * @return
	 */
	public long queryVisitByIp(String visit_ip);
	
	/**
	 * 查询总访问量
	 * @return
	 */
	public long queryVisit() ;
}
