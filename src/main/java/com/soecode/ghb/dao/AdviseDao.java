package com.soecode.ghb.dao;

import com.soecode.ghb.entity.Advise;

/**
 * 建议 接口 
 * @author 甘海彬
 *
 */
public interface AdviseDao {
	/**
	 * 保存建议
	 * @param advise
	 * @return
	 */
	public int insert(Advise advise);
}
