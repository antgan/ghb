package com.soecode.ghb.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soecode.ghb.entity.Advise;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AdviseDaoTest {
	@Autowired
	private AdviseDao adviseDao;
	@Test
	public void testSave() {
		Advise a = new Advise("1", "ant", "ghb", "1.1.1.1");
		adviseDao.insert(a);
	}

}
