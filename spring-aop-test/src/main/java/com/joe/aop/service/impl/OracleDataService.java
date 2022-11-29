package com.joe.aop.service.impl;

import com.joe.aop.service.DataService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by joker on 2022/11/28.
 */
@Slf4j
@Repository
public class OracleDataService implements DataService {
	Logger logger = LoggerFactory.getLogger(OracleDataService.class);

	@Override
	public void deleteStudent(int id) {
		logger.error("delete student info maintained by oracle");
	}
}
