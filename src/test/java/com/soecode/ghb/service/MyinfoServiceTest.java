package com.soecode.ghb.service;

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
@ContextConfiguration(
		{"classpath:spring/spring-dao.xml",
		"classpath:spring/spring-service.xml"})
public class MyinfoServiceTest {
	@Autowired
	private MyinfoService myinfoService;
	@Test
	public void testQueryMyinfo() {
		System.out.println(myinfoService.queryMyinfo().toString());
	}

	@Test
	public void testQueryAllResume() {
		List<Resume> rs = myinfoService.queryAllResume(0,10);
		for(Resume r : rs){
			System.out.println(r.toString());
		}
	}

	@Test
	public void testQueryAllSkill() {
		List<Skill> ss = myinfoService.queryAllSkill(0,10);
		for(Skill s : ss){
			System.out.println(s.toString());
		}
	}

	@Test
	public void testQueryAllTimeline() {
		List<Timeline> ts = myinfoService.queryAllTimeline(0,10);
		for(Timeline t : ts){
			System.out.println(t.toString());
		}
	}

}
