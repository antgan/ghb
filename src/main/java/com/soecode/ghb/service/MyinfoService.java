package com.soecode.ghb.service;

import java.util.List;

import com.soecode.ghb.entity.Myinfo;
import com.soecode.ghb.entity.Resume;
import com.soecode.ghb.entity.Skill;
import com.soecode.ghb.entity.Timeline;

/**
 * 个人信息 业务处理层
 * @author 甘海彬
 *
 */
public interface MyinfoService {
	/**
	 * 查询个人信息
	 * @return
	 */
	public Myinfo queryMyinfo();
	
	/**
	 * 查询简历主体
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Resume> queryAllResume(int offset,int limit);
	
	/**
	 * 查询技能
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Skill> queryAllSkill(int offset,int limit);
	
	/**
	 * 查询时间轴
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Timeline> queryAllTimeline(int offset,int limit);
}
