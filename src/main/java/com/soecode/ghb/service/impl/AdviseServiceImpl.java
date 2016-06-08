package com.soecode.ghb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soecode.ghb.dao.AdviseDao;
import com.soecode.ghb.entity.Advise;
import com.soecode.ghb.service.AdviseService;
/**
 * 建议
 * @author 甘海彬
 *
 */
@Service
public class AdviseServiceImpl implements AdviseService {
	@Autowired
	private AdviseDao adviseDao;
	
	public int save(String advise, String name, String email, String visit_ip) {
		Advise a = new Advise(advise, name, email, visit_ip);
		return adviseDao.insert(a);
	}

}
