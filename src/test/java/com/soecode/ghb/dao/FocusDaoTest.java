package com.soecode.ghb.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soecode.ghb.entity.Focus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FocusDaoTest {
	@Autowired
	private FocusDao focusDao;
	@Test
	public void testInsert() {
		Focus focus = new Focus();
		focus.setEmail("abg");
		focus.setVisit_ip("1.1.1.1");
		focus.setName("ant");
		focusDao.insert(focus);
	}

}
