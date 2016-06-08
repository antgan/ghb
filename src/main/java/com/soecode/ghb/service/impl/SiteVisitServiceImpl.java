package com.soecode.ghb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soecode.ghb.dao.SiteVisitDao;
import com.soecode.ghb.service.SiteVisitService;
/**
 * 统计业务
 * @author 甘海彬
 *
 */
@Service("siteVisitService")
public class SiteVisitServiceImpl implements SiteVisitService {
	@Autowired
	private SiteVisitDao siteVisitDao;
	public int insertVisit(String visit_ip) {
		return siteVisitDao.insertVisit(visit_ip);
	}

	public int updateVisit(String visit_ip) {
		return siteVisitDao.updateVisit(visit_ip);
	}

	public long queryVisitByIp(String visit_ip) {
		return siteVisitDao.queryVisitByIp(visit_ip);
	}

	public long queryVisit() {
		return siteVisitDao.queryVisit();
	}

}
