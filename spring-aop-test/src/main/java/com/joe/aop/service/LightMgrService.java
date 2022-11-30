package com.joe.aop.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/25.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Service
public class LightMgrService implements InitializingBean {
	@Autowired
	private LightService lightService;

	@Override
	public void afterPropertiesSet() throws Exception {
		lightService.check();
	}
}
