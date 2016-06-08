package com.soecode.ghb.dao;

import com.soecode.ghb.entity.Focus;

/**
 * 关注我
 * @author 甘海彬
 *
 */
public interface FocusDao {
	/**
	 * 插入关注
	 * @param focus
	 * @return
	 */
	public int insert(Focus focus);
}
