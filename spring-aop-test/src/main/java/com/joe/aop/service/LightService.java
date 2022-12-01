package com.joe.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/25.
 */
//@Service
public class LightService {
	Logger logger = LoggerFactory.getLogger(LightService.class);

	public void start() {
		logger.error("turn on all lights");
	}

	public void shutdown() {
		logger.error("turn off all lights");
	}

	public void check() {
		logger.error("check all lights");
	}
}
