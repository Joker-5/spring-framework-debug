package com.joe.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/25.
 */
@Service
public class LightMgrService {
	private LightService lightService;

	public LightMgrService(LightService lightService) {
		this.lightService = lightService;
		lightService.check();
	}
}
