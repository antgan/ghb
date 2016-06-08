package com.soecode.ghb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.soecode.ghb.entity.Myinfo;
import com.soecode.ghb.entity.Resume;
import com.soecode.ghb.entity.Skill;
import com.soecode.ghb.entity.Timeline;

/**
 * 个人信息 DAO
 * @author 甘海彬
 *
 */
public interface MyinfoDao {
	/**
	 * 查询个人信息
	 * @return MyinfoEntity
	 */
	public Myinfo queryInfo();
	
	/**
	 * 查询所有简历主体
	 * @return
	 */
	public List<Resume> queryAllResume(@Param("offset") int offset,@Param("limit") int limit);
	
	/**
	 * 查询所有技能
	 * @return
	 */
	public List<Skill> queryAllSkill(@Param("offset") int offset,@Param("limit") int limit);
	
	/**
	 * 查询所有时间轴
	 * @return
	 */
	public List<Timeline> queryAllTimeline(@Param("offset") int offset,@Param("limit") int limit);
}
