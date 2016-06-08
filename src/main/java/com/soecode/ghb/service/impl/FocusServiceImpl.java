package com.soecode.ghb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soecode.ghb.dao.FocusDao;
import com.soecode.ghb.entity.Focus;
import com.soecode.ghb.service.FocusService;
@Service
public class FocusServiceImpl implements FocusService {
	@Autowired
	private FocusDao focusDao;
	
	public int save(String name, String email, String visit_ip) {
		Focus focus = new Focus(name, email, visit_ip);
		return focusDao.insert(focus);
	}

}
