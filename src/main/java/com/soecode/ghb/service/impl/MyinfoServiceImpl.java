package com.soecode.ghb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soecode.ghb.dao.MyinfoDao;
import com.soecode.ghb.entity.Myinfo;
import com.soecode.ghb.entity.Resume;
import com.soecode.ghb.entity.Skill;
import com.soecode.ghb.entity.Timeline;
import com.soecode.ghb.service.MyinfoService;


@Service
public class MyinfoServiceImpl implements MyinfoService {
	@Autowired
	private MyinfoDao myinfoDao;
	
	/**
	 * 查询个人信息
	 */
	public Myinfo queryMyinfo() {
		return myinfoDao.queryInfo();
	}
	
	/**
	 * 查询简历主体
	 */
	public List<Resume> queryAllResume(int offset, int limit) {
		return myinfoDao.queryAllResume(offset, limit);
	}
	
	/**
	 * 查询技能
	 */
	public List<Skill> queryAllSkill(int offset, int limit) {
		return myinfoDao.queryAllSkill(offset, limit);
	}
	
	/**
	 * 时间轴
	 */
	public List<Timeline> queryAllTimeline(int offset, int limit) {
		return myinfoDao.queryAllTimeline(offset, limit);
	}
}
