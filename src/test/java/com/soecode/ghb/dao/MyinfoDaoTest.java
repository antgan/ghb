package com.soecode.ghb.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soecode.ghb.entity.Resume;
import com.soecode.ghb.entity.Skill;
import com.soecode.ghb.entity.Timeline;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class MyinfoDaoTest {
	@Autowired
	MyinfoDao myinfoDao;
	
	@Test
	public void testQueryInfo() {
		System.out.println(myinfoDao.queryInfo().toString());
	}
	
	@Test
	public void testQueryAllResume() {
		List<Resume> rs = myinfoDao.queryAllResume(0,4);
		for(Resume r : rs){
			System.out.println(r.toString());
		}
	}
	
	@Test
	public void testQueryAllSkill() {
		List<Skill> ss = myinfoDao.queryAllSkill(0,4);
		for(Skill s : ss){
			System.out.println(s.toString());
		}
	}
	
	@Test
	public void testQueryAllTimeline() {
		List<Timeline> ts = myinfoDao.queryAllTimeline(0,4);
		for(Timeline t : ts){
			System.out.println(t.toString());
		}
	}

}
