package com.soecode.ghb.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SiteVisitDaoTest {
	@Autowired
	private SiteVisitDao siteVisitDao;
	
	@Test
	public void testInsertVisit() {
		siteVisitDao.insertVisit("1.1.1.1");
	}
	
	@Test
	public void testUpdateVisit() {
		siteVisitDao.updateVisit("1.1.1.1");
	}

	@Test
	public void testQueryVisitByIp() {
		System.out.println(siteVisitDao.queryVisitByIp("14.118.136.40"));
	}

	@Test
	public void testQueryVisit() {
		System.out.println(siteVisitDao.queryVisit());
	}

}
