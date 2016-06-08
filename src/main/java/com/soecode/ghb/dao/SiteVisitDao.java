package com.soecode.ghb.dao;

/**
 * 站点访问统计
 * @author 甘海彬
 *
 */

public interface SiteVisitDao {
	/**
	 * 插入访问记录
	 * @param visit_ip
	 * @param visit
	 * @return
	 */
	public int insertVisit(String visit_ip);
	
	/**
	 * 访问人数+1
	 * @param visit_ip
	 * @param visit
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
